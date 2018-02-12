package repositories

import model.{Cat, Dog, Pet}

import scala.collection.mutable.ArrayBuffer

object PetRepository {

  private val _pet : ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all() : List[Pet] = _pet.toList

  def findByName(name : String) : Option[Pet] = { None
    _pet.find(pet => pet.name == name)
  }

  def dogs() : List[Dog] = {
 _pet.toList.flatMap {
  case d @ Dog(_)  =>
    Some (d)
  case _ =>  None
}
  }

  def cats() :	List[Cat]	=	{
    _pet.toList.flatMap	{
      case	c	@	Cat(_)	=>
        Some(c)
      case	_	=>	None
    }
  }

  def add(pet: Pet*) : List[Pet] = {
    pet.foreach(p => _pet.+=(p))
    all()
  }

  def removeByName(name : String) : List[Pet] = Nil
  def update(petApp: Pet) : List[Pet] = Nil

}
