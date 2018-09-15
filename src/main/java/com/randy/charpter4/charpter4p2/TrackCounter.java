package com.randy.charpter4.charpter4p2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class TrackCounter {
    @Pointcut("execution(* com.randy.charpter4.charpter4p2.BlankDisc.play(..))&&args(trackNum)")
    public void mark(int trackNum) {
    }

    @Before("mark(trackNum)")
    public void silencePhone(int trackNum) {
        int trackCount = this.getPlayCounts(trackNum);
        tractsMap.put(trackNum, trackCount + 1);
        System.out.println("trackNum" + trackNum);
    }

    private Map<Integer, Integer> tractsMap = new HashMap<>();

    public int getPlayCounts(int trackNum) {
        return tractsMap.containsKey(trackNum) ? tractsMap.get(trackNum) : 0;
    }
}
