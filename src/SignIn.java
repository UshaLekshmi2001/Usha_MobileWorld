import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
	@Test
	public void signin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/usha.lekshmi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LandingPage landingpage0=new LandingPage(driver);
		landingpage0.goTo();
		landingpage0.signinapplication("Usha","usha@123");
		Thread.sleep(1000);
		
		
		
	}
	
   
}