package org.example.designPatterns.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database db = new AdapterJavaToDatabase();

        db.create();
        db.remove();
        db.select();
        db.update();
    }
}
