class CoffeeWithMilkAndCream extends Coffee {
  override def price(): Double = {
    val coffee: Coffee = new Coffee(List( new Milk, new Cream))
    coffee.totalPrice()
  }
}
