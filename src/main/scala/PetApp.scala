import model.{Cat, Dog}
import repositories.PetRepository


object PetApp extends App {

  //Instantiate PetRepository
  //Call all() on repo
 val pets = PetRepository.all()
  println(pets)

  val d1 = new Dog("Toblerone")
  //Add Pets
  PetRepository.add(d1)

  val c1 = new Cat("Garfield")
  PetRepository.add(c1)

  // Remove Pets

 //list all() pets in repo
  val p2 = PetRepository.all()
  println(p2)

 val d2 = new Dog("Bailey")
 PetRepository.add(d2)

 val c2 = new Cat("Mog")
 PetRepository.add(c2)
}
