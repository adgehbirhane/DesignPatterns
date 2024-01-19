package BeforeRefactoring;

public class DiscountCalculator {
    public double calculateDiscount(double totalPrice, int loyaltyPoints) {
        if (loyaltyPoints > 100) {
            return totalPrice * 0.1;
        } else {
            return totalPrice * 0.05;
        }
    }
}

