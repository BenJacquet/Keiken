namespace Beverages
{
    public class Coffee : Beverage
    {
        public Coffee(ISupplement supplement): base(supplement)
        {
            _price = 1.2;
        }
    }
}
