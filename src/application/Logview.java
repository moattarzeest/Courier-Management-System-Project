package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class Logview implements Initializable{
	
        ReceiptSQL objR= new ReceiptSQL();
        ObservableList<UseData>objUse= objR.getLogData();
        @FXML
        private TableView<UseData> TableLog;

       
	    @FXML
	    private TableColumn<UseData, String> User;

	    @FXML
	    private TableColumn<UseData, String> pickup;

	    @FXML
	    private TableColumn<UseData, String> dropoff;

	    @FXML
	    private TableColumn<UseData, String> weight;

	    @FXML
	    private TableColumn<UseData, String> product;

	    @FXML
	    private TableColumn<UseData, Integer> bill;
	    
	    
	    


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	
		
		User.setCellValueFactory(new PropertyValueFactory<UseData,String>("User"));
		pickup.setCellValueFactory(new PropertyValueFactory<UseData,String>("pickup"));
		dropoff.setCellValueFactory(new PropertyValueFactory<UseData,String>("dropoff"));
		weight.setCellValueFactory(new PropertyValueFactory<UseData,String>("weight"));
		product.setCellValueFactory(new PropertyValueFactory<UseData,String>("product"));
		bill.setCellValueFactory(new PropertyValueFactory<UseData,Integer>("bill"));
		TableLog.setItems(objUse);
		
	}

}
