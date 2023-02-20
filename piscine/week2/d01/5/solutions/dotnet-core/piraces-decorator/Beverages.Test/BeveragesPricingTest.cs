using Beverages.Factories;
using Xunit;

namespace Beverages.Test
{
    public class BeveragesPricingTest
    {
        [Fact]
        public void ComputesCoffeePrice()
        {
            var coffee = BeverageFactory.CreateCoffee();
            Assert.Equal(1.20, coffee.Price(), 3);
        }

        [Fact]
        public void ComputesTeaPrice()
        {
            var tea = BeverageFactory.CreateTea();
            Assert.Equal(1.50, tea.Price(), 3);
        }

        [Fact]
        public void ComputesHotChocolatePrice()
        {
            var hotChocolate = BeverageFactory.CreateHotChocolate();
            Assert.Equal(1.45, hotChocolate.Price(), 3);
        }

        [Fact]
        public void ComputesTeaWithMilkPrice()
        {
            var teaWithMilk = BeverageFactory.CreateTeaWithMilk();
            Assert.Equal(1.60, teaWithMilk.Price(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithMilkPrice()
        {
            var coffeeWithMilk = BeverageFactory.CreateCoffeeWithMilk();
            Assert.Equal(1.30, coffeeWithMilk.Price(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithMilkAndCreamPrice()
        {
            var coffeeWithMilkAndCream =
                BeverageFactory.CreateCoffeeWithMilkAndCream();
            Assert.Equal(1.45, coffeeWithMilkAndCream.Price(), 3);
        }

        [Fact]
        public void ComputesHotChocolateWithCreamPrice()
        {
            var hotChocolateWithCream =
                BeverageFactory.CreateHotChocolateWithCream();
            Assert.Equal(1.60, hotChocolateWithCream.Price(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithCinnamonPrice()
        {
            var coffee = BeverageFactory.CreateCoffeeWithCinnamon();
            Assert.Equal(1.25, coffee.Price(), 3);
        }

        [Fact]
        public void ComputesTeaWithCinnamonPrice()
        {
            var tea = BeverageFactory.CreateTeaWithCinnamon();
            Assert.Equal(1.55, tea.Price(), 3);
        }

        [Fact]
        public void ComputesHotChocolateWithCinnamonPrice()
        {
            var hotChocolate =
                BeverageFactory.CreateHotChocolateWithCinnamon();
            Assert.Equal(1.50, hotChocolate.Price(), 3);
        }

        [Fact]
        public void ComputesTeaWithMilkAndCinnamonPrice()
        {
            var teaWithMilk =
                BeverageFactory.CreateTeaWithMilkAndCinnamon();
            Assert.Equal(1.65, teaWithMilk.Price(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithMilkAndCinnamonPrice()
        {
            var coffeeWithMilk =
                BeverageFactory.CreateCoffeeWithMilkAndCinnamon();
            Assert.Equal(1.35, coffeeWithMilk.Price(), 3);
        }

        [Fact]
        public void ComputesCoffeeWithMilkCreamAndCinnamonPrice()
        {
            var coffeeWithMilkAndCream =
                BeverageFactory.CreateCoffeeWithMilkCreamAndCinnamon();
            Assert.Equal(1.50, coffeeWithMilkAndCream.Price(), 3);
        }

        [Fact]
        public void ComputesHotChocolateWithCreamAndCinnamonPrice()
        {
            var hotChocolateWithCream =
                BeverageFactory.CreateHotChocolateWithCreamAndCinnamon();
            Assert.Equal(1.65, hotChocolateWithCream.Price(), 3);
        }
    }
}
