import scala.collection.mutable.ArrayBuffer


class PetApp {

  private val Pet = new ArrayBuffer[PetApp]()
  def all() : List[PetApp] = Nil
  def findByName(name : String) : Option[PetApp] = None
  def dogs() : List[PetApp] = Nil
  def cats() : List[PetApp] = Nil
  def other() : List[PetApp] = Nil
  def add(petApp: PetApp*) : List[PetApp]
  def removeByName(name : String) : List[PetApp]
  def update(petApp: PetApp) : List[PetApp]
}
