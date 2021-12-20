  package application;

import java.io.IOException;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CustomerLogin {

	Main objMain= new Main();
	CustomerCredRetrievel objRet =new CustomerCredRetrievel();
	String Username;
	String Pass;
	@FXML
    private TextField username;

	 @FXML 
	 private PasswordField pass;

    @FXML
    private Button login;

    @FXML
    private Button back;

    @FXML
    void clickBack(MouseEvent event) throws IOException {

    	objMain.changeScene("Customer.fxml");
    }

   
    @FXML
    void getPass(MouseEvent event) {

    }

    @FXML
    void getUsername(MouseEvent event) {

    }
    
    @FXML
    void clickLogin(MouseEvent event) throws ClassNotFoundException, IOException {
    	Username=username.getText();
    	Pass=pass.getText();
    	System.out.println("Username is: "+Username);
    	System.out.println("Pass is: "+Pass);
    	objRet.Retrieve(Username,Pass);
    }

}
