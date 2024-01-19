package AfterRefactoring;

public class DiscountCalculator {
    public double calculateDiscount(double totalPrice, int loyaltyPoints) {
        return loyaltyPoints > 100 ? totalPrice * 0.1 : totalPrice * 0.05;
    }
}
