package dataProvider;

import enums.DriverType;
import enums.EnvironmentType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {	
	private Properties properties;

	private final String propertyFilePath= "target\\classes\\Configuration.properties";


	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
 
	public String getReportConfigPath(){
		String reportConfigPathPath =System.getProperty("user.dir")+ properties.getProperty("reportConfigPath");
		if(reportConfigPathPath!= null) return reportConfigPathPath;
		else throw new RuntimeException("Reporter config path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public String getDriverPath(){
		String driverPath =System.getProperty("user.dir")+ properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath");
	}
 
	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) {
			try{
				return Long.parseLong(implicitlyWait);
			}catch(NumberFormatException e) {
				throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
			}
		}
		return 30;		
	}
 
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
	}
 
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
 
	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}
 
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
	
	public String getLoginEmail() {
		String email = properties.getProperty("email");
		if(email != null) return email;
		else throw new RuntimeException("Login Email is not specified in the Configuration.properties file for the Key:email");
	}
	
	public String getLoginPassword() {
		String password = properties.getProperty("password");
		if(password != null) return password;
		else throw new RuntimeException("Login password is not specified in the Configuration.properties file for the Key:password");
	}

	public String getDataFilePath() {
		String dataFilePath = System.getProperty("user.dir") +properties.getProperty("dataFilePath");
		if(dataFilePath != null) return dataFilePath;
		else throw new RuntimeException("DataFilePath is not specified in the Configuration.properties file for the Key:password");
	}
	public String getSheetName() {
		String sheetName = properties.getProperty("sheetName");
		if(sheetName != null) return sheetName;
		else throw new RuntimeException("SheetName is not specified in the Configuration.properties file for the Key:sheetName");
	}
}