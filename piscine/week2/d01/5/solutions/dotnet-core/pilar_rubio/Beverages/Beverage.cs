namespace Beverages
{
    public class Beverage
    {
        protected double _price;
        private ISupplement _supplement;

        public Beverage(ISupplement supplement)
        {
            _supplement = supplement;
            
        }
        public double Price()
        {
            return _price;
        }

        public double PriceWithCinnamon()
        {
            return Price() + _supplement.CinnamonPrice();
        }

        public double PriceWithMilk()
        {
            return Price() + _supplement.MilkPrice();
        }

        public double PriceWithMilkAndCream()
        {
            return PriceWithMilk() + _supplement.CreamPrice();
        }

        public double PriceWithCream()
        {
            return Price() + _supplement.CreamPrice();
        }
    }
}
