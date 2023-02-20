using Beverages.Classes.Supplements;
using Beverages.Interfaces.Beverages;

namespace Beverages.Classes.Beverages
{
    public class Drink : Beverage
    {
        private Beverage _drink;

        public Drink() => _drink = new NoExtra();

        public Drink(Beverage drink) => _drink = drink;

        public static Drink With(Beverage beverage) => new Drink(beverage);

        public double Price() => _drink.Price() + DrinkPrice();

        protected virtual double DrinkPrice() => 0.0;
    }
}
