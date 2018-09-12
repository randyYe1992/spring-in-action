package com.randy.charpter2.charpter2p2;

import org.springframework.stereotype.Component;

@Component("compactDiscImpl")
public class CompactDiscImpl implements CompactDisc{

    private String title ="this is a title";
    private String artist = "this is a artist";
    @Override
    public void play() {
        System.out.println(title+artist);
    }
}
