package EcommerceWebsite.GadgetsGallery;



import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageClass.HomePage;
import PageClass.LoginPage;
import junit.framework.Assert;

public class HomeTest extends BaseClass {
	
	LoginPage loginPage ;
	HomePage homePage ;
	
	 


	public HomeTest() throws Exception {
		super();
		
		
		// TODO Auto-generated constructor stub
	}

	
	
	
	@BeforeMethod
	public void verifyLoginFunc() throws Exception {
		
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage.EmailID(prop.getProperty("EmailId"));
		System.out.println(prop.getProperty("EmailId"));
		
		loginPage.Password(prop.getProperty("password"));
		System.out.println(prop.getProperty("password"));
		
		loginPage.SignInButton();	
}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	//@Test(invocationTimeOut = 2000)
	public void PlaceHolderCheck() {
	
		String expected = homePage.ManufacturerPlaceHolder();
		System.out.println(expected);
		Assert.assertEquals(expected, "Please Select");
		
	}
	
	
	}
	
	
