package module_1Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage {
//Declartion
	WebDriver driver1;
	@FindBy(xpath="//div[text()='My Account']") private WebElement myAcc;
	//intialization
	
	public PBHomePage(WebDriver driver ) {
		PageFactory.initElements(driver, this);
		driver1= driver;
	}
	//usage
	public void mouseHoverPBHomePageMyAcc() {
		
		Actions act= new Actions(driver1);
		act.moveToElement(myAcc).perform();
	}
}
