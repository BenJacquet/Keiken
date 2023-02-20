class Tea (complement: List[Complement]  = List.empty) extends Beverage(complement) {
  override def price(): Double = 1.5
}
