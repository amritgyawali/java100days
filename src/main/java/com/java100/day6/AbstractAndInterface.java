package com.java100.day6;

abstract class Appliance{
    protected int power;
    public Appliance(int power){
        this.power = power;
    }
    public abstract void turnOn();
}
interface Programmable{
    void setTimer(int minutes);
}
class WashingMachine extends Appliance implements Programmable{
    public WashingMachine(int power){
        super(power);
    }
    @Override
    public void turnOn() {
        System.out.println("Washing machine is turned on.");
    }
    @Override
    public void setTimer(int minutes) {
        System.out.println("Washing machine set timer for "+ minutes + " minutes.");
    }
}
public class AbstractAndInterface {
    public static void main(String[] args) {
        WashingMachine wmm = new WashingMachine(5);
        wmm.turnOn();
        wmm.setTimer(15);
    }
}
