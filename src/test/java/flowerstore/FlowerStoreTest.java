package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlowerStoreTest {
    private FlowerStore store;
    @BeforeEach
    void setUp() {
        Flower flowerChamomile = new Flower(FlowerType.CHAMOMILE);
        flowerChamomile.setPrice(10);
        flowerChamomile.setColor(new int[]{128,0,0});
        flowerChamomile.setSepalLength(2.5);
        FlowerPack flowerPackChamomile = new FlowerPack(flowerChamomile, 5);
        Flower flowerRose = new Flower(FlowerType.ROSE);
        flowerRose.setPrice(15);
        flowerRose.setColor(new int[]{12,128,0});
        flowerRose.setSepalLength(4);
        FlowerPack flowerPackRose = new FlowerPack(flowerRose, 10);
        FlowerBucket flowerBucket = new FlowerBucket();
        List<FlowerPack> flowerPacks = new ArrayList<>();
        flowerPacks.add(flowerPackChamomile);
        flowerPacks.add(flowerPackRose);
        flowerBucket.setFlowerPacks(flowerPacks);
        store = new FlowerStore();
        List<FlowerBucket> buckets = new ArrayList<>();
        buckets.add(flowerBucket);
        store.setFlowerBuckets(buckets);
    }

    @Test
    void search() {
        assertFalse(store.search(100));
        assertTrue(store.search(201));
    }
}