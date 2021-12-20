package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.ObservableList;

public class CustomerCredRetrievel 
{
	//Receipt r=new Receipt();
	Main objMain= new Main();
	Controller[] ArrayCon= new Controller[1];

	public void Retrieve(String USERNAME, String PASS) throws ClassNotFoundException, IOException
	{
	// TODO Auto-generated method stub 
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
		System.out.println("Connection Established");
		Statement stmt= con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from CustomerCredentials");
		while(rs.next())
		{
			
			String name=rs.getString("Name");
			String contact=rs.getString("Contact");
			String user=rs.getString("Username");
			String password=rs.getString("Password");
			String emailAdd=rs.getString("Email");
			if(user.equals(USERNAME) && password.equals(PASS))
			{
				Main.username1=new Username(user);
				objMain.changeScene("MainPage.fxml");
			}
			else
			{
				
			}
		//System.out.println(user +" "+password);
		}
		con.close();
	}
	 catch (SQLException error) 
	{
			// TODO: handle exception
			System.out.print("Driver not found\n");
	}
	catch (ClassNotFoundException e)
	{
		e.printStackTrace();
	}
}
	//****************************************ADMIN LOGINS***************************************************//
	
	public void RetrieveAdminData(String USERNAME, String PASSWORD) throws  ClassNotFoundException, IOException
	{
		// TODO Auto-generated method stub 
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			System.out.println("Connection Established");
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Admin");
			while(rs.next())
			{
				
				String username=rs.getString("Username");
				String password=rs.getString("Password");
				
				if(username.equals(USERNAME) && password.equals(PASSWORD))
				{
					//Main.username1=new Username(user);
					objMain.changeScene("Admin.fxml");
				}
				else
				{
//					//System.out.println("Inavlid username or password");
				}
			
			}
			con.close();
		}
		 catch (SQLException error) 
		{
				// TODO: handle exception
				System.out.print("Driver not found\n");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	//***************************************RIDER CREDENTIALS*************************************//
	public void TrackOrder(String username, int order)
	{
		// TODO Auto-generated method stub 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			String sql="INSERT INTO OrderDetails VALUES(?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			stat.setString(1,username);
			stat.setInt(2,order);
     		
	     		
	     		
     		
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
	//**************************************************************************************************************************//
	public void InsertRiderData(String name, String contact, String username, String pass) throws  ClassNotFoundException, IOException
	{
		// TODO Auto-generated method stub 
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
					java.sql.Statement st=con.createStatement();
					st.execute ("use mysql");
					String sql="INSERT INTO RiderData VALUES(?,?,?,?)";
					PreparedStatement stat=con.prepareStatement(sql);
					stat.setString(1,name);
					stat.setString(2,contact);
		     		stat.setString(3,username);
     	     		stat.setString(4,pass);
     	     		
     	     		
		     		
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
	//**********************************************************************************//
	public void update(String username, int order)
	{
		// TODO Auto-generated method stub 
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
					java.sql.Statement st=con.createStatement();
					st.execute ("use mysql");
					String sql="UPDATE OrderDetails SET Username=?, OrderNumber=? WHERE Username=?";
					
					PreparedStatement stat=con.prepareStatement(sql);
					
					stat.setString(1,username);
					
					stat.setInt(2,order);
					
					stat.setString(3, username);
		     		
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
	
	//*****************************************************************************************************************//
	
	public void  RetrieveRider(String USERNAME, String PASSWORD) throws IOException
	{
		// TODO Auto-generated method stub 
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
					System.out.println("Connection Established");
					Statement stmt= con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from RiderData");
					while(rs.next())
					{
						
						String name=rs.getString("Name");
						String contact=rs.getString("Contact");
						String username=rs.getString("Username");
						String password=rs.getString("Password");
						
						if(username.equals(USERNAME) && password.equals(PASSWORD))
						{
							
							objMain.changeScene("ViewOrders.fxml");
						}
						else
						{
//							
						}
					
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
	}
	
	
	
	
}
