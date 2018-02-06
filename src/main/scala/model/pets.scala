 package App.models
  object Pets extends App{
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
      override def talk : String = "meow"
    }
    final class Dog(override val name: String) extends Pet with Talking with Woof
    final class Cat (override val name : String) extends Pet with Talking with Meow
    val pets : List[Pet with Talking] = List( new Dog ("Lassie"),
      new Cat("Anna")
    )
    pets.foreach(p => println(p.talk))
  }

}
