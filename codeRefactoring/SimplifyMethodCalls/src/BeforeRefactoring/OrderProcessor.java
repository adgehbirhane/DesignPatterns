package BeforeRefactoring;

public class OrderProcessor {
    public void processOrder(Order order) {
        if (order.isValid()) {
            sendConfirmationEmail(order);
        }
    }

    private void sendConfirmationEmail(Order order) {
        // Code to send confirmation email
    }
}

