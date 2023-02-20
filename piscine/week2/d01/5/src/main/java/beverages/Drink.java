package main.java.beverages;
import main.java.supplements.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink implements Beverage{
    abstract double basePrice();
    private List<Supplement> supplements = new ArrayList<>();

    public double price() {
        return basePrice() + supplements.stream()
                            .map(Supplement::price)
                            .reduce(basePrice(), Double::sum);
    }

    List<Supplement> validSupplements() {
        return new ArrayList<>();
    }

    public void addSupplement(Supplement supplement){
        if (!validSupplements().contains(supplement.getClass())) {
            System.out.println("Invalid Supplement.");
            return;
        }
        supplements.add(supplement);
        System.out.println("Successfully added supplement to beverage!");
    }
}
