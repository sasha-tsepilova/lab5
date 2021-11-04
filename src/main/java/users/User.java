package users;

public class User {
    protected static int id = 1;
    public int userId;
    User(){
        userId = User.id++;

    }
    public boolean update(String status) {
        System.out.println("Current order status" + status);
        return true;
    }
}
