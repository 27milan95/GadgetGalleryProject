package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EcommerceWebsite.GadgetsGallery.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name="email_address")
    WebElement EmailID;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(partialLinkText = "Continue")
	WebElement NewCustomerLink;
	
	@FindBy(id="tdb1")
	WebElement SignInButton;
	
	public LoginPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void EmailID(String a) {
		EmailID.sendKeys(a);
		
	}
	
	public void Password(String b) {
		Password.sendKeys(b);
		
	}
	
	public void SignInButton() {
		SignInButton.click();
		
	}
	
	public boolean NewCustomerLink() {
		return NewCustomerLink.isDisplayed();
		
	}
	
	public String Vraj() {
		String Actual= driver.findElement(By.xpath("//span[text()='Vraj!']")).getText();
		return Actual;
	}
	
	public boolean ErrorMessage() {
		boolean ErrMessage = driver.findElement(By.className("messageStackError")).isDisplayed();
		return true;
	}
	
	
	
	
	

}
