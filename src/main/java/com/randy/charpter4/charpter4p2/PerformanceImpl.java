package com.randy.charpter4.charpter4p2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@Qualifier("performance")
public class PerformanceImpl implements Performance {
    @Override
    public void play() {
        System.out.println("i am playing piano");
        //   throw new RuntimeException();
    }

    @Override
    public void surroundingPlay() {
        System.out.println("i am test surroundingPlay ");
        throw new RuntimeException();
    }
}
