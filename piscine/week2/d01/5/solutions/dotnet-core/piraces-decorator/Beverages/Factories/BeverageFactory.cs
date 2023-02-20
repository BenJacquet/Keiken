using Beverages.Classes.Beverages;
using Beverages.Classes.Supplements;
using Beverages.Interfaces.Beverages;
using static Beverages.Classes.Beverages.Drink;

namespace Beverages.Factories
{
    public class BeverageFactory
    {

        public static Beverage CreateCoffee()
        {
            return new Coffee();
        }

        public static Beverage CreateCoffeeWithCinnamon() {
            return new Coffee(new Cinnamon());
        }

        public static Beverage CreateCoffeeWithMilk() {
            return new Coffee(new Milk());
        }

        public static Beverage CreateCoffeeWithMilkAndCinnamon() {
            return new Coffee(new Milk(With(new Cinnamon())));
        }

        public static Beverage CreateCoffeeWithMilkAndCream() {
            return new Coffee(new Milk(With(new Cream())));
        }

        public static Beverage CreateCoffeeWithMilkCreamAndCinnamon() {
            return new Coffee(new Milk(With(new Cream(With(new Cinnamon())))));
        }

        public static Beverage CreateHotChocolate() {
            return new HotChocolate();
        }

        public static Beverage CreateHotChocolateWithCinnamon() {
            return new HotChocolate(new Cinnamon());
        }

        public static Beverage CreateHotChocolateWithCream() {
            return new HotChocolate(new Cream());
        }

        public static Beverage CreateHotChocolateWithCreamAndCinnamon() {
            return new HotChocolate(new Cream(With(new Cinnamon())));
        }

        public static Beverage CreateTea() {
            return new Tea();
        }

        public static Beverage CreateTeaWithCinnamon() {
            return new Tea(new Cinnamon());
        }

        public static Beverage CreateTeaWithMilk() {
            return new Tea(new Milk());
        }

        public static Beverage CreateTeaWithMilkAndCinnamon() {
            return new Tea(new Milk(With(new Cinnamon())));
        }
    }
}
