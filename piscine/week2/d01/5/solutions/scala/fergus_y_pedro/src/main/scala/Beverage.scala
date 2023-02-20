abstract class Beverage(complements: List[Complement]) {
  lazy val rules: List[Boolean] = List.empty


  if(rules.forall(p => p == true)){
    println("entra en la evaluacion de condiciones")
    throw new ExceptionInInitializerError("arg 1 was wrong...")
  }

  def price(): Double
  def totalPrice(): Double = price() + complements.foldLeft(0.0){ (acc: Double, complement: Complement) => acc + complement.price():Double}
}