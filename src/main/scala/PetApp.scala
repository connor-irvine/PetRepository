import models.Pet

import scala.collection.mutable.ArrayBuffer


object PetApp extends App {

  private val Pet = new ArrayBuffer[Pet]()
  def all() : List[Pet] = Nil
  def findByName(name : String) : Option[Pet] = None
  def dogs() : List[Pet] = Nil
  def cats() : List[Pet] = Nil
  def other() : List[Pet] = Nil
  def add(pet: Pet*) : List[Pet] = Nil
  def removeByName(name : String) : List[Pet] = Nil
  def update(petApp: Pet) : List[Pet] = Nil
}
