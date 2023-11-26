package org.nsbm.DevDynamos.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import org.nsbm.DevDynamos.Dto.CustomerDto;
import org.nsbm.DevDynamos.Service.ServiceFactory;
import org.nsbm.DevDynamos.Service.ServiceType;
import org.nsbm.DevDynamos.Service.custom.CustomerService;

public class CustomerController {


    public JFXTextField nameTxt;
    public JFXTextField addressTxt;
    public JFXTextField contactNumberTxt;
    public JFXTextField nicTxt;
    public JFXButton btnSave;

    private final CustomerService customerService = (CustomerService) ServiceFactory.getBOFactory().getBO(ServiceType.CUSTOMER);

    public void initialize() {

    }

    public void AddOnAction(ActionEvent actionEvent) {
        String id = "001";
        String name = nameTxt.getText();
        String address = addressTxt.getText();
        String nic = nicTxt.getText();
        int contact = Integer.parseInt(contactNumberTxt.getText());

        try {
            if (btnSave.getText().equalsIgnoreCase("save")) {
                boolean save = customerService.save(new CustomerDto(id, name, address, nic,  contact));

                if (!save) {
                    new Alert(Alert.AlertType.ERROR, "Failed to save the User").show();
                }
            } else {
                // Logic for updating an existing customer
                // You may want to implement this part
            }
        } catch (Exception e) {
            // Handle exceptions appropriately
            e.printStackTrace();
        }
    }
}
