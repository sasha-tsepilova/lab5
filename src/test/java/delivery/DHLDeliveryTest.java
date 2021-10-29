package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryTest {
    DHLDelivery dhl;
    List<Item> toDeliver;
    @BeforeEach
    void setUp(){
        dhl = new DHLDelivery();
        toDeliver = new ArrayList<>();
        Flower f = new Flower(FlowerType.ROSE);
        toDeliver.add(f);
    }

    @Test
    void deliver() {
        assertTrue(dhl.deliver(toDeliver));
    }
}