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
    
    public void cutBoardLength(int cutLength){
        if(cutLength > boardLength){
            System.out.println("Impossible! That board is smaller than the size "
                    + "you are trying to cut.");
        }else 
            System.out.println("Cutting board to size.");
            boardLength = cutLength;
    }
    
    public void setBoardLength(double setLength){
        boardLength = setLength;
        
    }
    
    public double getBoardLength(){
        return boardLength;
    }
    
}
