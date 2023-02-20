using Beverages.Classes.Beverages;
using Beverages.Interfaces.Beverages;

namespace Beverages.Classes.Supplements
{
    public class Cream : Drink
    {
        public Cream() : base() { }
        public Cream(Beverage drink) : base(drink) { }

        protected override double DrinkPrice()
        {
            return 0.15;
        }
    }
}
