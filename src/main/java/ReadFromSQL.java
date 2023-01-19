import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadFromSQL {

	public static void ReadFromSQL() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=sqlApi;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    
	    System.out.print("Enter id That you want to show : ");
	    Integer insert = scanner.nextInt();
	    int count = 0;
	    String sql = " SELECT * FROM SqlApiTable Where id ="+insert ;
	    
	    Connection con = null;
	    
	    try {

	        Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	        DriverManager.registerDriver(driver);
	        con = DriverManager.getConnection(url, user, pass);

	        Statement st = con.createStatement();
	        
	        ResultSet result = st.executeQuery(sql); //ran the Q like sql
	        
	        while (result.next() && count < insert) {
				int ID = result.getInt("id");
				String cca2 = result.getString("cca2");
				String cioc = result.getString("cioc");
				String status = result.getString("status");
				String region = result.getString("region");
				String subregion = result.getString("subregion");
				Float area = result.getFloat("area");
				int population = result.getInt("population");
				
				
				
				System.out.println(ID + " " + cca2 + " " + cioc + " " + status + " " + region + " " + subregion + " " + area+ " " + population);
				count++;
			}
			con.close();

	    }
        catch (Exception ex) {
	        // Display message when exceptions occurs
	        System.err.println(ex);
	    }
	}
		
		
		

		
		
		
		
	}
