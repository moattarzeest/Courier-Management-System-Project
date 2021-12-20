package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Details {

	int price;
	Main objMain= new Main();
	//Receipt objReceipt=new Receipt();
	
	
    @FXML
    private TextField name;

    @FXML
    private TextField length;

    @FXML
    private TextField width;

    @FXML
    private TextField weight;

    @FXML
    private Button checkout;
    
    @FXML
    private Button back;
    
    @FXML
    void getLength(MouseEvent event) {

    }
   

    @FXML
    void clickBack(MouseEvent event) throws IOException {
    	objMain.changeScene("MainPage.fxml");

    }

    
    @FXML
    void getName(MouseEvent event) {

    }

    @FXML
    void getWeight(MouseEvent event) {

    }

    @FXML
    void getWidth(MouseEvent event) {

    }
    
    void calcPrice()
    
    {
    	
    	
    	
    	
    	
    	    	
    	//objReceipt.getDetails(WEIGHT,NAME,price);
    }
    @FXML
    void clickCheckout(MouseEvent event) throws IOException {
    	String WEIGHT=weight.getText();
    	String NAME=name.getText();
    	if (Integer.parseInt(WEIGHT)> 0 && Integer.parseInt(WEIGHT)<=1)
    	{
    		price=100;
    		Main.item1=new Item(WEIGHT, NAME, price);
    	}
    	else if (Integer.parseInt(WEIGHT)> 1 && Integer.parseInt(WEIGHT)<=5)
    	{
    		price=250;
    		Main.item1=new Item(WEIGHT, NAME, price);
    	}
    	else if (Integer.parseInt(WEIGHT)> 5 && Integer.parseInt(WEIGHT)<=10)
    	{
    		price=500;
    		Main.item1=new Item(WEIGHT, NAME, price);
    	}
    	else if (Integer.parseInt(WEIGHT)> 10 && Integer.parseInt(WEIGHT)<=20)
    	{
    		price=1500;
    		Main.item1=new Item(WEIGHT, NAME, price);
    	}
    	else if (Integer.parseInt(WEIGHT)> 20 && Integer.parseInt(WEIGHT)<=30)
    	{
    		price=2500;
    		Main.item1=new Item(WEIGHT, NAME, price);
    	}
    	else if (Integer.parseInt(WEIGHT)> 30)
    	{
    		price=5000;
    		Main.item1=new Item(WEIGHT, NAME, price);
    	}
    	else
    	{
    		price=0;
    		Main.item1=new Item(WEIGHT, NAME, price);
    		//exception bnani ha bc
    	}
    	
    	
    	objMain.changeScene("Checkout.fxml");
    }

}
