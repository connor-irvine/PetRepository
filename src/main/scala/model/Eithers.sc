import scala.annotation.tailrec

def toIntEither(n : String) : Either[String, Int] = {
  try {
    Right(n.toInt)
  } catch {
    case _: Exception => Left(s"Could not represent '$n' as a number")
  }
}

toIntEither("2")

toIntEither("two") match {
  case Left(s) => s
  case Right(i) => i
}

val handled = toIntEither("2"). fold(
  l => {
  ""
},
r => {
  ""
}
)



def sum(nums: List[Int]) : Int = {
  nums match {
    case Nil=> 0
    case h :: tail => h + sum(tail)
  }
}

//val oneTo10000 = List.range(0, 10000)
//sum(oneTo10000)

//Throws slack overflow exception


def sumTailRecursive (nums : List[Int]) : Int = {

  @tailrec
  def sumHelper(tail: List[Int], accum: Int): Int = {


    tail match {
      case Nil => accum
      case h :: tail => sumHelper(tail, accum + h)
    }
  }
  sumHelper(nums, 0)

}
/** EXAMPLE ABOVE IS TAIL RECURSIVE **/

case class Person(name : String)

def filter(p : List[Person], f : Person => Boolean) : List[Person] = {

  @tailrec
  def filter(t: List[Person], acc: List[Person]): List[Person] = {
    t match {
      case Nil => acc
      case h :: tail =>
        if (f(h)) {
          filter(tail, h :: acc)
        } else {
          filter(tail, acc)
        }
    }
  }

  filter(p, Nil)
}
  val people = List(Person("Adam"), Person("Michael"), Person("Connor"), Person("Adam"), Person("Doug"), Person("Matty"))

filter(people, x => x.name == "Adam")