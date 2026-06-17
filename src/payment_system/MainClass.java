package payment_system;

public class MainClass {

    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaypalPayment();
        PaymentService paymentService = new PaymentService(paymentMethod);

        paymentService.makePayment(45);
    }

}
