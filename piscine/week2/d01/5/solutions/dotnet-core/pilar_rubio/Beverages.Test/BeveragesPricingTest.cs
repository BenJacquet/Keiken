using Xunit;

namespace Beverages.Test
{
    public class BeveragesPricingTest
    {
        private ISupplement _supplement;

        public BeveragesPricingTest()
        {
            _supplement = new Supplement();
        }

        [Fact]
        public void ComputesCoffeePrice()
        {
            var coffee = new Coffee(_supplement);
            Assert.Equal(1.20, coffee.Price(), 3);
        }

        [Fact]
        public void ComputesTeaPrice()
        {
            var tea = new Tea(_supplement);
            Assert.Equal(1.50, tea.Price(), 3);
        }

        [Fact]
        public void ComputesHotChocolatePrice()
        {
            var hotChocolate = new HotChocolate(_supplement);
            Assert.Equal(1.45, hotChocolate.Price(), 3);
        }

        [Fact]
        public void ComputesTeaWithMilkPrice()
        {
            var teaWithMilk = new Tea(_supplement);
            Assert.Equal(1.60, teaWithMilk.PriceWithMilk(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithMilkPrice()
        {
            var coffeeWithMilk = new Coffee(_supplement);
            Assert.Equal(1.30, coffeeWithMilk.PriceWithMilk(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithMilkAndCreamPrice()
        {
            var coffeeWithMilkAndCream = new Coffee(_supplement);
            Assert.Equal(1.45, coffeeWithMilkAndCream.PriceWithMilkAndCream(), 3);
        }

        [Fact]
        public void ComputesHotChocolateWithCreamPrice()
        {
            var hotChocolateWithCream = new HotChocolate(_supplement);
            Assert.Equal(1.60, hotChocolateWithCream.PriceWithCream(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithCinnamonPrice()
        {
            var coffeeWithCinammon = new Coffee(_supplement);
            Assert.Equal(1.25, coffeeWithCinammon.PriceWithCinnamon(), 3);
        }
    }
}
