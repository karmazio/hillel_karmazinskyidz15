package com.task1;

//1. Интерфейсы
//        a. Сделайте интерфейс Smartphones, который должен содержать методы call(), sms(), internet()
//        b. Сделайте классы которые его имплементируют: Androids, iPhones.
//        c. Андроиды должны также имплементировать LinuxOS, айфоны в свою очередь должны имплементировать iOS
//        d. Создайте экземпляры каждого вида в мейн-классе

public class Main {
    public static void main(String[] args) {

        Androids samsung = new Androids("Samsung", "Galaxy S", 150);
        samsung.call();
        samsung.sms();
        samsung.internet();

        System.out.println();


        Iphones iphones = new Iphones("8s", 200);
        iphones.call();
        iphones.sms();
        iphones.internet();


    }
}
