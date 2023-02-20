package beverages;

import toppings.Cinnamon;
import toppings.Topping;

import java.util.Arrays;
import java.util.List;

public class Tea extends Drink {
    @Override
    double basePrice() {
        return 1.5;
    }

    @Override
    List<Topping> invalidToppings() {
        return Arrays.asList(
                new Cinnamon()
        );
    }
}
