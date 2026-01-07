package behavioral.strategy.pricing;

public class DiscountPricing implements PricingStrategy {
    @Override
    public double calculate(double basePrice) {
        return basePrice * 0.9;
    }
}
