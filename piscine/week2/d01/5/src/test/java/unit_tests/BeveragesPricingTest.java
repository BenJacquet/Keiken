package unit_tests;

import beverages.Beverage;
import beverages.Coffee;
import beverages.HotChocolate;
import beverages.Tea;
import org.junit.Test;
import supplements.Cinnamon;
import supplements.Cream;
import supplements.Milk;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    private static final double PRECISION = 0.001;
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, PRECISION)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, PRECISION)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, PRECISION)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Tea tea = new Tea();
        tea.addSupplement(new Milk());
        assertThat(tea.price(), is(closeTo(1.60, PRECISION)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Coffee coffee = new Coffee();
        coffee.addSupplement(new Milk());
        assertThat(coffee.price(), is(closeTo(1.30, PRECISION)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Coffee coffee = new Coffee();
        coffee.addSupplement(new Cream());
        coffee.addSupplement(new Milk());
        assertThat(coffee.price(), is(closeTo(1.45, PRECISION)));
    }


    @Test
    public void computes_hot_chocolate_with_cream_price() {
        HotChocolate hotChocolate = new HotChocolate();
        hotChocolate.addSupplement(new Cream());
        assertThat(hotChocolate.price(),  is(closeTo(1.60, PRECISION)));
    }

    @Test
    public void computes_coffee_with_cinnamon_price() {
        Coffee coffee = new Coffee();
        coffee.addSupplement(new Cinnamon());
        assertThat(coffee.price(), is(closeTo(1.20, PRECISION)));
    }
}