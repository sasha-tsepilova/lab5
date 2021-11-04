package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {

    Receiver us;
    @BeforeEach
    void setUp(){
        us = new Receiver();
    }

    @Test
    void update() {
        assertTrue(us.update("done"));
    }
}