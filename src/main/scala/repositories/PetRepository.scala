package repositories

import model.Pet

import scala.collection.mutable.ArrayBuffer

object PetRepository {

  private val _pet : ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all() : List[Pet] = _pet.toList

  def findByName(name : String) : Option[Pet] = { None
    //_pet.find(pet => pet.name == name)
  }

  def dogs() : List[Pet] = Nil
  def cats() : List[Pet] = Nil
  def other() : List[Pet] = Nil

  def add(pet: Pet*) : List[Pet] = {
    pet.foreach(p => _pets.+=(p))
    all()
  }

  def removeByName(name : String) : List[Pet] = Nil
  def update(petApp: Pet) : List[Pet] = Nil

}
