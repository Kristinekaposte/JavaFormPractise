package com.example.javaformpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class UserDataApplication extends Application {
    Alert alert1;
    Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        //we create fxml loader and load fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(UserDataApplication.class.getResource("user-data.fxml"));
        // create scene to set fxml into
        Scene scene = new Scene(fxmlLoader.load());
        // set title of stage
        stage.setTitle("User Data!");
        //set created scene into stage
        stage.setScene(scene);
        //show stage
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
