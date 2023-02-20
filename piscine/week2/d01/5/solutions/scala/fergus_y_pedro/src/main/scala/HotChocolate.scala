class HotChocolate (complement: List[Complement]  = List.empty) extends Beverage(complement) {
  override def price(): Double = 1.45
}
