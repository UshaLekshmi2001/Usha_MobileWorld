import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
	
		WebDriver driver; 
		
		
		
		public LandingPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
//SignUp
		@FindBy(css="button[type='submit']")
		WebElement signin;
		
		@FindBy(css="a[href='signup.html']")
		WebElement signup;
		
		@FindBy(xpath="//input[@id='myName']")
		WebElement firstname;
		
		@FindBy(xpath="//input[@placeholder='Last Name']")
		WebElement lastname;
		
		@FindBy(xpath="//input[@type='Email']")
		WebElement email;
		
		@FindBy(xpath="//input[@type='Password']")
		WebElement password;
		
		@FindBy(xpath="//input[@type='date']")
		WebElement date;
		
		@FindBy(xpath="//div[@class='col-md-3']//input[@name='gender']")
		WebElement gender;
		
		@FindBy(xpath="//input[@type='number']")
		WebElement mobilenumber;
		
		@FindBy(xpath="//textarea[@placeholder='Short Bio']")
		WebElement bio;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement register;
		
//SignIn
		
		@FindBy(xpath="//input[@id='username']")
		WebElement username;
		
		@FindBy(css="input[type='password']")
		WebElement signinpassword;
		
		@FindBy(css="label[for='remember-me']")
		WebElement rememberme;
		
		@FindBy(css="a[type='submit']")
		WebElement signinsignin;
		
//OrderPage
		
		@FindBy(css="div[class='collapse navbar-collapse'] li:nth-child(4)")
		WebElement osupport;
		
		@FindBy(css="div[class='dropdown-menu show'] a:nth-child(1)")
		WebElement oorder;
		
		@FindBy(css="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")
		WebElement ofirstname;
		
		@FindBy(css="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)")
		WebElement olastname;
		
		@FindBy(xpath="//input[@id='inputEmail']")
		WebElement oemail;
		
		@FindBy(xpath="//input[@id='inputPassword']")
		WebElement opassword;
		
		@FindBy(xpath="//input[@id='flexRadioDefault1']")
		WebElement ogender;
		
		@FindBy(xpath="//input[@placeholder='00000000000']")
		WebElement omobilenumber;
		
		@FindBy(xpath="//input[@id=' address1']")
		WebElement oaddress1;
		
		@FindBy(xpath="//input[@id='address2']")
		WebElement oaddress2;
		
		@FindBy(xpath="//input[@id='inputCity']")
		WebElement ocity;
		
		@FindBy(xpath="//select[@id='inputState']")
		WebElement ostate;
		
		@FindBy(xpath="//input[@id='inputZip']")
		WebElement ozip;
		
		@FindBy(xpath="//*[@id=\\\"myForm\\\"]/fieldset/div/div[1]/div/div[1]/label/input")
		WebElement obrand;
		
		@FindBy(xpath="//label[normalize-space()='Samsung']")
		WebElement omodel;
		
		@FindBy(xpath="//input[@placeholder='no of mobiles']")
		WebElement ocount;
		
		@FindBy(xpath="//select[@id='bought']")
		WebElement obought;
		
		@FindBy(xpath="//input[@id='time']")
		WebElement onooftimes;
		
		@FindBy(xpath="//body/div[@class='container']/div[@class='card']/div[@class='card-body']/form[@id='myForm']/div[1]/div[1]/input[1]")
		WebElement ocheck;
		
		@FindBy(xpath="//button[normalize-space()='Order Now']")
		WebElement oordernow;
		
		//action
		public void goTo() {
			driver.get("https://mobileworld.banyanpro.com/");
		}
		
		public void signinapplication(String name,String pwd)
		{
			signin.click();
			username.sendKeys(name);
			signinpassword.sendKeys(pwd);
			signinsignin.click();
			
			
			}
		public void signupapplication(String fname,String lname,String mail,String suppwd,String dob,String phone,String sbio) {
			
			signin.click();
			signup.click();
			firstname.sendKeys(fname);
			lastname.sendKeys(lname);
			email.sendKeys(mail);
			password.sendKeys(suppwd);
			date.sendKeys(dob);
			gender.click();
			mobilenumber.sendKeys(phone);
			bio.sendKeys(sbio);
			register.click();
			
			
			}
		
		public void orderpage(String ofn,String oln,String oe,String op,String omn,String oa1,String oa2,String oc,String oz,String ocou,String nooft) {
			
			
			
			osupport.click();
			oorder.click();
			 Set windows = driver.getWindowHandles();
	         Iterator<?> it = windows.iterator();
	         String parentId = (String) it.next();
	         String childId = (String) it.next();
	         driver.switchTo().window(childId);
			ofirstname.sendKeys(ofn);
			olastname.sendKeys(oln);
			oemail.sendKeys(oe);
			opassword.sendKeys(op);
			ogender.click();
			omobilenumber.sendKeys(omn);
			oaddress1.sendKeys(oa1);
			oaddress2.sendKeys(oa2);
			ocity.sendKeys(oc);
			ostate.click();
			ozip.sendKeys(oz);
			obrand.click();
			omodel.click();
			ocount.sendKeys(ocou);
			obought.click();
			onooftimes.sendKeys(nooft);
			ocheck.click();
			oordernow.click();
			
			
			
			
		}

}
