package Order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order ord;
    @BeforeEach
    void setUp() {
        ord = new Order();
    }

    @Test
    void order() {
        assertTrue(ord.order());
    }
}