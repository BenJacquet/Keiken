package beverages;

import supplements.*;

import java.util.Arrays;
import java.util.List;

public class HotChocolate extends Drink{
    @Override
    public double basePrice() {
        return 1.45;
    }
    @Override
    List<Supplement> validSupplements() {
        return Arrays.asList(
                new Cream()
        );
    }
}
