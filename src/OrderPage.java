import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrderPage {
	@Test
	public void order() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/usha.lekshmi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		LandingPage landingpage1=new LandingPage(driver);
		
		landingpage1.goTo();
		
		
		landingpage1.orderpage("Usha","Lekshmi","usha@gmail.com","usha123","9442894256","Puthuvai","Puthiyamputhoor","Thiruneveli","9876543223","3","1");
		}

}
