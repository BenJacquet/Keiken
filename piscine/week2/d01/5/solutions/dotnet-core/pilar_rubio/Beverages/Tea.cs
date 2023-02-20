namespace Beverages
{
    public class Tea : Beverage
    {
        public Tea(ISupplement supplement): base(supplement)
        {
            _price = 1.5;
        }
    }
}
