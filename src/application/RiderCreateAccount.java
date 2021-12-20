package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RiderCreateAccount {

	Main objMain=new Main();
	CustomerCredRetrievel objCred=new CustomerCredRetrievel();
	ReceiptSQL objR=new ReceiptSQL();
	int order=objR.OrderNumber();
    @FXML
    private TextField name;

    @FXML
    private TextField contact;

    @FXML
    private TextField username;

    @FXML
    private TextField pass;


    
    @FXML
    private Button createAcc;

    @FXML
    private Button back;

    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	objMain.changeScene("Logins.fxml");

    }

    @FXML
    void clickCreateAcc(MouseEvent event) throws ClassNotFoundException, IOException {
    	String riderName=name.getText();
    	String riderContact=contact.getText();
    	String riderUsername=username.getText();
    	String riderPass=pass.getText();

    	
    	objCred.InsertRiderData(riderName, riderContact, riderUsername, riderPass);
    	objCred.TrackOrder(riderUsername,0);
    	objMain.changeScene("SuccessfulCreation.fxml");
    	
    	
    }
    
    

    @FXML
    void getContact(MouseEvent event) {

    }


    @FXML
    void getName(MouseEvent event) {

    }

    @FXML
    void getPass(MouseEvent event) {

    }

    @FXML
    void getUsername(MouseEvent event) {

    }

}
