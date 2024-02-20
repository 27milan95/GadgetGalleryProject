package EcommerceWebsite.GadgetsGallery;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageClass.LoginPage;
import junit.framework.Assert;

public class LoginTest extends BaseClass {

	public LoginTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage loginPage ;
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		loginPage = new LoginPage();
		System.out.println("driver initialize");
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	@Test(invocationTimeOut = 3000, priority=1)
	public void verifyLoginFunc() {
		loginPage.EmailID(prop.getProperty("EmailId"));
		System.out.println(prop.getProperty("EmailId"));
		
		loginPage.Password(prop.getProperty("password"));
		System.out.println(prop.getProperty("password"));
		
		loginPage.SignInButton();
		String Expected = "Vraj!";
		System.out.println(loginPage.Vraj());
		Assert.assertEquals(loginPage.Vraj(), Expected);
	}
	
	@Test(invocationTimeOut = 3000, priority=2)
	public void verifyFailLoginFunc() {
		loginPage.EmailID(prop.getProperty("WrongEmailId"));
		System.out.println(prop.getProperty("WrongEmailId"));
		
		loginPage.Password(prop.getProperty("password"));
		System.out.println(prop.getProperty("password"));
		
		loginPage.SignInButton();
		//String Expected = " Error: No match for E-Mail Address and/or Password.";
		//boolean Actual = System.out.println(loginPage.ErrorMessage());
		Assert.assertEquals(loginPage.ErrorMessage(), true);
	}
	
	@Test(priority=3)
	public void NewCustomerLink() {
		Assert.assertEquals(loginPage.NewCustomerLink(), true);
		//return false;
	}

}
