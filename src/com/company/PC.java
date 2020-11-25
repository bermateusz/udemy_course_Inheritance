package com.company;

public class PC {
    private Case theCase;
     private Monitor monitor;
     private motherboard motherboard;

    public PC(Case theCase, Monitor monitor, com.company.motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
        runProgram();
    }
    public void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }

    public void runProgram(){
        motherboard.loadProgram("Windows");
    }

}
