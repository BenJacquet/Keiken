using Beverages.Classes.Beverages;
using Beverages.Interfaces.Beverages;

namespace Beverages.Classes.Supplements
{
    public class Milk : Drink
    {
        public Milk() : base() { }
        public Milk(Beverage drink) : base(drink) { }

        protected override double DrinkPrice()
        {
            return 0.1;
        }
    }
}
