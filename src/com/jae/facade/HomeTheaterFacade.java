package com.jae.facade;

public class HomeTheaterFacade {
    private TheaterLight theaterLight;
    private PopCorn popCorn;
    private Screen screen;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Stereo stereo;


    //操作分成4步
    public void ready(){
        popCorn.on();
        popCorn.pop();
        screen.down();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }
    public void play(){
        dvdPlayer.player();
    }
    public void pause(){
        dvdPlayer.pause();
    }
    public void end(){
        popCorn.off();
        theaterLight.bright();
        stereo.off();
        dvdPlayer.off();
        screen.up();
    }


    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DvdPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.stereo=Stereo.getInstance();
    }
}
