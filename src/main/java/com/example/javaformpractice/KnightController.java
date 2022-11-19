package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class KnightController {
private Stage stage;

    @FXML
    private Text knightNameText;

    @FXML
    private TextField knightNameTextInput;

    @FXML
    private Button startButton;

    Alert alert;
    BlackKnight blackKnight;


    @FXML
    void CreateKnightButton(ActionEvent event) {

        blackKnight = new BlackKnight(knightNameTextInput.getText());
      //  knightNameText.getText(); // empty one will not change name bar text.      //nameTextInput.getText()   - this will change Name bar to user input string
        BlackKnight.allKnights[0]=blackKnight;


        if (knightNameTextInput.getText().isEmpty()){
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error you need to fill name field");
            alert.show();
        } else {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Knight created: "+'\n'+"NAME: "+knightNameTextInput.getText()+
                                                    '\n'+"\n"+"PARAMETERS:" +blackKnight.toString());
            alert.show();
        }
    }
        public String getKnight(){
        return knightNameTextInput.getText().toString();
        }

    public void StartButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KnightApplication.class.getResource("knight-strike.fxml")); //com.example.javaformpractice.blackKnight.
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();


        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(" Strike the BlackKnight !");



        if (knightNameTextInput.getText().isEmpty()){
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("FIRST CREATE KNIGHT!");
            alert.show();
        }else {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("knight has been made, you can start game");
            alert.show();
            stage.setScene(scene); //  creates and allows to cont to next sceene if name is provided
            stage.show();
        }
    }
//    @FXML
//    void StartButtonClicked(ActionEvent event) {
//
//        if (knightNameTextInput.getText().isEmpty()){
//            alert = new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("FIRST CREATE KNIGHT!");
//            alert.show();
//        }else {
//            alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setContentText("knight is already made, you can start game");
//            alert.show();
//
//        }
//
//    }


}