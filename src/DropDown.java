
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    WebDriver driver = new FirefoxDriver();
    driver.get ("http://www.politifact.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  
	  @ Test public void Test() throws Exception{
		  Thread.sleep (5000);
		  driver.findElement(By.xpath("html/body/div[1]/div/div[2]/nav[1]/ul/li[1]/a")); 
		  
		  }  
	
	 @ Test public void Test1() throws InterruptedException
	  
	  {
	  // News hover over
	  WebElement menu = driver.findElement(By.xpath("html/body/div[2]/div[4]/div[1]/div/ul/li[3]/a")); 
	  
	  // sub element 
	  WebElement subMenu = driver.findElement(By.xpath("html/body/div[2]/div[4]/div[2]/div[1]/div[1]/div/ul/li[8]/a"));
	  
	 // Decleare action 
    Actions action = new Actions (driver);
    
    //Mouse over
    action.moveToElement(menu).perform();
    
    try {
		Thread.sleep (2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    // Action click on submenu 
    
    action.click(subMenu).perform();
   
  }

 @Ignore  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
