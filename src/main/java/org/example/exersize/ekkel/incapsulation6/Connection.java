package org.example.exersize.ekkel.incapsulation6;

public class Connection {
    private  Connection() {

    }
 Connection connection = new Connection();
    public static Connection GetObj() {
        return new Connection();
    }


}
