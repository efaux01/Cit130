/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missionmars;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author eliza
 */
public class MissionMars {

    static HashMap <String,String> aresI = new HashMap<>();
    static int choice;
    static String select;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Mission Mars Monitoring System Interface.");
        
        //Initialize keys & values in the sets
        aresI.put("Location","Mars");
        aresI.put("Name","Ares I");
        aresI.put("Duration","900 days");
        aresI.put("Cost","$500,000,000,000");
        aresI.put("Crew Size", "8");
        aresI.put("Distance", "33,900,000 Miles" );
        aresI.put("Distance Travelled","0 Miles");
        aresI.put("Distance Remaining", "33,900,000 Miles");
        aresI.put("Status", "Planning Phase");
        
        menu();
    }//closes main
    
    public static void menu(){
        int choice = 0;
        //loop switch section if user types an invalid int
        while (choice == 0){
            System.out.println("What would you like to do?");
            System.out.println("1.View specific data \n2.View all project data "
                    + "\n3.Change project data \n4.End Program \nPlease enter a "
                    + "whole number from the above list");

            choice = getInput();
            switch(choice){
                case 1:
                    viewSelected();
                    break;
                case 2:
                    viewAll();
                    break;
                case 3:
                    changeSelected();
                    break;
                case 4:
                    endProgram();
                    break;
                default:
                    System.out.println("Invalid Entry. Try Again.");
                    choice = 0;
            }//close switch
        }//close while
    }//close menu
    
    
    public static int getInput(){
        //collects an int from the user
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        return input;
    }//close getInput
    
    public static void viewSelected(){
        choice = 0;
        while(choice == 0){
            System.out.println("Which information would you like to view?");
            selectKey();
            System.out.println(select + ": " + aresI.get(select));
        }
        menu();
    }//close viewSelected
    
    public static void viewAll(){
        
        Object[] list = aresI.keySet().toArray();
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i] + " = " + aresI.get(list[i]));
        }
        menu();
    }//close viewAll
    
    public static void changeSelected(){
        int choice = 0;
        while(choice == 0){
            System.out.println("What information would you like to change?");
            selectKey();
            System.out.println("Current Value: \n" + select + ": " + aresI.get(select));
            System.out.println("Type what you would like the new value to be.");
            Scanner textInput = new Scanner(System.in);
            String updatedData = textInput.next();
            aresI.replace(select,updatedData);  
        }//close while loop
        menu();
    }//close changeSelected
    
    public static void endProgram(){
        System.exit(0);
    }//closes endProgram
    
    public static void showKeyList(){
        LinkedList<String> list = new LinkedList(aresI.keySet());
        ListIterator<String> iter = list.listIterator(0);
        int indexNum = 1;
        while(iter.hasNext()){
            System.out.println(indexNum + "." + iter.next());
            indexNum ++;
        }//close while loop
        System.out.println("10.End Program");
    }//close showKeyList
    
    
    public static void selectKey(){
        showKeyList();
    
            choice = getInput();
            switch(choice){
                case 1:
                    select = "Distance Remaining";
                    break;
                case 2:
                    select = "Status";
                    break;
                case 3:
                    select = "Distance Travelled";
                    break;
                case 4:
                    select = "Duration";
                    break;
                case 5:
                    select = "Cost";
                    break;
                case 6:
                    select = "Distance";
                    break;
                case 7:
                    select = "Location";
                    break;
                case 8:
                    select = "Name";
                    break;
                case 9:
                    select = "Crew Size";
                    break;
                case 10:
                    endProgram();
                    break;
                default:
                    System.out.println("Invalid Entry. Try Again");
            }//close switch statement
    }//close selectKey
}//close MissionMars
