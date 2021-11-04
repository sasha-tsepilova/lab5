package db;

public class Connection {
    private static Connection thisConnection = null;
    private Connection(){

    }
    public static Connection getConnection(){
        if (thisConnection == null) thisConnection = new Connection();
        return thisConnection;
    }
}
