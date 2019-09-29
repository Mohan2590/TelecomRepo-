package guru.qa.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import guru.qa.TestBase.TestBaseGuru;

public class HomePageGuru extends TestBaseGuru {
	
	//PAGE FACOTY
	@FindBy(linkText="New Customer")
	WebElement NewCustomer;
	
	@FindBy(name="name")
	WebElement enterName;
	
	@FindBy(name="dob")
	WebElement selectDOB;
	
	@FindBy(name="addr")
	WebElement EnterAddr;
	
	@FindBy(name="city")
	WebElement EnterCity;
	
	@FindBy(name="state")
	WebElement Enterstate;
	
	@FindBy(name="pinno")
	WebElement Enterpin;
	
	@FindBy(name="emailid")
	WebElement enterEmail;
	
	@FindBy(name="password")
	WebElement enterpwd;
	
	@FindBy(name="sub")
	WebElement ClickSubmit;
	
	public HomePageGuru(){
		PageFactory.initElements(driver, this);
	}
	
	public HomePageGuru clicOnNewCustomer(){
		
		NewCustomer.click();
		return new HomePageGuru();
		
	}
	
	public HomePageGuru createNewCustomer(){
		NewCustomer.click();
		enterName.sendKeys("Akash");
		selectDOB.sendKeys("21/02/1995");
		EnterAddr.sendKeys("delhimumbai");
		EnterCity.sendKeys("pune");
		Enterstate.sendKeys("maharashtra");
		Enterpin.sendKeys("123456");
		enterEmail.sendKeys("akasj@gmail.com");
		enterpwd.sendKeys("password");
		ClickSubmit.click();
		
		return new HomePageGuru();
		
		
		
		
		
		
	}

	

}
