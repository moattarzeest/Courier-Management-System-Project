package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReceiptSQL {
	
	
	
	public void storeReceipt(int order,String name, String pickup, String dropoff, String weight, String productName, int price) throws ClassNotFoundException 
	{
		
		// TODO Auto-generated method stub 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			String sql="INSERT INTO Logview VALUES (?,?,?,?,?,?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			stat.setInt(1,order);
			stat.setString(2,name);
			stat.setString(3,pickup);
     		stat.setString(4,dropoff);
     		stat.setString(5,weight);
    		stat.setString(6,productName);
    		stat.setInt(7,price);

     		
			int a=stat.executeUpdate();
			con.close();
		}
		 catch (SQLException e) 
		{
				// TODO: handle exception
				System.out.print("Driver not found\n");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

}
	ObservableList<UseData> objUse=FXCollections.observableArrayList();
	public ObservableList<UseData> getLogData()
	{
		int var=OrderNumber();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			

     		ResultSet rs=st.executeQuery("select * from Logview");
     		while(rs.next())
     		{
     			//int order=rs.getInt("OrderNo");
     			String username=rs.getString("Username");
    			String pickup=rs.getString("Pickup");
    			String dropoff=rs.getString("Dropoff");
    			String weight=rs.getString("Weight");
    			String product=rs.getString("Product");
    			int bill=rs.getInt("Bill");
    		    objUse.add(new UseData( username, pickup, dropoff, weight, product, bill));
    		   // System.out.println(username);
    		    
    			
     		}
			
			con.close();
		}
		 catch (SQLException e) 
		{
				// TODO: handle exception
				System.out.print("Driver not found\n");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return objUse;

	}
	//**********************************************************************************************************//
	ObservableList<Controller> c=FXCollections.observableArrayList();
	public ObservableList<Controller> getRiderData()
	{
		int var=OrderNumber();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			

     		ResultSet rs=st.executeQuery("select * from Logview");
     		while(rs.next())
     		{
     			if(rs.getInt("OrderNo") == var)
     			{
     			//int order=rs.getInt("OrderNo");
     			String username=rs.getString("Username");
    			String pickup=rs.getString("Pickup");
    			String dropoff=rs.getString("Dropoff");
    			String weight=rs.getString("Weight");
    			String product=rs.getString("Product");
    			int bill=rs.getInt("Bill");
    		    c.add(new Controller(username, pickup, dropoff, weight, product, bill));
     			}
    		   // System.out.println(username);
    		    
    			
     		}
			
			con.close();
		}
		 catch (SQLException e) 
		{
				// TODO: handle exception
				System.out.print("Driver not found\n");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return c;

	}
	
	//*******************************************************************************************************//
	public int OrderNumber()
	{
		int count=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			

     		ResultSet rs=st.executeQuery("select * from Logview");
     		while(rs.next())
     		{
     			int order=rs.getInt("OrderNo");
     			String username=rs.getString("Username");
    			String pickup=rs.getString("Pickup");
    			String dropoff=rs.getString("Dropoff");
    			String weight=rs.getString("Weight");
    			String product=rs.getString("Product");
    			int bill=rs.getInt("Bill");
    		   count++;
    		    
    			
     		}
			
			con.close();
		}
		 catch (SQLException e) 
		{
				// TODO: handle exception
				System.out.print("Driver not found\n");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return count;

	}
	
	
	
	
}
