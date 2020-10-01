import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC_103_PHP_Travels_URLValidationIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\SeleniumInstallation\\Miscellaneous\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		 
		driver.get("https://www.phptravels.net/home");
		
		
		
	}

}
