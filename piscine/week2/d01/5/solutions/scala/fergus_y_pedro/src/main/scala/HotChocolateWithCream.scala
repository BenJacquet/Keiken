class HotChocolateWithCream extends HotChocolate {
  override def price(): Double = {
    val chocolate: HotChocolate = new HotChocolate(List( new Cream))
    chocolate.totalPrice()
  }
}
