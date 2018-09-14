package com.randy.charpter4.charpter4p2;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//这是一个切面
@Component
@Aspect
public class Audience {

    @Pointcut("execution(* com.randy.charpter4.charpter4p2.Performance.play(..)) && bean(performanceImpl)")
    public void mark() {
    }

    @Before("mark()")
    public void takeSeat() {
        System.out.println("audiences take seat");
    }

    @Before("mark()")
    public void silencePhone() {
        System.out.println("audiences silence phone");
    }

    @AfterReturning("mark()")
    public void clapHands() {
        System.out.println("audiences clap hands");
    }

    @AfterThrowing("mark()")
    public void refundTicketMoney() {
        System.out.println("audiences refund ticket money");
    }
}
