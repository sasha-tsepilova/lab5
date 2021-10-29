package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDelivery implements Delivery{
    public boolean deliver(List<Item> items){
        System.out.println("Delivering by post");
        return true;
    }
}
