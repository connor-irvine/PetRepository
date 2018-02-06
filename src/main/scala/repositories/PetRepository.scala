package repositories

import model.Pet

import scala.collection.mutable.ArrayBuffer

object PetRepository {

  private val _pet = new ArrayBuffer[Pet]()

  def all() : List[Pet] = _pet.toList

  def findByName(name : String) : Option[Pet] = {
    
  }

  def dogs() : List[Pet] = Nil
  def cats() : List[Pet] = Nil
  def other() : List[Pet] = Nil
  def add(pet: Pet*) : List[Pet] = Nil
  def removeByName(name : String) : List[Pet] = Nil
  def update(petApp: Pet) : List[Pet] = Nil

}
