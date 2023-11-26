package org.nsbm.DevDynamos.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.nsbm.DevDynamos.Util.Navigation;
import org.nsbm.DevDynamos.Util.Routes;

import java.io.IOException;

public class DashBoard {
    public JFXButton go;
    public AnchorPane pane;

    public void goOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.CUSTOMER,pane);
    }
}
