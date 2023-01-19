import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateFromApi {

	public static void UpdateFromApi() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=sqlApi;encrypt=true;trustServerCertificate=true";
		String user = "sa";
		String pass = "root";
		
		
		String sql = "UPDATE SqlApiTable SET cca2 = ?, cioc = ? ,status = ?, region = ? , subregion = ? , area = ?, population = ? WHERE ID = ?";

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter the id of the row to update: ");
		int ID = scanner.nextInt();
		
//		System.out.print("Enter cca2: ");
//		String cca2 = scanner.next();
//		System.out.print("Enter cioc: ");
//		String cioc = scanner.next();
//		System.out.print("Enter status: ");
//		String status = scanner.next();
//		System.out.print("Enter region: ");
//		String region = scanner.next();
//		System.out.print("Enter subregion: ");
//		String subregion = scanner.next();
//		System.out.print("Enter area: ");
//		float area = scanner.nextInt();
//		System.out.print("Enter population: ");
//		int population = scanner.nextInt();
		
		
		Connection con = null;
	
		try {
			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			// Registering drivers
			DriverManager.registerDriver(driver);
			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);
			
			
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(2, "MK" );
			pstmt.setString(3, "MF" );
			pstmt.setString(4, "MO");
			pstmt.setString(5, "MU");
			pstmt.setString(6, "MS" );
			pstmt.setFloat(7, 2345);
			pstmt.setInt(8, 9876 );		
			pstmt.setInt(1, ID);
			
			
			pstmt.executeUpdate();
			String sql2 = "SELECT * FROM SqlApiTable WHERE ID = ?";
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
			
			pstmt2.setInt(1, ID);
//			pstmt2.setString(2, cca2);
//			pstmt2.setString(3, cioc);
//			pstmt2.setString(4, status);
//			pstmt2.setString(5, region);
//			pstmt2.setString(6, subregion);
//			pstmt2.setFloat(7, area);
//			pstmt2.setInt(8, population );		
//			pstmt2.setInt(9, ID);
			
			
			
			ResultSet result = pstmt2.executeQuery();
			if (result.next()) {
				
				String cca22 = result.getString("cca2");
				String ciocc = result.getString("cioc");
				String statuss = result.getString("status");
				String regionn = result.getString("region");
				String subregionn = result.getString("subregion");
				float areaa = result.getFloat("area");
				int populationn = result.getInt("population");
				System.out.println(ID + " " + cca22 + " " + ciocc + " " + statuss + " " + regionn + " " + subregionn + " " + areaa + " " + populationn );
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	

	}


