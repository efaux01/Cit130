
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author efaux01
 */
public class Workshop {
    
    
    public static void main(String [] args){
        createBoards();
        stackBoards();
        menu();
    }
    
    public static void createBoards(){
        System.out.println("We just got a new shipment of new 12 foot 2x4's.");
        
        TwoByFour boardA = new TwoByFour();
        boardA.setBoardLength(12);
        
        TwoByFour boardB = new TwoByFour();
        boardB.setBoardLength(12);
        
        TwoByFour boardC = new TwoByFour();
        boardC.setBoardLength(12);
        
        TwoByFour boardD = new TwoByFour();
        boardD.setBoardLength(12);
        
        TwoByFour boardE = new TwoByFour();
        boardE.setBoardLength(12);
        
        TwoByFour boardF = new TwoByFour();
        boardF.setBoardLength(12);
        
        TwoByFour boardG = new TwoByFour();
        boardG.setBoardLength(12);
        
        TwoByFour boardH = new TwoByFour();
        boardH.setBoardLength(12);
    }
    
    public static void stackBoards(){
        System.out.println("Lets put them in a neat and orderly pile in the"
                + " corner of the shop");
                
    }
    
    public static void menu(){
        
    }
}
