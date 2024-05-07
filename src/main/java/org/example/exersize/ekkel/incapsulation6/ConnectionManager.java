package org.example.exersize.ekkel.incapsulation6;

public class ConnectionManager {
    Connection[] array = new Connection[3];
    Connection[] arrNull = new Connection[1];
ConnectionManager[] cm = new ConnectionManager[5];

    void addObj() {
        for (int i = 0; i < array.length ; i++) {
            
            array[i] = Connection.GetObj();
            System.out.println(array[i]);

        }

    }

    void ff() {
        System.out.println(cm[0]);
    }

    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.addObj();
        connectionManager.ff();

    }
}
