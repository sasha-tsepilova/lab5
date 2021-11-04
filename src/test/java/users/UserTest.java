package users;

import delivery.DHLDelivery;
import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User us;
    @BeforeEach
    void setUp(){
        us = new User();
    }

    @Test
    void update() {
        assertTrue(us.update("done"));
    }

}