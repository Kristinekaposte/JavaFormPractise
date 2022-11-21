package com.example.javaformpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import java.io.IOException;

public class KnightApplication extends Application {
    Alert alert;
    Stage stage;
        @Override
        public void start(Stage stage) throws IOException {
            //we create fxml loader and load fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(KnightApplication.class.getResource("knight-view.fxml")); //com.example.javaformpractice.blackKnight.
            // create scene to set fxml into
            Scene scene = new Scene(fxmlLoader.load());
            // set title of stage
            stage.setTitle("BlackKnight!");
            //set created scene into stage
            stage.setScene(scene);
            //show stage
            stage.show();

//THIS SHOULD SHOW CONFIRMATION WINDOW BEFORE EXITING WITH X OR ALT+F4, DOES NOT WORK

//            //when user presses to close window with X the exitButtonClicked method will be called
//            stage.setOnCloseRequest(event -> {
//                event.consume(); // when user will press cancel button, it will cancel to close window,
//                // without this line program will close anyway (works with alt+F4 too)
//                exitButtonClicked(stage);
//            });
        }

    void exitButtonClicked(Stage event) {
        //Calls window with messages to confirm exit process
        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to Exit!");
        alert.setContentText("Do you really want to Exit?");
        //After pressing ok executes next code line inside of if statement allowing to exit
        if(alert.showAndWait().get()== ButtonType.OK){
            System.out.println("you have logged out");
            stage.close();
        }

    }
        public static void main(String[] args) {
            launch();
        }
    }

