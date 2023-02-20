class CoffeeWithMilk extends Coffee {
  override def price(): Double = {
    val coffee: Coffee = new Coffee(List( new Milk))
    coffee.totalPrice()
  }
}
