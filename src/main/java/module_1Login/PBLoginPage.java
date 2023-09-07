package module_1Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage {
//Declaration
	
	@FindBy(xpath="//a[text()='Sign in']")
			private WebElement signIn;
	
	//intialization 
	public PBLoginPage (WebDriver driver ) {
		PageFactory.initElements(driver, this );
	}
	//usage
	public void clickPBLoginPageSignInBtn() {
		signIn.click();
	}
}
