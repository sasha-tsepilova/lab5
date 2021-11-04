package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdererTest {
    Orderer us;
    @BeforeEach
    void setUp() {
        us = new Orderer();
    }

    @Test
    void update(){
        assertTrue(us.update("done"));
    }
}