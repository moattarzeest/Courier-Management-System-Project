package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AssignRider {

	Main objMain=new Main();
	ReceiptSQL objR=new ReceiptSQL();
	CustomerCredRetrievel  objCred= new CustomerCredRetrievel ();
	int count=objR.OrderNumber()+1;
	
    @FXML
    private TextField assignUser;

    @FXML
    void enter(MouseEvent event) throws IOException {
    	String username=assignUser.getText();
    	objCred.update(username,count);
    	objMain.changeScene("Admin.fxml");
    	
    	

    }

}
