

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  private Cookie ck = new Cookie ("name", "value"); 

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://alytvynenko:al121715!@webstg.tampabay.com/";
    driver.manage().addCookie(ck);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testHello() throws Exception {
    driver.get(baseUrl);
 // News (2 pages)
 		 driver.findElement(By.xpath(".//*[@id='sectionMenu']/li[3]/a")).click();
 		 Thread.sleep(10000);
 		 driver.findElement(By.xpath(".//*[@id='ls-row-5-col-1-row-4-col-1-row-1-col-1-row-3-col-1-row-1']/ul[1]/li[2]/a")).click();
 		 Thread.sleep(10000);
 		 System.out.print("News page is successfully completed");
 		 
 		 // Politics (2 pages)
 		 driver.findElement(By.xpath(".//*[@id='sectionMenu']/li[4]/a")).click();
 		 Thread.sleep(10000);
 		 // Opinion
 		 driver.findElement(By.xpath(".//*[@id='sectionMenu']/li[8]/a")).click();
 		 Thread.sleep(10000);
 		 driver.findElement(By.id("google_ads_iframe_/4605/tampabay.com/opinion_index_1"));
 		 System.out.print(" - Politics page is successfully completed");
 		 
  }

@Test
public void testHello1() throws Exception {
  driver.get(baseUrl );
// News (2 pages)
		 driver.findElement(By.xpath(".//*[@id='sectionMenu']/li[3]/a")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath(".//*[@id='ls-row-5-col-1-row-4-col-1-row-1-col-1-row-3-col-1-row-1']/ul[1]/li[2]/a")).click();
		 Thread.sleep(10000);
		 System.out.print("News page is successfully completed");
		 
		 // Politics (1 pages)
		 driver.findElement(By.xpath(".//*[@id='sectionMenu']/li[4]/a")).click();
		 Thread.sleep(10000);
		 // Sport  (1 page)
		 driver.findElement(By.xpath(".//*[@id='sectionMenu']/li[5]/a")).click();
		 
		 driver.findElement(By.id("google_ads_iframe_/4605/tampabay.com/sports_index_1"));
		 
		 System.out.print(" - Politics page is successfully completed");
		 
}
  
  
  @After
  public void CloseTest() throws Exception {
    
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
    
    driver.close();
  }

  
}
