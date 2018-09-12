/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author efaux01
 */
public class Sawzall {
    private boolean triggerOn = false;
    private boolean batteryIn = false;
    private boolean bladeIn = false;
    private boolean isLocked = false;
    private Blade currentBlade;
    private Battery currentBattery;
    private boolean speedLow = false;
    
    public void removeBattery(){
        if (batteryIn = false){
            System.out.println("Invalid, there is no battery currently inserted.");
        } else{
            System.out.println("Removing Battery");
            batteryIn = false;
            currentBattery = null;
        }
    }
    
    public void insertBattery(Battery toInsert){
        if(batteryIn = true){
            System.out.println("Invalid, there is already a battery inserted.");
        }else{
            System.out.println("Inserting Battery " + toInsert);
            batteryIn = true;
            currentBattery = toInsert;
        }
    }
    
    public void removeBlade(){
        if(bladeIn = false){
            System.out.println("Invalid, there is no blade currently installed.");
        }else{
            System.out.println("Removing Blade");
            bladeIn = false;
            currentBlade = null;
        }
        
    }
    
    public void installBlade(Blade toInstall){
        if(bladeIn = true){
            System.out.println("Invalid, there is already a blade installed.");
        }else{
            System.out.println("Installing blade.");
            bladeIn = false;
            currentBlade = toInstall;
        }
    }
    
    public void lock(){
        if(isLocked = true){
            System.out.println("Invalid, the sawzall is already locked.");
        }else{
            System.out.println("The sawzall is now locked");
            isLocked = true;
        }
    }
    
    public void unlock(){
        if(isLocked = false){
            System.out.println("Invalid, the sawzall is already unlocked");
        }else{
            System.out.println("The sawzall is now unlocked");
            isLocked = false;
        }
    }
    
    public void useSawzall(){
        
    }
}
