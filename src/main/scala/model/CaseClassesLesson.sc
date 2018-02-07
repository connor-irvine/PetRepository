

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

sealed trait Pet{
  val name : String
}
case class Dog(name : String) extends Pet{
  def speak =  "woof!"
}
case class Cat(name : String) extends Pet{
  def speak = "meow!"
}
def isDog(pet: Pet) : String = pet match {
  case d : Dog => s"${d.name} I am a dog, ${d.speak}"
  case c : Cat => s"${c.name} I am a cat, ${c.speak}"
  case _ => "Something else"
}
isDog(Dog("Toblerone"))
isDog(Cat("Garfield"))