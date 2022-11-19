package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class HelloController {

    @FXML
    private Text ageText;

    @FXML
    private TextField ageTextInput;

    @FXML
    private Text genderText;

    @FXML
    private TextField genderTextInput;

    @FXML
    private Text nameText;

    @FXML
    private TextField nameTextInput;

    @FXML
    private Label welcomeText;
    @FXML
    protected void onButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


//    @FXML
//    void onButtonClick(ActionEvent event) {
//        inputText.setText(input.getText());
//        //create alert using java fx
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setContentText("value of text has been changed!");
//        alert.show();
//
//    }

    @FXML
    void onButtonClick(ActionEvent event) {
        nameText.getText(); // empty one will not change name bar text.      //nameTextInput.getText()   - this will change Name bar to user input string
        genderText.getText();
        ageText.getText();
    Alert alert;

        if (nameTextInput.getText().isEmpty()){

            alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error you need to fill name field");
            alert.show();
        }
        else if(genderTextInput.getText().isEmpty()){
             alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error you need to fill gender field");
            alert.show();
        }
        else if(ageTextInput.getText().isEmpty()){
             alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error you need to fill age field");
            alert.show();
        }
        else {
             alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("You have inserted: "+'\n'+"Name: "+nameTextInput.getText()+'\n'+"Gender: "+genderTextInput.getText()+'\n'+"Age: "+ageTextInput.getText());
            alert.show();
        }
    }
}

// create a simple user registration form with fields
// first name, last name, gender, age
// when user submits, check to make sure all fields have been filled
// if not, display an error alert showing what fields are required
// if all fields are provided, display the user info in an alert
/**
 * name: John Doe
 * gender: male
 * age: 39
 */



//public class HelloController {
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
//}