package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewOrders implements Initializable {
	
	
	ReceiptSQL objR= new ReceiptSQL();
    ObservableList<Controller>c= objR.getRiderData();
    @FXML
    private TableView<Controller> tableOrder;

    @FXML
    private TableColumn<Controller, String> sender;

    @FXML
    private TableColumn<Controller,  String> pickup;

    @FXML
    private TableColumn<Controller,  String> dropoff;

    @FXML
    private TableColumn<Controller,  String> weight;

    @FXML
    private TableColumn<Controller,  String> product;

    @FXML
    private TableColumn<Controller, Integer> bill;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
		sender.setCellValueFactory(new PropertyValueFactory<Controller,String>("sender"));
		pickup.setCellValueFactory(new PropertyValueFactory<Controller,String>("pickup"));
		dropoff.setCellValueFactory(new PropertyValueFactory<Controller,String>("dropoff"));
		weight.setCellValueFactory(new PropertyValueFactory<Controller,String>("weight"));
		product.setCellValueFactory(new PropertyValueFactory<Controller,String>("product"));
		bill.setCellValueFactory(new PropertyValueFactory<Controller,Integer>("bill"));
		tableOrder.setItems(c);
		
	}
    
    
    
    

}
