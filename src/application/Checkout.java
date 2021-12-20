package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Checkout {

	Main objMain= new Main();
    @FXML
    private TextField senderName;

    @FXML
    private TextField senderContact;

    @FXML
    private TextField senderEmail;

    @FXML
    private TextField receiverName;

    @FXML
    private TextField receiverContact;

    @FXML
    private TextField receiverEmail;

    @FXML
    private Button back;

    @FXML
    private Button submit;

    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	objMain.changeScene("Details.fxml");
    }

    @FXML
    void clickSubmit(MouseEvent event) throws IOException {

    	objMain.changeScene("Receipt.fxml");
    }

    @FXML
    void getReceiverContact(MouseEvent event) {

    }

    @FXML
    void getReceiverEmail(MouseEvent event) {

    }

    @FXML
    void getRecieverName(MouseEvent event) {

    }

    @FXML
    void getSenderContact(MouseEvent event) {

    }

    @FXML
    void getSenderEmail(MouseEvent event) {

    }

    @FXML
    void getSenderName(MouseEvent event) {

    }

}
