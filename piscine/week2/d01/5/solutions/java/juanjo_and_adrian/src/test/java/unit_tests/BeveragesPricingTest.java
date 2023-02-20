package unit_tests;

import beverages.*;
import org.junit.Test;
import toppings.Cinnamon;
import toppings.Cream;
import toppings.InvalidToppingException;
import toppings.Milk;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Tea tea = new Tea();
        tea.with(new Milk());
        assertThat(tea.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Coffee coffee = new Coffee();
        coffee.with(new Milk());
        assertThat(coffee.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Coffee coffee = new Coffee();
        coffee.with(new Milk()).with(new Cream());
        assertThat(coffee.price(), is(closeTo(1.45, 0.001)));
    }


    @Test
    public void computes_hot_chocolate_with_cream_price() {
        HotChocolate hotChocolate = new HotChocolate();
        hotChocolate.with(new Cream());
        assertThat(hotChocolate.price(),  is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_cinnamon_price() {
        Coffee coffee = new Coffee();
        coffee.with(new Cinnamon());
        assertThat(coffee.price(), is(closeTo(1.25, 0.001)));
    }

    @Test(expected = InvalidToppingException.class)
    public void should_not_allow_tea_with_cinnamon() {
        Tea tea = new Tea();
        tea.with(new Cinnamon());
    }
}
