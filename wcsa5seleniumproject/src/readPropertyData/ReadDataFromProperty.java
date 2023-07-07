package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	
	public static void main(String[] args) throws IOException {
		// Read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
	    
		   // create a obj of properties class
		     Properties prop = new Properties();
		     //make a file ready for read
		     prop.load(fis);
		     // read the particular property form file
		     String data = prop.getProperty("Password");
		     System.out.println(data);
	     
	}

}
