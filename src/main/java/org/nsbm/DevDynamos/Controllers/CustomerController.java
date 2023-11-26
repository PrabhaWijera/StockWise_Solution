package org.nsbm.DevDynamos.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import org.nsbm.DevDynamos.Dao.custom.impl.CustomerDaoimpl;
import org.nsbm.DevDynamos.Dto.CustomerDto;
import org.nsbm.DevDynamos.Service.ServiceFactory;
import org.nsbm.DevDynamos.Service.ServiceType;
import org.nsbm.DevDynamos.Service.custom.CustomerService;
import org.nsbm.DevDynamos.Service.custom.impl.CustomerServiceimpl;

import javax.persistence.Id;
import java.sql.SQLException;
import java.util.Objects;

public class CustomerController {

    public JFXTextField nameTxt;
    public JFXTextField addressTxt;
    public JFXTextField contactNumberTxt;
    public JFXTextField nicTxt;
    public JFXButton btnSave;

    private final CustomerService customerService = (CustomerService) ServiceFactory.getBOFactory().getBO(ServiceType.CUSTOMER);
    public JFXTextField IdTxt;

    public void initialize() {

    }


    public void AddOnAction(ActionEvent actionEvent) {
        String id=IdTxt.getText();
        String name=nameTxt.getText();
        String address=addressTxt.getText();
        String nic=nicTxt.getText();
        int concatNumber= Integer.parseInt(nicTxt.getText());

        CustomerDto customerDto=new CustomerDto(id,name,address,nic,concatNumber);
        CustomerServiceimpl customerServiceimpl= (CustomerServiceimpl) ServiceFactory.getBOFactory().getBO(ServiceType.CUSTOMER);

        try {
            customerService.save(customerDto);
            if (customerServiceimpl!=null){
                new Alert(Alert.AlertType.CONFIRMATION,"Customer Add").show();
            }else {
                new Alert(Alert.AlertType.ERROR,"No Add").show();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        IdTxt.clear();
        nameTxt.clear();
        addressTxt.clear();
        nicTxt.clear();
        contactNumberTxt.clear();
    }


    public void IdTxtOnAction(ActionEvent actionEvent) {
        String id = IdTxt.getText();
        CustomerDto customerdto = CustomerDaoimpl.search(id);
        if (customerdto != null) {
            fillData(customerdto);
        }
    }

    private void fillData(CustomerDto customerdto) {
        IdTxt.setText(customerdto.getId());
        nameTxt.setText(customerdto.getName());
        addressTxt.setText(customerdto.getAddress());
        nicTxt.setText(customerdto.getNIc());
        contactNumberTxt.setText(String.valueOf(customerdto.getContactNumber()));
    }
}
