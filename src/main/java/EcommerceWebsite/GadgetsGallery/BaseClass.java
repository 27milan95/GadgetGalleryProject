package EcommerceWebsite.GadgetsGallery;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.TestUtils;



public class BaseClass {
	
	public static WebDriver driver;

	public static Properties prop;
	
	
	
	public  BaseClass() throws Exception {
		
		FileInputStream f = new FileInputStream("C:\\Selenium_workspace\\GadgetsGallery\\src\\main\\java\\Utilities\\Properties.properties");
	
		prop = new Properties();
		prop.load(f);
	}

	
	public static void initialization() {
		

		String browser = prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
			//System.out.println("*************************Firefox");

			}
		else {
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver = new ChromeDriver();
				//System.out.println("******************************Chrome");

			}
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

}
}
