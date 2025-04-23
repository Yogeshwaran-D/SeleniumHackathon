package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\propertiesDemoData.properties");
		
		Properties obj = new Properties();
		obj.load(file);
		Set<Object> keys = obj.keySet();
		System.out.println(keys);
		String user = obj.getProperty("user");
		String password = obj.getProperty("password");
		System.out.println(user+" : "+password);
	}
}
