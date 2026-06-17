package payment_system;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amt) {
        System.out.println("Paid using Credit Card: " + amt);
    }
}


