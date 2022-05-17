package com.task2;

public class PopMusic extends MusicStyles{

    int positionInChart;

    public PopMusic(String artistName, int bpm, String rootNote, String rhythm, int positionInChart) {
        this.artistName = artistName;
        this.bpm = bpm;
        this.rootNote = rootNote;
        this.rhythm = rhythm;
        this.positionInChart = positionInChart;
    }

    @Override
    public void playMusic() {
        System.out.println("You`re listening to the top #" + positionInChart + " track of the last week." +
                "\n" + "Artist name: " + artistName +
                "\n" + "BPM: " + bpm +
                "\n" + "Root note:  " + rootNote +
                "\n" + "Rhythm: " + rhythm +
                "\n");
    }
}

