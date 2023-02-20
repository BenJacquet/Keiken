using System.Linq;
using System.Collections.Generic;
using Beverages.Enums;

namespace Beverages
{
    public class Beverage
    {
        public double BasePrice { get; set; }
        public Dictionary<SupplementType, double> SupplementTypes { get; set; }

        public Beverage(double basePrice)
        {
            BasePrice = basePrice;
            SupplementTypes = new Dictionary<SupplementType, double>();
        }

        public void AddSupplementType(SupplementType supplementType, double supplementPrice)
        {
            SupplementTypes[supplementType] = supplementPrice;
        }

        public double Price()
        {
            return BasePrice + SupplementTypes.Sum(x => x.Value);
        }
    }
}
