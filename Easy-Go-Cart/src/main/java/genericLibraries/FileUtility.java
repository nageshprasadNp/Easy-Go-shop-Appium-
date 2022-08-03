package genericLibraries;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("H:\\TestYantraWorksapce\\Easy-Go-Cart\\src\\test\\resources\\commonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
}
