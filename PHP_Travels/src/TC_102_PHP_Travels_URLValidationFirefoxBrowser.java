

//*****************************************************************************
//Test Name: TC_101_PHP_Travels_URLValidation_ChromeBrowser
// Test Description: User should able to navigate to the home page of the application using valid URL
// Test Engineer: EAMY
//Date : 7/27/2020
//Review History:
//***********************************************************************************
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_102_PHP_Travels_URLValidationFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub"
		//Set system property for firefox driver 
		
System.setProperty("webdriver.gecko.driver","C:\\SeleniumInstallation\\Miscellaneous\\geckodriver.exe");
       
WebDriver driver= new FirefoxDriver();

driver.get("https://www.phptravels.net/home");
		
		
		
	}

}
