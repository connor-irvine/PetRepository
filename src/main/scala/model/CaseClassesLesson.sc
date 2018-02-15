import model.Cat
import repositories.PetRepository._pet

//def double(int: Int) = int * 2
//
//val num : Int = 21
//
//num match {
//  case 1 => {
//    double(num)
//  }
//  case 2 => "two"
//  case _ => double(num * 2)
//}
//
//val v2 = (1, 5)
//v2 match {
//  case (1, num2) =>
//    double (v2._1 * num2 )
//  case (2, _) => "two"
//  case _ => double(v2._1 * 2)
//}
//
//def isListEmpty(list: List[Int]) = list match {
//  case Nil => true
//  case h :: tail if h == 2 =>
//    false
//  case _ => false
//}
//
//val numbers = List(1, 2, 3)
//isListEmpty(numbers)

sealed trait Pet{
  val name : String
  val age : Int
}
case class Dog(name : String, age : Int) extends Pet{
  def speak =  "woof!"
}
case class Cat(name : String, age : Int) extends Pet{
  def speak = "meow!"
}
def isDog(pet: Pet) : String = pet match {
  case d : Dog => s"${d.name} I am a dog, ${d.speak}"
  case c : Cat => s"${c.name} I am a cat, ${c.speak}"
  case _ => "Something else"
}
isDog(Dog("Toblerone", 12))
isDog(Cat("Garfield", 2))

def determineAgeOfPet(pet : Pet) = pet match {
  case Dog(name, age) if name == "Storm" => s"$name is {$age*7} years old"
  case Cat(name, age) => s"$name is $age years old"
  case Dog(name, _) => s"I'm too old for this, I'm $name"
}

determineAgeOfPet(Dog("Toberlone", 12))
determineAgeOfPet(Cat("Garfield", 6))

//def intMap(list: List[Int], f: Int => Int): List[Int] = {
//  if (list != Nil) {
//    f(list.head) :: intMap(list.tail, f)
//  } else {
//    list
//  }
//}
//
//def intMap2(list: List[Int], f: Int => Int): List[Int] = {
//  list match {
//    case Nil => list
//    case head :: tail => f(head) :: intMap2(tail, f)
//  }
//}
//
//val list = List(1,2,3)
//val double = (x: Int) => x * 2
//
//list.map(double)
//intMap(list, double)
//intMap2(list, double)
