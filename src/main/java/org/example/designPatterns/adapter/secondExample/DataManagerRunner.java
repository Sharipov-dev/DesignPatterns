package org.example.designPatterns.adapter.secondExample;

public class DataManagerRunner {
    public static void main(String[] args) {
        DataManager adapter = new OldToNewDataManager(new OldDataManager());
        adapter.fetchData();
    }
}
