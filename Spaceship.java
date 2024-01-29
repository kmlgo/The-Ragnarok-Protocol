/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSAA2;

/**
 *
 * @author user
 */
public class Spaceship implements Harmable {
    private int fuel, travelCost, currentDist, travelSpeed, landingGearHealth, reactorGenHealth, windowHealth;
    private boolean warpDriveState, oxygenValveState, landingGearState, reactorGenState;
    
    public Spaceship(int fuel, int travelSpeed, int landingGearHealth, int reactorGenHealth, int windowHealth) {
        this.fuel = fuel;
        this.travelSpeed = travelSpeed;
        this.landingGearHealth = landingGearHealth;
        this.reactorGenHealth = reactorGenHealth;
        this.windowHealth = windowHealth;
        travelCost = 0;
        currentDist = 0;
        warpDriveState = false; //true denotes that the state of this is online/active
        oxygenValveState = true;
        landingGearState = false;
        reactorGenState = true;
    }

    public int getFuel() {
        return fuel;
    }

    public int getTravelCost() {
        return travelCost;
    }

    public int getCurrentDist() {
        return currentDist;
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public int getLandingGearHealth() {
        return landingGearHealth;
    }

    public int getReactorGenHealth() {
        return reactorGenHealth;
    }

    public int getWindowHealth() {
        return windowHealth;
    }

    public boolean isWarpDriveState() {
        return warpDriveState;
    }

    public boolean isOxygenValveState() {
        return oxygenValveState;
    }

    public boolean isLandingGearState() {
        return landingGearState;
    }

    public boolean isReactorGenState() {
        return reactorGenState;
    }
    
    public void warp(Planet p) {
        //warps to planet P
        System.out.println("Warped to planet" + p);
    }
    
    public void land(Planet p) throws PartSelectionException{
        //lands on planet P
        landingGearState = true;
        System.out.println("Landed on planet " + p.name);
        
        for(int i = 0; i < p.atmoComp.size(); i++){
            if((p.atmoComp.get(i).equalsIgnoreCase("CH4")) && (p.atmoConcentration.get(i) >= 70.0)){
                while((landingGearHealth > 0) && (reactorGenHealth > 0) && (windowHealth > 0)){ 
                    //This is coded like there are game ticks, but we haven't learned timers yet so this will be changed later on
                    loseHP(20, 3);
                }
            }
        }
    }
    
    @Override
    public void gainHP(int n, int part) throws PartSelectionException {
        if(part == 1){
            if(landingGearHealth + n <= 100){
                landingGearHealth += n;
            }
        }
        else if(part == 2){
            if(reactorGenHealth + n <= 100){
                reactorGenHealth += n;
            }
        }
        else if (part == 3){
            if(windowHealth + n <= 100){
                windowHealth += n;
            }
        }
        else {
            throw new PartSelectionException("Selected part " + part + " is out of range!");
        }
    }
    
    @Override
    public void loseHP(int n, int part) throws PartSelectionException {
        if(part == 1){
            landingGearHealth -= n;
            if(landingGearHealth <= 0){
                landingGearHealth = 0;
            }
        }
        else if(part == 2){
            reactorGenHealth -= n;
            if(reactorGenHealth <= 0){
                reactorGenHealth = 0;
            }
        }
        else if (part == 3){
            windowHealth -= n;
            if(windowHealth <= 0){
                windowHealth = 0;
            }
        }
        else {
            throw new PartSelectionException("Selected part " + part + " is out of range!");
        }
    }
}
