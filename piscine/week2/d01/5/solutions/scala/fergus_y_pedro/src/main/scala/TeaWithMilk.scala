class TeaWithMilk extends Tea {
  override def price(): Double = {
    val tea: Tea = new Tea(List( new Milk))
    tea.totalPrice()
  }
}
