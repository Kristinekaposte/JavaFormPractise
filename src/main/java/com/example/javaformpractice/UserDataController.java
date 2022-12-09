package com.example.javaformpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserDataController {
    Alert alert;
    Stage stage;
    @FXML
    private TextField ageTextInput;

    @FXML
    private TextField genderTextInput;

    @FXML
    private TextField nameTextInput;
    @FXML
    private TextField professionTextInput;
    @FXML
    private AnchorPane myAnchorPane;

    @FXML

    void AddButtonClicked(ActionEvent event) {
        if (nameTextInput.getText().isEmpty()
                || ageTextInput.getText().isEmpty()
                || genderTextInput.getText().isEmpty()
                || professionTextInput.getText().isEmpty()){
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error you need to fill all fields");
            alert.show();


        } else {
            addUserData();

            alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("User data added: " + ""
                    +'\n'+"NAME: "+nameTextInput.getText()
                    +'\n'+"\n"+"Age:" +ageTextInput.getText()
                    +'\n'+"\n"+"Gender:" +genderTextInput.getText()
                    +'\n'+"\n"+"Age:" +professionTextInput.getText()
                    +'\n'+"\n"+'\n'+ "Do you want to exit ?"
            );
            if(alert.showAndWait().get() == ButtonType.OK) {
                stage = (Stage) myAnchorPane.getScene().getWindow(); // casting to scene, so w can log out after pressing ok
                System.out.println("you have logged out");
                stage.close();
            }
        }
    }


    public void addUserData(){
        String nameText = nameTextInput.getText();
        String ageText = ageTextInput.getText();
        String genderText = genderTextInput.getText();
        String professionText = professionTextInput.getText();
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src/main/java/com/example/javaformpractice/inputOutput/files/userData.txt");
            out = new FileOutputStream("src/main/java/com/example/javaformpractice/inputOutput/files/userData_Output.txt");

            int c;
            // READ FROM INPUT AND WRITE TO OUTPUT
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            String titleInput = "USER BIO " + '\n';
            byte[] byteTitle = titleInput.getBytes();
            out.write(byteTitle);

            String nameInput = "Name: ";

            byte[] byteNameInput = nameInput.getBytes();
            out.write(byteNameInput);
            byte[] byteName = nameText.getBytes();
            out.write(byteName);

            String ageInput = '\n' + "Age: ";

            byte[] byteAgeInput = ageInput.getBytes();
            out.write(byteAgeInput);
            byte[] byteAge = ageText.getBytes();
            out.write(byteAge);

            String genderInput = '\n' +"Gender: ";

            byte[] byteGenderInput = genderInput.getBytes();
            out.write(byteGenderInput);
            byte[] byteGender = genderText.getBytes();
            out.write(byteGender);

            String professionInput = '\n' +"Profession: ";

            byte[] byteProfessionInput = professionInput.getBytes();
            out.write(byteProfessionInput);
            byte[] byteProfession = professionText.getBytes();
            out.write(byteProfession);


        } catch (IOException e) {
            e.printStackTrace();
        } finally { //  once done with everything do this:
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }}}}
    }

}
