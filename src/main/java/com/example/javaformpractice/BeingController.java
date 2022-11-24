package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BeingController {
    @FXML
    private RadioButton alienRButton;
    @FXML
    private RadioButton humanRButton;
    @FXML
    private Button relieveButton;
    @FXML
    private ToggleGroup being; // allows to select only one radio button, cuz in group

    @FXML
    private Button feedButton;
    @FXML
    private TextArea textAreaID;
    @FXML
    private Label myLableID;
    @FXML
    private Button exitButton;
    @FXML
    private AnchorPane mainAPane;
    Stage stage;
    Alert alert;
    Being humanBeing = new Being(new Human()); //  creates human object with 3 feeds only by default
    Being alienBeing = new Being(new Alien());//  creates alien object with 5 feeds only by default

    @FXML
    void feedButtonClicked(ActionEvent event) { // allows to feed alien OR human

        if (humanRButton.isSelected()) {
            humanBeing.human.feedTheBeing();
            textAreaID.setWrapText(true);
            textAreaID.appendText(String.valueOf(humanBeing.human.toString()));
            if (humanBeing.human.isHungry() == false) {
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("CANT FEED HIM MORE !");
                alert.show();
            }


//ALIENS
        }
        if (alienRButton.isSelected()) {
/*********
 *USING
 *ALERTS
 *
 ********/
            //  alert = new Alert(Alert.AlertType.INFORMATION);
            //   alert.setContentText(alienBeing.alien.toString());
            //   alert.show();
            alienBeing.alien.feedTheBeing();
            //  alert.setContentText(alienBeing.alien.toString());

/*********
 *USING
 *TEXT AREA
 *
 ********/

            textAreaID.setWrapText(true); // this will wrap text horizontally
// for textArea checking out editable
// in scene builder does not allow user to add text, only to see it
            textAreaID.appendText(String.valueOf(alienBeing.alien.toString())); // this will show all previous text which was added
            //  textAreaID.setText(alienBeing.alien.toString()); //  this will not show history of previous texts
/*********
 *USING
 *lABEL
 *
 ********/
            myLableID.setText(alienBeing.alien.toString());

            if (alienBeing.alien.isHungry() == false) {
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("CANT FEED HIM MORE !");
                alert.show();
            }
        }
    }

    @FXML
    void relieveButtonClicked(ActionEvent event) {
        if (humanRButton.isSelected() && humanBeing.human.isHungry() == false) {  //  we need false line, otherwise - always will show you are good to eat
            humanBeing.human.relieveTheBeing();
            textAreaID.appendText("\n" + "You are good to eat again :)");
        } else if (alienRButton.isSelected() && alienBeing.alien.isHungry() == false) {  //  we need false line, otherwise - always will show you are good to eat
            alienBeing.alien.relieveTheBeing();
            textAreaID.appendText("\n" + "You are good to eat again :)");
        } else {
            textAreaID.appendText("\n" + "Nothing to relieve, eat more");
        }

    }
    @FXML
    void exitButtonClicked(ActionEvent event) {
        //Calls window with messages to confirm exit process
        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to Exit!");
        alert.setContentText("Do you really want to Exit?");
        //After pressing ok executes next code line inside of if statement allowing to exit
        if(alert.showAndWait().get()== ButtonType.OK){
            //closes the window
            stage = (Stage) mainAPane.getScene().getWindow();
            System.out.println("you have logged out");
            stage.close();
        }


    }
}



