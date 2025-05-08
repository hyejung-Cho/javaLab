package com.Sample.classpreview;

public class Bicycle {

    private int cadence = 0; 
    private int speed = 0;
    private int gear = 1;
    
    public static int count;

    public static void changeCadenceStaticVersion(int countValue) {
        Bicycle.count = countValue;
    }  
    
    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}