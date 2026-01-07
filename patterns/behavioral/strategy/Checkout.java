package behavioral.strategy;

import behavioral.strategy.pricing.PricingStrategy;

public class Checkout {

    private final PricingStrategy strategy;

    public Checkout(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double total(double price) {
        return strategy.calculate(price);
    }
}
