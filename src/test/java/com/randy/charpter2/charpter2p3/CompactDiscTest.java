package com.randy.charpter2.charpter2p3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDConfig.class)
public class CompactDiscTest {

    @Autowired
    private CompactDisc compactDisc;
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void compactDiscShouldNotNull() {
        System.out.println(compactDisc.hashCode());
    }

    @Test
    public void CDPlayerTest() {
        cdPlayer.play();
    }
}
