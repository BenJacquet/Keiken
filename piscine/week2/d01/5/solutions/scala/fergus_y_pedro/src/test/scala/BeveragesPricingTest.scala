import org.scalatest.FunSuite
import org.scalatest.Matchers._


class BeveragesPricingTest extends FunSuite {

  test("computes coffee price"){
    val coffee = new Coffee
    coffee.price() should be (1.20 +- 0.0001)
  }

  test("computes tea price"){
    val tea = new Tea
    tea.price() should be (1.50 +- 0.0001)
  }

  test("computes hot chocolate price"){
    val hotChocolate = new HotChocolate
    hotChocolate.price() should be (1.45 +- 0.0001)
  }

  test("computes tea with milk price"){
    val teaWithMilk = new TeaWithMilk
    teaWithMilk.price() should be (1.60 +- 0.0001)
  }

  test("computes coffee with milk price"){
    val coffeeWithMilk = new CoffeeWithMilk
    coffeeWithMilk.price() should be (1.30 +- 0.0001)
  }

  test("computes coffee with milk and cream price"){
    val coffeeWithMilkAndCream = new CoffeeWithMilkAndCream
    coffeeWithMilkAndCream.price() should be (1.45 +- 0.0001)
  }

  test("computes hot chocolate with cream price"){
    val hotChocolateWithCream = new HotChocolateWithCream
    hotChocolateWithCream.price() should be (1.60 +- 0.0001)
  }

  test("computes coffee with canela"){
    val coffee: Coffee = new Coffee(List(new Cinnamon))
    coffee.totalPrice() should be (1.25 +- 0.0001)
  }

  test("computes coffee with milk and canela"){
    val coffee: Coffee = new Coffee(List( new Cinnamon, new Milk))
    coffee.totalPrice() should be (1.35 +- 0.0001)
  }

  test("computes coffee with milk, cream and canela"){
    val coffee: Coffee = new Coffee(List( new Cinnamon, new Milk, new Cream))
    coffee.totalPrice() should be (1.50 +- 0.0001)
  }

  test("computes coffee with cream "){
    assertThrows[ExceptionInInitializerError] {
      new Coffee(List( new Cream))
    }
  }
}
