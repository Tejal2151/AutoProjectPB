package module_1Login;

import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage {
//declaration
	
	WebDriver driver;
	@FindBy(xpath="(//input[@id='outlined-secondary'])[1]") private WebElement fullName;
	
	public PBMyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public void switchTochildWindow() {
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> al= new ArrayList<String>(allid);
		driver.switchTo().window(al.get(1));
	}
	public String  getPBMyProfilePageFullName() {
		String actText = fullName.getAttribute("value");
		return actText;
	}
	
}
