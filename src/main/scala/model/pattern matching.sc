abstract class Blaster{
  def launch : String
}
final case class FalconHeavy extends Blaster {
  override def launch = "Launching the falcon heavy"

  def hasTeslaAttached : Boolean = true
}
final case class PewPew extends Blaster {
  override def launch = "PewPew die"
}
case class RocketShip(blasters: List[Blaster])

val rs = RocketShip(List(new FalconHeavy(), new FalconHeavy()))


rs match{
  case RocketShip(Nil) =>
  case RocketShip(h :: tail) =>
      h.
  case RocketShip(List( h @ FalconHeavy(), t @ FalconHeavy())) =>
    h.hasTeslaAttached
}