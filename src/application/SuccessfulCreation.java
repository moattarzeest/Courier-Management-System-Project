package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class SuccessfulCreation {

	Main objMain= new Main();
    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	
    	objMain.changeScene("Admin.fxml");

    }

}
