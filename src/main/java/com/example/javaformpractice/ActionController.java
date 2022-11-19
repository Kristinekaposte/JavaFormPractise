package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.util.Arrays;

public class ActionController {
    Alert alert;
    BlackKnight blackKnight;

    @FXML
    private Button strikeButtonText;

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
//
//
//            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
//            alert1.setContentText("knight is no longer alive");
//            alert1.show();
//       }

            //  System.out.println("Your knight is : "+  knightController);
            //   System.out.println("Your knight stats: "+allKnight);

            //  System.out.println(" after strike:  "+allKnight.toString());



    }
}

