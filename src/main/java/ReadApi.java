import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Statement.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;


public class ReadApi {

	public static void ReadApi() throws IOException, InterruptedException {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=sqlApi;encrypt=true;trustServerCertificate=true";
		String user = "sa";
	    String pass = "root";
	    
	    
		// TODO Auto-generated method stub
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create("https://restcountries.com/v3.1/all"))
	            .build();// fetching the API
	    
	    //HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	    
//	    System.out.println("API JSON :" +response.body());
	    String uglyJsonString=response.body();
	    
	    
	    
	    
	    
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();//
		JsonParser jsonParser = new JsonParser();
		JsonElement jsonElement = jsonParser.parse(uglyJsonString);
		String jsonString = gson.toJson(jsonElement);
		System.out.println(jsonString);
		
		
		
		
	}
	}
