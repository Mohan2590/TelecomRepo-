package guru.qa.TestCases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import guru.qa.TestBase.TestBaseGuru;
import guru.qa.TestPages.HomePageGuru;
import guru.qa.TestPages.LoginPageGuru;

public class LoginTestCase extends TestBaseGuru {
	
	HomePageGuru homepageguru;
	LoginPageGuru loginpageguru;
	
	
	public LoginTestCase(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		intialization();
		homepageguru = new HomePageGuru();
		loginpageguru = new LoginPageGuru();
	}
	
	
	public void VerifyLoginTitle(){
		
		String title = loginpageguru.loginTitleTest();
		
		Assert.assertEquals(title, "Guru99 Bank Home Page");
		
	}
	@Test(priority=1)
	public void Verifylogin(){
		loginpageguru.loginTest(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

