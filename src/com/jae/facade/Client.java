package com.jae.facade;

public class Client {
    public static void main(String[] args) {
        //直接调用很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }
}
