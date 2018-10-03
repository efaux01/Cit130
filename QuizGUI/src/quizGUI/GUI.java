package quizGUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Map;

/**
 *
 * @author eliza
 */
public class GUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //create intro label
        Label intro = new Label("Welcome to the Distraction Quiz. In the "
                + "followning 10 minutes you will read 3 passages and answer "
                + "\nsimple questions about what words in the passage are "
                + "related. Various distractions will be added so we \ncan see "
                + "how you function with different distractions. ");
        
        //Change intro font to size 18
        intro.setFont(new Font(18));
        
        
        //create start button, make text size 30
        Button start = new Button();
        start.setText("Start Quiz");
        start.setFont(new Font(30));
        start.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });//close EventHandler
        
        //Sets up vertical alignment with 100 pixel space between items
        VBox firstRoot = new VBox(100);
        
        
        //creates window or "scene", sets size, position of items, and margins
        Scene startScreen = new Scene(firstRoot, 1000, 600);
        firstRoot.setAlignment(Pos.TOP_CENTER);
        firstRoot.setPadding(new Insets(100,0,0,0));
        
        //Place intro label in scene graph
        firstRoot.getChildren().add(intro);
        
        //place start button in scene graph
        firstRoot.getChildren().add(start);
        primaryStage.setTitle("Distraction Quiz");
        primaryStage.setScene(startScreen);
        primaryStage.show();
    }//close start

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void visualDistraction>){
        
    }
}
