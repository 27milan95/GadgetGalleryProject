package PageClass;

import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import EcommerceWebsite.GadgetsGallery.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//option[text()='Please Select']")
	 WebElement ManufacturersTab;
	
	@FindBy(name = "manufacturers_id")
	List <WebElement> ManufacturersTabList;
	
	

	public HomePage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String ManufacturerPlaceHolder() {
		 return ManufacturersTab.getText();
	}
	
	
	
	
	
	

}
