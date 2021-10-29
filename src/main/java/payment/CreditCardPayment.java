package payment;

public class CreditCardPayment implements Payment{
    public boolean pay(double price) {

        System.out.println("Payment via Credit Card successful: " + price + " uah.");
        return true;
    }
}
