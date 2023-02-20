namespace Beverages
{
    public class Supplement : ISupplement
    {
        public Supplement()
        {
            
        }

        public double MilkPrice()
        {
            return 0.10;
        } 
        public double CreamPrice()
        {
            return 0.15;
        } 
        public double CinnamonPrice()
        {
            return 0.05;
        } 
    }
}