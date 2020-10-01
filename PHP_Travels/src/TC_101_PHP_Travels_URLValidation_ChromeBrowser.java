
/*****************************************************************************
//Test Name: TC_101_PHP_Travels_URLValidation_ChromeBrowser
// Test Description: User should able to navigate to the home page of the application using valid URL
// Test Engineer: EAMY
//Date : 7/27/2020
//Review History:
//***********************************************************************************

/*//***************************************************************************************************
//Test Name: TC_101_PHP_Travels_URLValidation_ChromeBrowser
// Test Description: User should able to navigate to the home page of the application using valid URL
// Test Engineer: EAMY
//Date : 7/27/2020
//Review History:
//**************************************************************************************************
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_101_PHP_Travels_URLValidation_ChromeBrowser {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
	
	// Instantiate a browser class
	
	WebDriver driver = new ChromeDriver();
	
	// Navigate to the follwing URL
		driver.get("http://demo.guru99.com/test/newtours/");
		
		//Print the URL METHOD 1
		//System.out.println(driver.getCurrentUrl());
	
		// another way Advance way	
		//String myurl;
		
		//myurl= driver.getCurrentUrl();
		
		//System.out.println(myurl);
		
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		driver.close();
	
		
		
		
	}

}

//****************************************************************************************************
//EOF
//****************************************************************************************************

