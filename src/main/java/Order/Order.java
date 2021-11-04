package Order;

import users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<User> users;
    public Order(){
        users = new ArrayList<>();
    }
    public void addUser(User newUser){
        users.add(newUser);
    }
    public void removeUser(int idRemove){
        users.removeIf(user -> user.userId == idRemove);
    }
    public void notifyUsers(String status){
        for (User user: users){
            user.notify();
        }
    }
    public boolean order(){
        String message = "Ordering process started";
        System.out.println(message);
        notifyUsers(message);
        return true;
    }
}
