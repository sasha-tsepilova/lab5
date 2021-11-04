import Order.Order;
import decorators.BasketDecorator;
import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import delivery.PostDelivery;
import flowerstore.Flower;
import flowerstore.FlowerPack;
import flowerstore.Item;
import payment.PayPalPayment;
import payment.Payment;
import users.Orderer;
import users.Receiver;
import users.User;

import java.util.ArrayList;
import java.util.List;

import static flowerstore.FlowerType.ROSE;

public class Main {
    public static void main(String[] args){
        Receiver user = new Receiver();
        Orderer user1 = new Orderer();
        System.out.println(user.userId);
        System.out.println(user1.userId);
//        PostDelivery p = new PostDelivery();
//        Flower f = new Flower(ROSE);
//        f.setPrice(10);
//        Item beauty_f = new PaperDecorator(f);
//        System.out.println(beauty_f.getPrice());
//        System.out.println(beauty_f.getDescription());
//        List<Item> items = new ArrayList<>();
//        items.add(f);
//        FlowerPack pack = new FlowerPack(f, 10);
//        Item b_p = new RibbonDecorator(pack);
//        System.out.println(b_p.getPrice());
//        System.out.println(b_p.getDescription());
//        p.deliver(items);
//        PayPalPayment p = new PayPalPayment();
//        p.pay(123);

//        int[] color = {127,0,0};
//        for(int i = 0; i < flowers.length; i++){
//            flowers[i] = new Flower(ROSE);
//            flowers[i].setColor(color);
//        }
//
//        for(int i = 0; i < flowers.length; i++){
//            System.out.println(flowers[i]);
//        }
    }
}
