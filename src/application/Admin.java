package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Admin {

	Main objMain= new Main();
	//Logview objLog= new Logview();
	
    @FXML
    private Pane loginButton;

    @FXML
    private Button createAccButton;

    @FXML
    private Button back;
    
    @FXML
    private Button assign;
    
    @FXML
    void clickAssign(MouseEvent event) throws IOException {
    	

    	objMain.changeScene("AssignRider.fxml");
    }

    
    
    @FXML
    void clickCreateAcc(MouseEvent event) throws IOException {
    	objMain.changeScene("CreateAccountRider.fxml");
    	
    }

    
    
    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	objMain.changeScene("Logins.fxml");

    }
    @FXML
    void getOrderData(MouseEvent event) throws IOException {
    	
    	objMain.changeScene("Logivew.fxml");
    	
    	

    }

}
