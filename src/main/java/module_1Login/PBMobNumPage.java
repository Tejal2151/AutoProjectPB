package module_1Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage {
	//decaration
@FindBy (xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement mobNum;
@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;
//intialization
public PBMobNumPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//usage 
public void inpPBMobNumPageMobNum(String mobileNo) {
	mobNum.sendKeys(mobileNo);
}
public void clickPBMobNumPageSignInWithPwd() {
	signInWithPwd.click();
}





}
