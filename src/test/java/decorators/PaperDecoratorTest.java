package decorators;

import flowerstore.Flower;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static flowerstore.FlowerType.ROSE;
import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    Item decoratedFlower;
    @BeforeEach
    void setUp() {
        Flower f = new Flower(ROSE);
        f.setPrice(10);
        decoratedFlower = new PaperDecorator(f);
    }

    @Test
    void getPrice() {
        assertEquals(23, decoratedFlower.getPrice());
    }
}