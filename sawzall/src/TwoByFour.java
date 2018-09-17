/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author efaux01
 */
public class TwoByFour {
    private double boardLength;
    public final String BOARDTYPE = "Wood";
    
    TwoByFour(double length){
        boardLength = length;
    }
    
    public void cutBoardLength(double cutLength){
        if(cutLength > boardLength){
            System.out.println("Impossible! That board is smaller than the size "
                    + "you are trying to cut.");
        }else 
            System.out.println("Cutting board to " + cutLength + " .");
            boardLength = cutLength;
    }
    
    public double getBoardLength(){
        return boardLength;
    }
    
}
