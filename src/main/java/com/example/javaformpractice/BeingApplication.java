package com.example.javaformpractice;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class BeingApplication extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            //we create fxml loader and load fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(BeingApplication.class.getResource("being-view.fxml"));
            // create scene to set fxml into
            Scene scene = new Scene(fxmlLoader.load());
            // set title of stage
            stage.setTitle("Feeding simulator");
            //set created scene into stage
            stage.setScene(scene);
            //show stage
            stage.show();

        }

        public static void main(String[] args) {
            launch();
        }
    }

