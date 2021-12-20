package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mysql {
	
	Main objMain= new Main();
	int counter=0;
	int count=0;
	String check;
	public void CustomerCreds(String name , String contact ,String username, String pass, String email) throws ClassNotFoundException 
	{
		// TODO Auto-generated method stub 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123456binomialtheorem");
			java.sql.Statement st=con.createStatement();
			st.execute ("use mysql");
			ResultSet rs=st.executeQuery("select * from CustomerCredentials");
			
			while(rs.next())
			{
				count++;
				String personName=rs.getString("Name");
				String personContact=rs.getString("Contact");
				String personUser=rs.getString("Username");
				String personPass=rs.getString("Password");
				String personEmail=rs.getString("Email");
				if(personUser.equals(username))
				{
					
					 break;
				}
				else
				{
					
					
					counter++;
				}				
			
			}
			
			if(counter==count)
			{
				String sql="INSERT INTO CustomerCredentials VALUES (?,?,?,?,?)";
				PreparedStatement stat=con.prepareStatement(sql);
				stat.setString(1,name);
				stat.setString(2,contact);
	     		stat.setString(3,username);
	     		stat.setString(4,pass);
	    		stat.setString(5,email);

	     		
				int a=stat.executeUpdate();
			}
			else 
			{
				System.out.println("Username is unavailable, please try again.");
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
