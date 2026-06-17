package payment_system;

public class PaymentService {

    private PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amt){
        paymentMethod.pay(amt);
    }

}
