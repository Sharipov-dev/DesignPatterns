package org.example.designPatterns.adapter.secondExample;

public class OldToNewDataManager implements DataManager{
    private OldDataManager oldDataManager;

    public OldToNewDataManager(OldDataManager oldDataManager){
        this.oldDataManager = oldDataManager;
    }

    @Override
    public void fetchData() {
        oldDataManager.fetchData();
    }
}
