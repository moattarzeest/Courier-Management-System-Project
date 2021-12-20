package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RiderLogin {

	Main objMain= new Main();
	CustomerCredRetrievel objCred= new CustomerCredRetrievel ();
    @FXML
    private TextField username;

    @FXML
    private TextField pass;
    
    @FXML
    private Button login;

    @FXML
    private Button back;

    @FXML
    void clickBack(MouseEvent event) throws IOException {

    	objMain.changeScene("Logins.fxml");
    }

    @FXML
    void clickLogin(MouseEvent event) throws IOException {

    	String user=username.getText();
    	String password=pass.getText();
    	objCred.RetrieveRider(user, password);
    	
    	
    }

    @FXML
    void getPass(MouseEvent event) {

    }

    @FXML
    void getUsername(MouseEvent event) {

    }

}
