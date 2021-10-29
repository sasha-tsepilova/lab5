package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentTest {

    PayPalPayment payment ;

    @BeforeEach
    void setUp() {
        payment = new PayPalPayment();
    }

    @Test
    void pay() {
        assertTrue(payment.pay(2.4));
    }
}