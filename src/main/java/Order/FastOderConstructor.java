package Order;


public abstract class FastOderConstructor {
    public Order makeOrder(){
        Order ord = new Order();
        ord.order();
        return ord;
    }
}
