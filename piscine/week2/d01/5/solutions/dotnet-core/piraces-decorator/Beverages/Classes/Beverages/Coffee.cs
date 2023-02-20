using Beverages.Interfaces.Beverages;

namespace Beverages.Classes.Beverages
{
    public class Coffee : Drink
    {
        public Coffee() : base() { }
        public Coffee(Beverage beverage) : base(beverage) { }

        protected override double DrinkPrice()
        {
            return 1.2;
        }
    }
}
