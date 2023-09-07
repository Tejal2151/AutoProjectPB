package libraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass1 {

	
	
	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream inp = new FileInputStream ("C:\\Users\\Na\\eclipse-workspace\\WSoftwareTestingAutomationProject\\TestData\\SoftwareTesting.xlsx");
		
		 Sheet sh = WorkbookFactory.create(inp).getSheet("POM_DDF");
		 String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		 return value;
	}
	
	public static void captureSS(WebDriver driver , int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\Na\\eclipse-workspace\\WSoftwareTestingAutomationProject\\FaliedTCSS\\FailedTestCase."+TCID+"jpg");
		FileHandler.copy(src, des);
	}
	
	public static void getPrpFileData(String key) throws IOException {
		FileInputStream inpu= new FileInputStream(System.getProperty("user.dir")+"PropertFile.properties");
		Properties prop = new Properties ();
		prop.load(inpu);
	}
	
	
	
	
}
