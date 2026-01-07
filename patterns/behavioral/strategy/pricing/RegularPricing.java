package behavioral.strategy.pricing;

public class RegularPricing implements PricingStrategy {
    @Override
    public double calculate(double basePrice) {
        return basePrice;
    }
}
