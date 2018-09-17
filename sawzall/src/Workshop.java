
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author efaux01
 */
public class Workshop {
    static TwoByFour boardA;
    static TwoByFour boardB;
    static TwoByFour boardC;
    static TwoByFour boardD;
    static TwoByFour boardE;
    static TwoByFour boardF;
    static TwoByFour boardG;
    static TwoByFour boardH;
    static TwoByFour boardI;
    static TwoByFour boardJ;
    static LinkedList<TwoByFour> pile = new LinkedList();
    static ListIterator<TwoByFour> iter;
    static boolean isBoardInHand = false;
    static TwoByFour boardInHand;
    
    public static void main(String [] args){
        stackBoards();
        createBoards(144);
        menu();
    }//close main
    
    public static void stackBoards(){
        System.out.println("Welcome to the Woodshop. We just got a new shipment"
                + " of new 12 foot 2x4's.");
        System.out.println("Lets put them in a neat and orderly pile in the"
                + " corner of the shop");
   
        pile.add(boardA);
        pile.add(boardB);
        pile.add(boardC);
        pile.add(boardD);
        pile.add(boardE);
        pile.add(boardF);
        pile.add(boardG);
        pile.add(boardH);
        pile.add(boardI);
        pile.add(boardJ);
    }//close stackBoards
    
    public static void createBoards(int length){
        TwoByFour creating;
        iter = pile.listIterator(0);
        while(iter.hasNext()){
            creating = iter.next();
            creating = new TwoByFour(length);
            iter.set(creating);
        }//close while loop
        
    }//close createBoards
    
    
    
    public static void menu(){
        if(isBoardInHand == true){
            System.out.println("You already have a board in your hand. You have"
                    + " to do something with it first.");
                    boardMenu();
        }//close if 
        System.out.println("What would you like to do with your pile of boards?");
        System.out.println("1.Get a board off the top of the pile. \n2.Get a "
                + "board from the bottom \n3.View available board lengths"
                + "\n4.Get a specific board from the pile");
        int choice = getIntInput();
        switch(choice){
            case 1:
                boardInHand = pile.getFirst();
                pickedUpBoard();
                break;
            case 2:
                boardInHand = pile.getLast();
                pickedUpBoard();
                break;
            case 3:
                printList();
                break;
            case 4:
                System.out.println("Which board would you like to pick up?");
                printList();
                choice = getIntInput();
                pile.get(choice);
                pickedUpBoard();
                break;
            default:
                System.out.println("Invalid entry. Try again.");
                break;
        }
    }//close menu
    
    public static void pickedUpBoard(){
        isBoardInHand = true;
        System.out.println("You've picked up a board that is " 
                + boardInHand.getBoardLength() + " inches long.");
        boardMenu();
    }
    
    public static void printList(){
        iter = pile.listIterator(0);
        while(iter.hasNext()){
            System.out.print(iter.nextIndex() + ". Length: " 
                    + iter.next().getBoardLength());
        }
    }
    
    public static void boardMenu(){
            System.out.println("What would you like to do with the board in "
                    + "your hand?");
            System.out.println("1.Cut board to specific length \n2.Put board "
                    + "down on the top of the pile \n3.Put board on the bottom "
                    + "of the pile \n4.Throw out board \n5.Measure Board \n6.Go "
                    + "to Main Menu");
            
            int choice = getIntInput();
            switch(choice){
                case 1:
                    System.out.println("Enter the length in inches you would "
                            + "like to cut the board to.");
                    double toCut = getDoubleInput();
                    boardInHand.cutBoardLength(toCut);
                    boardMenu();
                    break;
                case 2:
                    pile.add(boardInHand);
                    putBoardDown();
                    break;
                case 3:
                    pile.addFirst(boardInHand);
                    putBoardDown();
                    break;
                case 4:
                    putBoardDown();
                    break;
                case 5:
                    System.out.println("Length: " + boardInHand.getBoardLength() 
                            + " inches.");
                    break;
                case 6:
                    menu();
                default:
                    System.out.println("Invalid entry. Try Again.");
                    break;
            }
    }// close boardMenu
    
    public static void putBoardDown(){
        isBoardInHand = false;
        boardInHand = null;
        menu();
    }
    
    public static int getIntInput(){
        Scanner userInput = new Scanner(System.in);
        int keystroke = userInput.nextInt();
        return keystroke;
    }
    
    public static double getDoubleInput(){
        Scanner userTyping = new Scanner(System.in);
        double type = userTyping.nextDouble();
        return type;
    }
}
