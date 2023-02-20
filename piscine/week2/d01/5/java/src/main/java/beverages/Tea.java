package main.java.beverages;

import main.java.supplements.Milk;
import main.java.supplements.Supplement;

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
