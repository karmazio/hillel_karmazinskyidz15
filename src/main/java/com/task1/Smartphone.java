package com.task1;

public interface Smartphone {

    default void call() {
        System.out.println("You made a call");
    }
    default void sms() {
        System.out.println("You typed sms");
    }
    default void internet() {
        System.out.println("You connected to the internet");
    }
}
