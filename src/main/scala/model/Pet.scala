package model


trait Pet {
  val name: String
}

trait Talking {
  def talk: String
}

trait Woof extends Talking {
  override def talk: String = "woof"
}

trait Meow extends Talking {
  override def talk: String = "meow"
}

final case class Dog(override val name: String) extends Pet with Talking with Woof

final case  class Cat(override val name: String) extends Pet with Talking with Meow
