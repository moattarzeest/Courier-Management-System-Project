package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AdminLogin {

	Main objMain= new Main();
	CustomerCredRetrievel objCred= new CustomerCredRetrievel();
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button back;

    @FXML
    private Button login;
    
    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	objMain.changeScene("Logins.fxml");

    }

    @FXML
    void clickLogin(MouseEvent event) throws ClassNotFoundException, IOException {

    	String name=username.getText();
    	String pass=password.getText();
    	objCred.RetrieveAdminData(name,pass);
    	
    }


}
