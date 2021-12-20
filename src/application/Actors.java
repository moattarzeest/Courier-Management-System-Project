package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Actors implements Initializable {

	Main objMain= new Main();
	
    @FXML
    private Button adminButton;

    @FXML
    private Button customerButton;

    @FXML
    private Button exitButton;
    
    @FXML
    private Button rider;

    @FXML
    void clickCustomer(MouseEvent event) throws IOException {
    	
    	objMain.changeScene("Customer.fxml");

    }

    

    @FXML
    void clickAdmin(MouseEvent event) throws IOException {
    	
    	objMain.changeScene("AdminLogin.fxml");

    }
    
    @FXML
    void clickExit(MouseEvent event) {
    	
    	System.exit(0);

    }
    @FXML
    void clickRider(MouseEvent event) throws IOException {

    	objMain.changeScene("RiderLogin.fxml");
    }
    
    public void initialize(URL url, ResourceBundle rb)
    {
    	exitButton.setStyle("-fx-background-color: #9932CC; -fx-background-radius: 20px; -fx-text-fill: #ffffff");
    }
    

}
