namespace Beverages
{
    public class HotChocolate : Beverage
    {
        public HotChocolate(ISupplement supplement): base(supplement)
        {
            _price = 1.45;
        }
    }
}
