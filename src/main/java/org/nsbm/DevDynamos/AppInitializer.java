package org.nsbm.DevDynamos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = AppInitializer.class.getResource("");
        primaryStage.setScene(new Scene(FXMLLoader.load(resource)));
        primaryStage.setTitle("D24 - Hostel.");
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}