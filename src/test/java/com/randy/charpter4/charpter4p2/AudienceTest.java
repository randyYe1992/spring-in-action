package com.randy.charpter4.charpter4p2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Charpter4p2Config.class)
public class AudienceTest {
    @Autowired
    private Audience audience;
    @Autowired
    @Qualifier("performance")
    private Performance performance;

    @Autowired
    private BlankDisc blankDisc;
    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testPerformance() {
        performance.play();
    }

    @Test
    public void testAudience() {
        audience.clapHands();
    }

    @Test
    public void testSurroundingPlay() {
        performance.surroundingPlay();
    }

    @Test
    public void testBlankDiscArgs() {
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);
        blankDisc.play(3);
        System.out.println(trackCounter.getPlayCounts(3));
    }

    @Test
    public void testBlankDiscNoArgs() {
        blankDisc.play();
    }
}
