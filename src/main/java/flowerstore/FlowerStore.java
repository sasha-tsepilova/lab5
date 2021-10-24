package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public boolean search(double price){
        // returns True if there is bucket, which can be bought with this money.
        for (FlowerBucket bucket: flowerBuckets){
            if (bucket.getPrice() <= price ) return true;
        }
        return false;
    }
    public void setFlowerBuckets(List<FlowerBucket> flowerBuckets) {
        this.flowerBuckets = new ArrayList<>(flowerBuckets);
    }
}
