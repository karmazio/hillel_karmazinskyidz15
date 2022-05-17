package com.task2;

//
//2. Полиморфизм:
//        a. Сделайте класс MusicStyles, который будет содержать метод playMusic()
//        b. Сделайте его наследников: PopMusic, RockMusic, и ClassicMusic.
//        c. Наследники должны по-своему реализовывать метод playMusic().
//        d. В мейн-классе создайте музыкальные группы для каждого стиля
//        e. С помощью метода for each вызовите у всех наследников MusicStyles метод playMusic()


public class Main2 {


    public static void main(String[] args) {

        MusicStyles[] playlist = {
                new ClassicMusic("Beethoven", 85, "A#", "3/4", 35),
                new ClassicMusic("Mozart", 90, "G", "3/2", 52),
                new PopMusic("Michael Jackson", 130, "F", "4/4", 2),
                new PopMusic("Kalush", 135, "B", "4/4", 1),
                new RockMusic("Metallica",125, "C#", "3/4", "Hard Rock"),
                new RockMusic("Misfits", 145, "E", "4/4", "Punk Rock")
        };


        for (MusicStyles musicStyles: playlist) {
            musicStyles.playMusic();
        }



    }
}

