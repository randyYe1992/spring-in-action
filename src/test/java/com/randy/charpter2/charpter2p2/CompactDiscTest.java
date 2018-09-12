package com.randy.charpter2.charpter2p2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDConfig.class)
public class CompactDiscTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private CDPlayer cdPlayer;
    @Test
    public void cdShouldBeNotNull() {
        System.out.println(cd.hashCode());
    }
    @Test
    public void cdPlayerTest(){
        cdPlayer.play();
    }

}
