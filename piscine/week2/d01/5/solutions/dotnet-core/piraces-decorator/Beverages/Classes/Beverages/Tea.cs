using Beverages.Interfaces.Beverages;

namespace Beverages.Classes.Beverages
{
    public class Tea : Drink
    {
        public Tea() : base() { }
        public Tea(Beverage beverage) : base(beverage) { }

        protected override double DrinkPrice()
        {
            return 1.5;
        }
    }
}
