/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author efaux01
 */
public class Blade {
    private double bladeWearPercent;
    private String bladeType;
    
    public void wearingBlade(String materialCut){
        if(materialCut == bladeType){
            bladeWearPercent -= .5;
        }
        if(materialCut == "Metal" && bladeType != "Metal"){
            bladeWearPercent -= 12;
        }else{
            bladeWearPercent -= 2;
        }
    }
    
    public double getBladeWearPercent(){
        return bladeWearPercent;
    }
    
    public String getBladeType(){
        return bladeType;
    }
}
