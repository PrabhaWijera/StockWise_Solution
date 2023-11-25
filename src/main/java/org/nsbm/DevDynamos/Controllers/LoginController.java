package org.nsbm.DevDynamos.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import org.nsbm.DevDynamos.Util.Navigation;
import org.nsbm.DevDynamos.Util.Routes;

import java.io.IOException;

public class LoginController {
    public BorderPane brdrPaneLogin;
    public Pane paneLogin;
    public Pane innerLoginPane;
    public JFXPasswordField pswdPassword;
    public JFXButton btnLogin;
    public JFXTextField txtUsername;
    public Label lblForgetPassword;
    public Label lblUserNameError;
    public Label lblPasswordError;

    public void pswdPasswordOnAction(ActionEvent actionEvent) {
    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        accessLogin();
    }

    public void accessLogin() throws IOException {
        //get your typing input userName and Password
        String tempUserName=txtUsername.getText();
        String tempPassword=pswdPassword.getText();
        System.out.println("LoginForm Working 🔖🔖🔖");
        //check your input in condition
        if (tempUserName.equals("chaki") && tempPassword.equals("2001")){
            Navigation.navigate(Routes.DASHBOARD,brdrPaneLogin);
        }else {
            System.out.println("not naviaget");
        }

    }

    public void lblForgetPasswordOnMouseClick(MouseEvent mouseEvent) {
    }
}
