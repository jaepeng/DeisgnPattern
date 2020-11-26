package com.jae.bulider.improve.mytest;

public class Client {
    public static void main(String[] args) {
        CandyDirector candyDirector = new CandyDirector(new BadCandy());
        Candy candy=candyDirector.constructCandy();
    }
}
