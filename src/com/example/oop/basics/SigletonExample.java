package com.example.oop.basics;

class DBConnection {

    private static DBConnection instance;

    private DBConnection(){
        System.out.println("Private constructor has been called");
    }

//    DBConnection(int a) {
//        this();
//    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void getFromDB() {
        System.out.println("Data loading from database");
    }

}

public class SigletonExample {
    public static void main(String[] args) {
//        DBConnection connection = new DBConnection(1);
        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();
        System.out.println(connection1 == connection2);

        connection1.getFromDB();

    }
}
