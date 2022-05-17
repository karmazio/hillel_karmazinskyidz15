package com.task2;

public class ClassicMusic extends MusicStyles {
    int menInOrchestra;

    public ClassicMusic(String artistName, int bpm, String rootNote, String rhythm, int menInOrchestra) {
        this.artistName = artistName;
        this.bpm = bpm;
        this.rootNote = rootNote;
        this.rhythm = rhythm;
        this.menInOrchestra = menInOrchestra;
    }

    @Override
    public void playMusic() {
        System.out.println("You`re listening to the orchestral music with the multilayer arrangement." +
                "\n" + "Artist name: " + artistName +
                "\n" + "BPM: " + bpm +
                "\n" + "Root note:  " + rootNote +
                "\n" + "Rhythm: " + rhythm +
                "\n" + "People in orchestra: " + menInOrchestra +
                "\n");

    }
}
