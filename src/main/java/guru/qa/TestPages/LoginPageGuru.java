package guru.qa.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import guru.qa.TestBase.TestBaseGuru;

public class LoginPageGuru extends TestBaseGuru{
	
	//page factory

	@FindBy(name = "uid")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "btnLogin")
	WebElement button;
	
	public LoginPageGuru(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String loginTitleTest(){
		return driver.getTitle();
		
	}
	
	public HomePageGuru loginTest(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		button.click();
		return new HomePageGuru();
		
		
		
	}
	
	
	

}
	
	
	
	




