package guru.qa.TestBase;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBaseGuru {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBaseGuru(){
		
		try{
		prop = new Properties();  // accessing confif file 
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Admin\\workspace\\Guru99TestProject\\src\\main\\java\\guru\\qa\\Config\\configGuru.properties");
			
		prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		
	}
	
	public static void intialization(){
		String browserName = prop.getProperty("browser");   // calling browser value from config file 
		
		if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "F:\\Automation_Skills\\Selenium SetUp 64Bit\\Browser Testing\\geckodriver.exe");
		
			driver = new FirefoxDriver();
		}else if(browserName.equals("chrome")){
			
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Skills\\Selenium SetUp 64Bit\\Browser Testing\\chromedriver.exe");
		
		    driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
