package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

public class ActionController {
    Alert alert;

    BlackKnight blackKnight;
    Stage stage;
    @FXML
    private Label nameLabelId;
    @FXML
    private Button strikeButtonText;
    @FXML
    private Button exitButton;
    @FXML
    private AnchorPane strikePane;

    @FXML
    void exitButtonClicked(ActionEvent event)  {
  //Calls window with messages to confirm exit process
        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to Exit!");
        alert.setContentText("Do you really want to Exit?");
 //After pressing ok executes next code line inside of if statement allowing to exit
            if(alert.showAndWait().get()== ButtonType.OK){
                //closes the window
                stage = (Stage) strikePane.getScene().getWindow();
                System.out.println("you have logged out");
                stage.close();
            }

    }


    public void displayLabelName (String knightName){
        nameLabelId.setText("Hello:" + knightName);
    }

    @FXML
    void strikeButtonClicked(ActionEvent event) {

        BlackKnight allKnight = BlackKnight.allKnights[0];
      // if(){
            alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setContentText("Your knight stats: " + allKnight);
            alert.show();
            allKnight.strike();

            alert.setContentText("STRIKE!, stats left: " + allKnight);
            alert.show();
//       }else{

    }
}

