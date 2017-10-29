
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;








public class TestWork{
	 private WebDriver wd;
	  private String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private Cookie ck = new Cookie ("name", "value"); 

	  @Before
	  public void setUp() throws Exception {
	    wd = new FirefoxDriver();
	    baseUrl = ("http://www.politifact.com/#");
	    wd.manage().addCookie(ck);
	    wd.manage().window().maximize();
	    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

 @Ignore @Test
  public void testHello() throws InterruptedException {
	Thread.sleep(3000);
	wd.get(baseUrl); 
	
	
	// String To check that an element is present
	Boolean isPresent = wd.findElements(By.xpath("html///body/div[1]/div/div[2]/nav[1]/ul/li[3]/a")).size() > 0;
	Boolean notPresent = wd.findElements(By.xpath("html///body/div[1]/div/div[2]/nav[1]/ul/li[3]/a")).size() > 0;
	
	
	 // Decleare action 
    Actions action = new Actions (wd);
	

      if (isPresent){
		
		// Action click on IsPresent 
	    
		action.click().moveToElement(wd.findElement(By.xpath("html/body/div[1]/div/div[2]/nav[1]/ul/li[3]/a"))).click().perform();
		
	 System.out.println("good ");
	 Thread.sleep(3000);
	 
	}
      else	  if (notPresent){
		
		action.click().moveToElement(wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/div/div[1]/h1/a"))).click().perform();
		System.out.println("next page ");	
		 
	}
	else {
		System.out.println("bad ");
	}
	} 
  
  @Test
  public void test()  throws Exception {
	Thread.sleep(3000);
	wd.get(baseUrl); 
	
	
	
	// WebElement element  = wd.findElement(By.xpath("html/body/div[1]/div/div[2]/nav[1]/ul/li[1]/a"));
	
	String element  = wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/div/div[1]/figure/figcaption")).getText();

	String strng = element;
	System.out.println("This is my text: "+strng);
	
  }
  @Ignore@Test
  public void Test() throws InterruptedException {
	  
	  wd.get("http://www.politifact.com/"); 
	 String actual_result = wd.findElement(By.xpath("html/body/div[1]/div/div[2]/nav[1]/ul/li[1]/a")).getText();
	String expected_sesult = "EDITIONS";
	
	// Compare is it Equals ?
     Assert.assertEquals(actual_result, expected_sesult); 
    
    // Another method to Compare 
	Assert.assertTrue(actual_result.contains("EDITIONS")); 
	
	System.out.print(actual_result);
	  
  }
  @Test
  public void IF() throws InterruptedException {
	Thread.sleep(3000);
	wd.get(baseUrl); 
	
	if (wd.getPageSource().contains("It's a claim floating around Sacramento. We wanted to see if it held up."))
	{
		System.out.print("Text present");
		
	}
	else{
		System.out.print("Text not present");	
	}	
	}
	
	
	
  
	/* try
	{
	    wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/div/div[1]/h1/a"));
	} 
	catch(TimeoutException e)
	{
		System.out.println("Element does not exist!");
	} 
*/
	

  @ Ignore @After
  public void tearDown() throws Exception {
    Thread.sleep(3000);
     wd.close();
  }

}