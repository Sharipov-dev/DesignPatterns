package org.example.designPatterns.adapter.firstExample;

public class AdapterJavaToDatabase extends JavaApplication implements Database{

    @Override
    public void create() {
        createObject();
    }

    @Override
    public void select() {
        getObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
