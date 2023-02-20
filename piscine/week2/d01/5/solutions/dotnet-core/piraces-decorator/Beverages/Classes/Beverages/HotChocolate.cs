using Beverages.Interfaces.Beverages;

namespace Beverages.Classes.Beverages
{
    public class HotChocolate : Drink
    {
        public HotChocolate() : base() { }
        public HotChocolate(Beverage beverage) : base(beverage) { }

        protected override double DrinkPrice()
        {
            return 1.45;
        }
    }
}
