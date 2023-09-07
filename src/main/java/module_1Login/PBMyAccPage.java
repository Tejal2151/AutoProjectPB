package module_1Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage {
@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProf;

//initialization 
public PBMyAccPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//usage 
public void clickPBMyAccPage() {
	myProf.click();
}
}
