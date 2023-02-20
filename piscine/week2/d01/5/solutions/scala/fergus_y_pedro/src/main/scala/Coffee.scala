class Coffee(complement: List[Complement]  = List.empty) extends Beverage(complement) {
  override lazy val rules: List[Boolean] = List(
    (complement.size == 1 && complement(0).isInstanceOf[Cream])
  )


  override def price(): Double = 1.2
}
