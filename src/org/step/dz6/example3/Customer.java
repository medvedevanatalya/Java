package org.step.dz6.example3;

public class Customer implements Runnable{
    Storage storage;

    Customer(Storage storage) {
        this.storage=storage;
    }

    @Override
    public void run(){
        for (int i = 1; i < 6; i++) {
            storage.get();
        }
    }
}
