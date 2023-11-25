package org.nsbm.DevDynamos.Util;

import animatefx.animation.FadeIn;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {

    private static BorderPane pane;


    public static void navigate(Routes routes, BorderPane pane) throws IOException {
        new FadeIn(pane).play();
        Navigation.pane=pane;
        Navigation.pane.getChildren().clear();
        Stage window= (Stage) Navigation.pane.getScene().getWindow();

        switch (routes){

            case DASHBOARD:
                window.setTitle("MainDashBoard");
                initUI("DashBoradPane.fxml");
                break;

            default:
                new Alert(Alert.AlertType.ERROR,"UI NOT FOUND!!! ").show();
        }
    }

    public static void initUI(String location) throws IOException {
        Navigation.pane.getChildren().add(FXMLLoader.load(Navigation.class.getResource("/view/"+location)));
    }
}
