package com.task1;

public class Iphones implements Smartphone, Ios {

    String modelName;
    int cost;

    public Iphones (String modelName, int cost ) {

        this.modelName = modelName;
        this.cost = cost;
        System.out.println("Your OS is " + name);
    }
    @Override
    public void call() {
        System.out.println("You made a call by " + modelName);
    }

    @Override
    public void sms() {
        System.out.println("You typed sms by " + modelName);
    }

    @Override
    public void internet() {
        System.out.println("You connected to the internet with " + modelName);
    }
}

