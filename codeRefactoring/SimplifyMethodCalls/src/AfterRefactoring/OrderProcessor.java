package AfterRefactoring;

public class OrderProcessor {
    public void processOrder(Order order) {
        if (order.isValid()) {
            order.sendConfirmationEmail();
        }
    }
}