package com.task1;

public class Androids implements Smartphone, LinuxOS {

    String producer;
    String modelName;
    int cost;

    public Androids(String producer, String modelName, int cost) {
        this.producer = producer;
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
