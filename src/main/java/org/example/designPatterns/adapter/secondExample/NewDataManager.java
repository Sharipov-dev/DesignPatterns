package org.example.designPatterns.adapter.secondExample;

public class NewDataManager implements DataManager{

    @Override
    public void fetchData() {
        System.out.println("fetching data from new data manager system...");
    }
}
