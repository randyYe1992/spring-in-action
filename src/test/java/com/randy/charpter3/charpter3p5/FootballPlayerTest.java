package com.randy.charpter3.charpter3p5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressConfig.class)
public class FootballPlayerTest {
    @Autowired
    private FootballPlayer footballPlayer;

    @Test
    public void testIntroduce() {
        footballPlayer.introduce();
    }
}
