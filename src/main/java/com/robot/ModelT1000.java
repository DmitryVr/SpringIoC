package com.robot;

import com.interfaces.Hand;
import com.interfaces.Head;
import com.interfaces.Leg;
import com.interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT1000 implements Robot, InitializingBean, DisposableBean {
    private Head head;
    private Hand hand;
    private Leg leg;

    private int year;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public void action() {
        hand.give();
        head.think();
        leg.move();
    }

    public void initObject() {
        System.out.println("init");
    }

    public void destroyObject() {
        System.out.println("destroy");
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }
}
