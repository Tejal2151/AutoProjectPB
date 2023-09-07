package module_1Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPasswordPage {
//declaration 
	@FindBy(xpath="//input[@id='central-login-password']")
	private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signInBtn;
	//intialization
	public  PBPasswordPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//usage 
	public void inpPBPasswordPagePwd(String password) {
		 pwd.sendKeys(password);
	}
	public void clickPBPasswordPageSignInBtn() {
		signInBtn.click();
	}
}
