using Beverages.Classes.Beverages;
using Beverages.Interfaces.Beverages;

namespace Beverages.Classes.Supplements
{
    public class Cinnamon : Drink
    {
        public Cinnamon() : base() { }
        public Cinnamon(Beverage drink) : base(drink) { }

        protected override double DrinkPrice()
        {
            return 0.05;
        }
    }
}
