

def double(int: Int) = int * 2

val num : Int = 21

num match {
  case 1 => {
    double(num)
  }
  case 2 => "two"
  case _ => double(num * 2)
}

val v2 = (1, 5)
v2 match {
  case (1, num2) =>
    double (v2._1 * num2 )
  case (2, _) => "two"
  case _ => double(v2._1 * 2)
}

def isListEmpty(list: List[Int]) = list match {
  case Nil => true
  case h :: tail if h == 2 =>
    false
  case _ => false
}

val numbers = List(1, 2, 3)
isListEmpty(numbers)

//sealed trait Pet{
//  val name : String
//  def speak() : String = "hello"
//}
//final case class Dog(override val name : String) extends Pet{
//  override def speak(): String = "woof!"
//}
//final case class Cat(override val name : String) extends Pet{
//  override def speak(): String = "meow!"
//}
//def whoDis(pet: Pet) = {
//  pet match {
//    case Dog(name)=> s"This is a dog called $name"
//    case Cat(name)=> s"This is a cal called $name"
//  }
//}