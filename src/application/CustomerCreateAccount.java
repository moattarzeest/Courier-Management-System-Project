package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CustomerCreateAccount {

	Main objMain= new Main();
	mysql objSQL= new mysql();
	String Name,Contact,Username,Pass,Email;
	
	@FXML
    private TextField name;

    @FXML
    private TextField contact;

    @FXML
    private TextField username;

    @FXML
    private TextField pass;

    @FXML
    private TextField email;
    @FXML
    private Button createAcc;

    @FXML
    private Button back;

    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	
    	objMain.changeScene("Customer.fxml");
    	}
   

    @FXML
    void getContact(MouseEvent event) {

    }

    @FXML
    void getEmail(MouseEvent event) {

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
  
    @FXML
    void clickCreateAcc(MouseEvent event) throws ClassNotFoundException, IOException {
    	 Name=name.getText();
    	Contact=contact.getText();
    	Username=username.getText();
    	Pass=pass.getText();
    	Email=email.getText();
    	
   	objSQL.CustomerCreds(Name,Contact,Username,Pass,Email);
   	objMain.changeScene("CustomerLogin.fxml");

    }


}
