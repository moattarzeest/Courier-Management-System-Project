package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Customer {

	Main objMain= new Main();
    @FXML
    private Button createAccButton; 
    

    @FXML
    private Button loginButton;

    @FXML
    private Button back;

    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	objMain.changeScene("Logins.fxml");

    }

    @FXML
    void clickCreateAcc(MouseEvent event) throws IOException {
    	objMain.changeScene("CustomerCreateAcc.fxml");

    }

    @FXML
    void clickLogin(MouseEvent event) throws IOException {
    	objMain.changeScene("CustomerLogin.fxml");

    }

}
