package flowerstore;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        flower.setPrice(10);
        flower.setColor(new int[]{128,0,0});
        flower.setSepalLength(2.5);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        int[] flowerColor = flower.getColor();
        int[] neededColor = new int[] {128, 0, 0};
        for (int i = 0; i < flowerColor.length; i++){
            assertEquals(neededColor[i],flowerColor[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(2.5, flower.getSepalLength());
    }
}