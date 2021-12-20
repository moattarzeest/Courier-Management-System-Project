package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Receipt implements Initializable
{
	//mydata md=new mydata();
	Main objMain= new Main();
	ReceiptSQL objR=new ReceiptSQL();
	String username=objMain.username1.getUsername();
	String weight=objMain.item1.getWeight();
	String pName=objMain.item1.getName();
	String pick=objMain.pickup1.getPickup();
	String drop=objMain.pickup1.getDropoff();
	int price=objMain.item1.getPrice();
	int count=objR.OrderNumber()+1;
    @FXML
    private Label orderNumber;

    @FXML
    private Label name;

    @FXML
    private Label productWeight;

    @FXML
    private Label productName;

    @FXML
    private Label dropoff;

    @FXML
    private Label pickup;

    @FXML
    private Label bill;
    
    
    public void getDetails(String productWeight, String productName, int Price)
    {
    	
    	weight=productWeight;
    	pName=productName;
    	price=Price;
    }
    public void productLocations(String pickup, String dropoff)
    {
    	pick=pickup;
    	drop=dropoff;
    }
    @FXML
    void clickLog(MouseEvent event) throws IOException {

    	
    	objMain.changeScene("Logins.fxml");
    }

    public void initialize(URL location, ResourceBundle resources) 
    {
		// TODO Auto-generated method stub
    	
    	name.setText(username);
    	pickup.setText(pick);
    	dropoff.setText(drop);
    	productWeight.setText(weight);
    	productName.setText(pName);
    	bill.setText(Integer.toString(price));	
    	orderNumber.setText(Integer.toString(count));
    	
    	try {
			objR.storeReceipt(count,username,pick,drop,weight,pName,price);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
	}
    public int orderCheck()
    {
    	return count;
    }
}
