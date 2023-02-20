package beverages;

import toppings.InvalidToppingException;
import toppings.Topping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Drink implements Beverage {
    private List<Topping> toppingList = new ArrayList<>();

    @Override
    public double price() {
        return toppingList.stream()
                .map(Topping::price)
                .reduce(basePrice(), Double::sum);
    }

    public Drink with(Topping topping) throws InvalidToppingException {
        if (invalidToppingClasses().contains(topping.getClass())) {
            throw new InvalidToppingException();
        }

        toppingList.add(topping);
        return this;
    }

    abstract double basePrice();
    List<Topping> invalidToppings() {
        return new ArrayList<>();
    }

    private List<Class<?>> invalidToppingClasses() {
        return invalidToppings().stream()
                .map(Topping::getClass)
                .collect(Collectors.toList());
    }
}
