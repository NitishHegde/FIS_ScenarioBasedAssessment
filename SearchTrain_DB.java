import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SearchTrain_DB {
 
 	private static Connection con = null;
// 	private static Properties props = new Properties();
 	
 
 //ENSURE YOU DON'T CHANGE THE BELOW CODE WHEN YOU SUBMIT
 	public static Connection getConnection() throws ClassNotFoundException, SQLException {
 	    try{
 			
// 			FileInputStream fis = null;
// 			fis = new FileInputStream("database.properties");
//  			props.load(fis);
 			
 			// load the Driver Class
 			Class.forName("com.mysql.cj.jdbc.Driver");
 
 			// create the connection now
            con = DriverManager.getConnection("jdbc:mysql:///trains","root","rps@12345");
            
    	    }
    	    catch(Exception e){
    	        e.printStackTrace();
    	    }
    		return con;	
    	}
    }