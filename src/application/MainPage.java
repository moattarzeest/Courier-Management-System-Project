package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainPage {
 
	
	Main objMain=new Main();
	locationSQL objLoc= new locationSQL();
	//Receipt objReceipt=new Receipt();
    @FXML
    private TextField pickup;

    @FXML
    private TextField destination; 

    @FXML
    private Button confirm;

    @FXML
    private Button back;

    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	objMain.changeScene("CustomerLogin.fxml");

    }

    @FXML
    void getDestination(MouseEvent event) {

    }

    @FXML
    void getPickup(MouseEvent event) {

    }
   
    @FXML
    void clickConfirm(MouseEvent event) throws IOException, ClassNotFoundException 
    {	
    	String pick=pickup.getText();
    	String dropoff=destination.getText();
    	//objLoc.locations(pick,dropoff);
    	//objReceipt.productLocations(pick, dropoff);
    	Main.pickup1=new Pickup(pick, dropoff);
    	objMain.changeScene("Details.fxml");
    	
    }

}
