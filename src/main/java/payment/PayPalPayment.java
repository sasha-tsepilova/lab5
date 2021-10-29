package payment;

public class PayPalPayment implements Payment{
    public boolean pay(double price) {

        System.out.println("Payment via Pay Pal successful: " + price + " uah.");
        return true;
    }
}
