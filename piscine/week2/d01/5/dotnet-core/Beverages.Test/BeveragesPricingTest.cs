using Xunit;

namespace Beverages.Test
{
    public class BeveragesPricingTest
    {
        [Fact]
        public void ComputesCoffeePrice()
        {
            var coffee = new Coffee();
            Assert.Equal(1.20, coffee.Price(), 3);
        }

        [Fact]
        public void ComputesTeaPrice()
        {
            var tea = new Tea();
            Assert.Equal(1.50, tea.Price(), 3);
        }

        [Fact]
        public void ComputesHotChocolatePrice()
        {
            var hotChocolate = new HotChocolate();
            Assert.Equal(1.45, hotChocolate.Price(), 3);
        }

        [Fact]
        public void ComputesTeaWithMilkPrice()
        {
            var teaWithMilk = new TeaWithMilk();
            Assert.Equal(1.60, teaWithMilk.Price(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithMilkPrice()
        {
            var coffeeWithMilk = new CoffeeWithMilk();
            Assert.Equal(1.30, coffeeWithMilk.Price(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithMilkAndCreamPrice()
        {
            var coffeeWithMilkAndCream = new CoffeeWithMilkAndCream();
            Assert.Equal(1.45, coffeeWithMilkAndCream.Price(), 3);
        }

        [Fact]
        public void ComputesHotChocolateWithCreamPrice()
        {
            var hotChocolateWithCream = new HotChocolateWithCream();
            Assert.Equal(1.60, hotChocolateWithCream.Price(), 3);
        }
    }
}
