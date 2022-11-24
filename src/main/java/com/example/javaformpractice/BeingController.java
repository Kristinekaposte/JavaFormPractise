package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BeingController {
    Alert alert;

    @FXML
    private RadioButton alienRButton;
    @FXML
    private RadioButton humanRButton;
    @FXML
    private Button relieveButton;
    @FXML
    private ToggleGroup being; // allows to select only one radio button

    @FXML
    private Button feedButton;   @FXML
    private TextArea textAreaID;
    @FXML
    private Label myLableID;


    Being humanBeing = new Being(new Human()); //  creates human object with 3 feeds only by default
    Being alienBeing = new Being(new Alien());//  creates alien object with 5 feeds only by default
    @FXML
    void feedButtonClicked(ActionEvent event) { // allows to feed alien OR human

        if (humanRButton.isSelected() ) {
            humanBeing.human.feedTheBeing();
            textAreaID.setWrapText(true);
            textAreaID.appendText(String.valueOf(humanBeing.human.toString()));
                     if (humanBeing.human.isHungry() == false) {
                          alert = new Alert(Alert.AlertType.WARNING);
                          alert.setContentText("CANT FEED HIM MORE !");
                          alert.show();
                     }




        }if (alienRButton.isSelected()) {
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
                       }}}

    @FXML
    void relieveButtonClicked(ActionEvent event) {
        if(humanRButton.isSelected() && humanBeing.human.isHungry()==false){
            humanBeing.human.relieveTheBeing();
            textAreaID.appendText("\n" +"you are good to eat :)");
            humanBeing.human.isHungry();
        }else{
        textAreaID.appendText("\n" +"Nothing to relieve");
    }
    }




}



