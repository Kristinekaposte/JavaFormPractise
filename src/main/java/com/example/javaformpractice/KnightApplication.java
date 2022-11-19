package com.example.javaformpractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class KnightApplication extends Application {
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

        }

        public static void main(String[] args) {
            launch();
        }
    }

