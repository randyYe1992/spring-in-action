package com.randy.charpter4.charpter4p2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
public class BlankDiscImpl implements BlankDisc {
    private List<String> tracks;

    @Override
    public void play() {
        int trackNum = new Random().nextInt(10);
        System.out.println(tracks.get(trackNum));
    }

    @Override
    public void play(int trackNum) {
        System.out.println(tracks.get(trackNum));
    }

    public BlankDiscImpl() {
        List<String> tracks = new ArrayList<>();
        this.tracks = tracks;
        tracks.add("track 1");
        tracks.add("track 2");
        tracks.add("track 3");
        tracks.add("track 4");
        tracks.add("track 5");
        tracks.add("track 6");
        tracks.add("track 7");
        tracks.add("track 8");
        tracks.add("track 9");
        tracks.add("track 10");
        tracks.add("track 11");
    }
}
