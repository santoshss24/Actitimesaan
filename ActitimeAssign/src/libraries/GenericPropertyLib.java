package libraries;

import java.io.FileInputStream;
import java.util.Properties;

public class GenericPropertyLib 
{
	public static String getValue(String path,String key)
	{
		String value=null;
		
		try {
			FileInputStream fin=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fin);
			value=prop.getProperty(key);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return value;
	}

}
