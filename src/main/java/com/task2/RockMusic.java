package com.task2;

public class RockMusic extends MusicStyles {

    String subGenre;

    public RockMusic(String artistName, int bpm, String rootNote, String rhythm, String subGenre) {
        this.artistName = artistName;
        this.bpm = bpm;
        this.rootNote = rootNote;
        this.rhythm = rhythm;
        this.subGenre = subGenre;
    }

    @Override
    public void playMusic() {
        System.out.println("You`re listening to the " + subGenre + " subgenre of rock music." +
                "\n" + "Artist name: " + artistName +
                "\n" + "BPM: " + bpm +
                "\n" + "Root note:  " + rootNote +
                "\n" + "Rhythm: " + rhythm +
                "\n");
    }

}
