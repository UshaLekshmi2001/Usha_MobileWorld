import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
	@Test
	public void signup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/usha.lekshmi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		LandingPage landingpage2=new LandingPage(driver);
		landingpage2.goTo();
		landingpage2.signupapplication("Usha","Lekshmi","usha@gmail.com","usha@123","22/08/2001","9442894256","asd");
		

	}

}
