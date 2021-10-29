package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDelivery implements Delivery{
    public boolean deliver(List<Item> items){
        System.out.println("Delivering by DHL");
        return true;
    }
}
