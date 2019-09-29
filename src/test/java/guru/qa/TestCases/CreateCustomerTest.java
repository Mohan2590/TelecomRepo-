package guru.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import guru.qa.TestBase.TestBaseGuru;
import guru.qa.TestPages.HomePageGuru;
import guru.qa.TestPages.LoginPageGuru;

public class CreateCustomerTest extends TestBaseGuru {

LoginPageGuru loginpageguru;
HomePageGuru homepageguru;

public CreateCustomerTest(){
	super();
	
}

@BeforeMethod
public void setUp(){
	
	intialization();
	
	loginpageguru = new LoginPageGuru();
	homepageguru = new HomePageGuru();
	loginpageguru.loginTest(prop.getProperty("username"), prop.getProperty("password"));


}


public void verifyclicOnNewCustomer(){
	homepageguru = homepageguru.clicOnNewCustomer();
	
}

@Test
public void verifyCreateCustomer(){
	homepageguru.createNewCustomer();
	
}




@AfterMethod
public void tearDown(){
	driver.quit();
}

}