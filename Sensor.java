package com.assignment;

public class Sensor {
    int loc_w;
    int loc_l;

    public Sensor() {
    	
    }

    public boolean sensorState = false;     //FALSE when Sensor is OFF and TRUE when ON
    public boolean infiltratorState = false;    //FALSE when Infiltrator is standing and TRUE when moving

    public boolean detectMovement (boolean newInfiltratorState) {
        //Infiltrator gets caught
        if(newInfiltratorState != infiltratorState && sensorState == true) return true;
        
        //Infiltrator doesn't get caught
        infiltratorState = newInfiltratorState;
        return false;
    }

    public void updateState() {

    }
