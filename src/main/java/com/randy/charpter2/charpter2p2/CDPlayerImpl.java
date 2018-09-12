package com.randy.charpter2.charpter2p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cDPlayerImpl")
public class CDPlayerImpl implements CDPlayer {
    @Autowired
    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }
}
