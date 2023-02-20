package main.java.beverages;

import main.java.supplements.*;

import java.util.Arrays;
import java.util.List;

public class Coffee extends Drink{
    @Override
    public double basePrice() { return 1.2; }

    @Override
    List<Supplement> validSupplements() {
        return Arrays.asList(
                new Milk(),
                new Cream()
        );
    }
}
