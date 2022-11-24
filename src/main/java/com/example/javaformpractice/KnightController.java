package com.example.javaformpractice;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class KnightController {
private Stage stage;

    @FXML
    private Text knightNameText;

    @FXML
    private TextField knightNameTextInput;

    @FXML
    private Button startButton;
    @FXML
    private Button mainExitButton;

    Alert alert;
    BlackKnight blackKnight;
    Parent root;
    Scene scene;

    @FXML
    void mainExitButtonClicked(ActionEvent event) {
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

    @FXML
    void CreateKnightButton(ActionEvent event) throws IOException{
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

    public void StartButtonClicked(ActionEvent event) throws IOException {
        String knightName = knightNameTextInput.getText(); // will store our text found within our knightNameTextInput into string variable that we can use

        // create FXML loader instance
        FXMLLoader loader = new FXMLLoader(getClass().getResource("knight-strike.fxml"));
        root=loader.load();

        ActionController actionController= loader.getController();
        actionController.displayLabelName(knightName);


     //   FXMLLoader fxmlLoader = new FXMLLoader(KnightApplication.class.getResource("knight-strike.fxml")); //com.example.javaformpractice.blackKnight.
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle(" Strike the BlackKnight !");



        if (knightNameTextInput.getText().isEmpty()){
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("FIRST CREATE KNIGHT!");
            alert.show();

        }else {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Game has been successfully made, good luck");
            alert.show();
            stage.setScene(scene); //  creates and allows to continue to next scene if name is provided
            stage.show();

        }
    }
}