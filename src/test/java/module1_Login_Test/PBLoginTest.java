package module1_Login_Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraryFile.BaseClass1;
import libraryFile.UtilityClass1;
import module_1Login.PBHomePage;
import module_1Login.PBLoginPage;
import module_1Login.PBMobNumPage;
import module_1Login.PBMyAccPage;
import module_1Login.PBMyProfilePage;
import module_1Login.PBPasswordPage;

public class PBLoginTest  extends BaseClass1{
	PBLoginPage login;
	PBMobNumPage mobNum;
	PBPasswordPage pwdd;
	PBHomePage home ;
	PBMyAccPage  acc;
	 PBMyProfilePage  profile;
		Sheet sh;
	int TCID;

	@BeforeClass
	public void openBrowser () throws EncryptedDocumentException, IOException {
		
		
	
		initializeBrowser();
			ChromeOptions opt = new ChromeOptions ();
			opt.addArguments("--disable-popup-blocking");
	
			 login = new PBLoginPage(driver);
             mobNum = new PBMobNumPage(driver);
		     pwdd = new PBPasswordPage(driver);
			 home = new PBHomePage(driver);
		     acc = new PBMyAccPage (driver);
		     profile = new  PBMyProfilePage (driver);

	}
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException {
		
		login.clickPBLoginPageSignInBtn();
		mobNum.inpPBMobNumPageMobNum(UtilityClass1.getTD(0, 0));
		mobNum.clickPBMobNumPageSignInWithPwd();
		pwdd.inpPBPasswordPagePwd(UtilityClass1.getTD(0,1));
		pwdd.clickPBPasswordPageSignInBtn();
		Thread.sleep(2000);
		
		
	}
	@Test 
	
	public void verifyPN() throws InterruptedException, EncryptedDocumentException, IOException {
		TCID=101;
		home.mouseHoverPBHomePageMyAcc();
		acc.clickPBMyAccPage();
		profile.switchTochildWindow();
	String actPN = profile.getPBMyProfilePageFullName();
	String expPn= UtilityClass1.getTD(0, 2);
	Assert.assertEquals(expPn, actPN);
	Thread.sleep(2000);
	}
	
	
	
	
	
	@AfterMethod 
public void logOutApp(ITestResult s1) throws IOException {	
		if (s1.getStatus()==ITestResult.FAILURE) {
			UtilityClass1.captureSS(driver, TCID);
		}
	}
	
	
	@AfterClass
	public void closeBrowse() {
		driver.quit();
	}
	
	
	
}
