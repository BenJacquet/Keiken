namespace Beverages
{
    public class CoffeeWithMilkAndCream : Coffee
    {
        public override double Price()
        {
            return base.Price() + 0.25;
        }
    }
}
