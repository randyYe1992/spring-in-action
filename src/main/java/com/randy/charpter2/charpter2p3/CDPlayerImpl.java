package com.randy.charpter2.charpter2p3;

public class CDPlayerImpl implements CDPlayer {
    private CompactDisc cd;

    public CDPlayerImpl(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
