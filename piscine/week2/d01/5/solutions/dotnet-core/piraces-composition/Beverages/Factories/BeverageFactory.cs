using Beverages.Enums;

namespace Beverages.Factories
{
    public class BeverageFactory
    {

        public static Beverage CreateCoffee()
        {
            return new Beverage(1.2);
        }

        public static Beverage CreateCoffeeWithCinnamon()
        {
            var beverage = new Beverage(1.2);
            beverage.AddSupplementType(SupplementType.Cinnamon, 0.05);
            return beverage;
        }

        public static Beverage CreateCoffeeWithMilk()
        {
            var beverage = new Beverage(1.2);
            beverage.AddSupplementType(SupplementType.Milk, 0.10);
            return beverage;
        }

        public static Beverage CreateCoffeeWithMilkAndCinnamon()
        {
            var beverage = new Beverage(1.2);
            beverage.AddSupplementType(SupplementType.Milk, 0.10);
            beverage.AddSupplementType(SupplementType.Cinnamon, 0.05);
            return beverage;
        }

        public static Beverage CreateCoffeeWithMilkAndCream()
        {
            var beverage = new Beverage(1.2);
            beverage.AddSupplementType(SupplementType.Milk, 0.10);
            beverage.AddSupplementType(SupplementType.Cream, 0.15);
            return beverage;
        }

        public static Beverage CreateCoffeeWithMilkCreamAndCinnamon()
        {
            var beverage = new Beverage(1.2);
            beverage.AddSupplementType(SupplementType.Milk, 0.10);
            beverage.AddSupplementType(SupplementType.Cream, 0.15);
            beverage.AddSupplementType(SupplementType.Cinnamon, 0.05);
            return beverage;
        }

        public static Beverage CreateHotChocolate()
        {
            return new Beverage(1.45);
        }

        public static Beverage CreateHotChocolateWithCinnamon()
        {
            var beverage = new Beverage(1.45);
            beverage.AddSupplementType(SupplementType.Cinnamon, 0.05);
            return beverage;
        }

        public static Beverage CreateHotChocolateWithCream()
        {
            var beverage = new Beverage(1.45);
            beverage.AddSupplementType(SupplementType.Cream, 0.15);
            return beverage;
        }

        public static Beverage CreateHotChocolateWithCreamAndCinnamon()
        {
            var beverage = new Beverage(1.45);
            beverage.AddSupplementType(SupplementType.Cream, 0.15);
            beverage.AddSupplementType(SupplementType.Cinnamon, 0.05);
            return beverage;
        }

        public static Beverage CreateTea()
        {
            return new Beverage(1.5);
        }

        public static Beverage CreateTeaWithCinnamon()
        {
            var beverage = new Beverage(1.5);
            beverage.AddSupplementType(SupplementType.Cinnamon, 0.05);
            return beverage;
        }

        public static Beverage CreateTeaWithMilk()
        {
            var beverage = new Beverage(1.5);
            beverage.AddSupplementType(SupplementType.Milk, 0.10);
            return beverage;
        }

        public static Beverage CreateTeaWithMilkAndCinnamon()
        {
            var beverage = new Beverage(1.5);
            beverage.AddSupplementType(SupplementType.Milk, 0.10);
            beverage.AddSupplementType(SupplementType.Cinnamon, 0.05);
            return beverage;
        }
    }
}
