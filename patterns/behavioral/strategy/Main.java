package behavioral.strategy;

import behavioral.strategy.pricing.DiscountPricing;
import behavioral.strategy.pricing.RegularPricing;

public class Main {
    public static void main(String[] args) {
        Checkout regular =
                new Checkout(new RegularPricing());

        Checkout discounted =
                new Checkout(new DiscountPricing());

        System.out.println(regular.total(100));
        System.out.println(discounted.total(100));
    }
}
