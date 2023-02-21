package beverages;

import supplements.*;

import java.util.Arrays;
import java.util.List;

public class Tea extends Drink{
    @Override
    public double basePrice() {
        return 1.5;
    }

    @Override
    List<Supplement> validSupplements() {
        return Arrays.asList(
                new Milk()
        );
    }
}
