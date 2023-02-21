package beverages;
import supplements.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink implements Beverage{
    abstract double basePrice();
    private List<Supplement> supplements = new ArrayList<>();

    public double price() {
        return supplements.stream()
                            .map(Supplement::price)
                            .reduce(basePrice(), Double::sum);
    }

    List<Supplement> validSupplements() {
        return new ArrayList<>();
    }

    public void addSupplement(Supplement supplement){
        for (int i = 0; i < validSupplements().size(); i++) {
            if (supplement.getClass().equals(validSupplements().get(i).getClass())) {
                supplements.add(supplement);
                System.out.println("Successfully added supplement to beverage!");
                return;
            }
        }
        System.out.println("Invalid Supplement.");
    }
}
