import static org.junit.Assert.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;
 


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class Politifact {
       
          private WebDriver  wd;
          private String baseUrl;
          private StringBuffer verificationErrors = new StringBuffer();
       
 
          @Before
          public void setUp() throws Exception {
        	  
           // baseUrl = "http://qa-ta.politifact.com/";
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Alex\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
            wd = new ChromeDriver();
            wd.manage().window().maximize();
     //     wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
          }
       
 
           @Test
        public void test1() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/north-carolina/statements/2016/apr/01/chris-sgro/equality-nc-director-no-public-safety-risks-cities/");    
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[34]/div/div")); }
        @Test
        public void test2() throws InterruptedException {
                wd.get("http://stream.nbcolympics.com/gymnastics-event-finals-mens-floor-womens-vault-mens-pommel-horse-womens-uneven-bars");
               // wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));    
        }
        @Test
        public void test3() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/01/bernie-s/bernie-sanders-says-wall-street-tax-would-pay-his-/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));
        }
        @Test
        public void test4() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-claims-meet-press-wall-street-atta/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[24]/div/div"));
        }
        @Test
        public void test5() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-i-have-now-put-out-all-my-emails/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[30]/div/div"));
        }
        @Test
        public void test6() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/ohio/statements/2016/mar/24/bernie-s/tufts-university-study-has-bernies-back-trans-paci/");    
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));
        }
        @Test
        public void test7() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/california/statements/2016/mar/23/bernie-s/bernie-sanders-claim-about-us-having-one-lowest-vo/");
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[22]/div/div"));    
        }
        @Test
        public void test8() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/02/bernie-s/sanders-welfare-reform-more-doubled-extreme-povert/");     
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[32]/div/div"));     
        }
        @Test
        public void test9() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/09/hillary-clinton/hillary-clinton-said-my-predecessors-did-same-thin/");
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));    
        }
        @Test
        public void test10() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/nbc/statements/2016/mar/21/hillary-clinton/hillary-clinton-says-her-campaign-depends-small-do/");  
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[29]/div/div"));
        }     
       
        @Test
        public void test01()throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/north-carolina/statements/2016/apr/01/chris-sgro/equality-nc-director-no-public-safety-risks-cities/");    
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[34]/div/div")); }
        @Test
        public void test02() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/24/bernie-s/bernie-sanders-was-roll-call-amendment-king-1995-2/ "); 
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));    
        }
        @Test
        public void test03() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/01/bernie-s/bernie-sanders-says-wall-street-tax-would-pay-his-/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));
        }
        @Test
        public void test04() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-claims-meet-press-wall-street-atta/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[24]/div/div"));
        }
        @Test
        public void test05() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-i-have-now-put-out-all-my-emails/");    
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[30]/div/div"));
        }
        @Test
        public void test06() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/ohio/statements/2016/mar/24/bernie-s/tufts-university-study-has-bernies-back-trans-paci/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));
        }
        @Test
        public void test07() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/california/statements/2016/mar/23/bernie-s/bernie-sanders-claim-about-us-having-one-lowest-vo/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[22]/div/div"));
               
        }
        @Test
        public void test08() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/02/bernie-s/sanders-welfare-reform-more-doubled-extreme-povert/");     
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[32]/div/div"));     
        }
        @Test
        public void test09() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/09/hillary-clinton/hillary-clinton-said-my-predecessors-did-same-thin/");
                Thread.sleep(3000); ;   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));    
        }
        @Test
        public void test010() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/nbc/statements/2016/mar/21/hillary-clinton/hillary-clinton-says-her-campaign-depends-small-do/");  
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[29]/div/div"));
        } 
        @Test
        public void test001() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/north-carolina/statements/2016/apr/01/chris-sgro/equality-nc-director-no-public-safety-risks-cities/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[34]/div/div")); }
        @Test
        public void test002() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/24/bernie-s/bernie-sanders-was-roll-call-amendment-king-1995-2/ "); 
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));    
        }
        @Test
        public void test003() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/01/bernie-s/bernie-sanders-says-wall-street-tax-would-pay-his-/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));
        }
        @Test
        public void test004() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-claims-meet-press-wall-street-atta/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[24]/div/div"));
        }
        @Test
        public void test005() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-i-have-now-put-out-all-my-emails/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[30]/div/div"));
        }
        @Test
        public void test006() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/ohio/statements/2016/mar/24/bernie-s/tufts-university-study-has-bernies-back-trans-paci/");    
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));
        }
        @Test
        public void test007() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/california/statements/2016/mar/23/bernie-s/bernie-sanders-claim-about-us-having-one-lowest-vo/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[22]/div/div"));
               
        }
        @Test
        public void test008() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/02/bernie-s/sanders-welfare-reform-more-doubled-extreme-povert/");     
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[32]/div/div"));     
        }
        @Test
        public void test009() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/09/hillary-clinton/hillary-clinton-said-my-predecessors-did-same-thin/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));    
        }
        @Test
        public void test0010() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/nbc/statements/2016/mar/21/hillary-clinton/hillary-clinton-says-her-campaign-depends-small-do/");  
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[29]/div/div"));
        }     
        @Test
        public void test0001() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/north-carolina/statements/2016/apr/01/chris-sgro/equality-nc-director-no-public-safety-risks-cities/");    
                Thread.sleep(5000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[34]/div/div")); }
        @Test
        public void test0002() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/24/bernie-s/bernie-sanders-was-roll-call-amendment-king-1995-2/ "); 
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));    
        }
        @Test
        public void test0003() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/01/bernie-s/bernie-sanders-says-wall-street-tax-would-pay-his-/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));
        }
        @Test
        public void test0004() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-claims-meet-press-wall-street-atta/");    
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[24]/div/div"));
        }
        @Test
        public void test0005() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-i-have-now-put-out-all-my-emails/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[30]/div/div"));
        }
        @Test
        public void test0006() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/ohio/statements/2016/mar/24/bernie-s/tufts-university-study-has-bernies-back-trans-paci/");    
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));
        }
        @Test
        public void test0007() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/california/statements/2016/mar/23/bernie-s/bernie-sanders-claim-about-us-having-one-lowest-vo/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[22]/div/div"));
               
        }
        @Test
        public void test0008() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/02/bernie-s/sanders-welfare-reform-more-doubled-extreme-povert/");     
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[32]/div/div"));     
        }
        @Test
        public void test0009() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/09/hillary-clinton/hillary-clinton-said-my-predecessors-did-same-thin/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));    
        }
        @Test
        public void test00010() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/nbc/statements/2016/mar/21/hillary-clinton/hillary-clinton-says-her-campaign-depends-small-do/");  
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[29]/div/div"));
        }     
        @Test
        public void test00001() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/north-carolina/statements/2016/apr/01/chris-sgro/equality-nc-director-no-public-safety-risks-cities/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[34]/div/div")); }
        @Test
        public void test00002() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/24/bernie-s/bernie-sanders-was-roll-call-amendment-king-1995-2/ "); 
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));    
        }
        @Test
        public void test00003() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/01/bernie-s/bernie-sanders-says-wall-street-tax-would-pay-his-/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));
        }
        @Test
        public void test00004() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-claims-meet-press-wall-street-atta/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[24]/div/div"));
        }
        @Test
        public void test00005() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/truth-o-meter/statements/2016/apr/03/hillary-clinton/hillary-clinton-i-have-now-put-out-all-my-emails/");    
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[30]/div/div"));
        }
        @Test
        public void test00006() throws InterruptedException {
                wd.get(" http://qa-ta.politifact.com/ohio/statements/2016/mar/24/bernie-s/tufts-university-study-has-bernies-back-trans-paci/");    
                Thread.sleep(3000);   
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[27]/div/div"));
        }
        @Test
        public void test00007() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/california/statements/2016/mar/23/bernie-s/bernie-sanders-claim-about-us-having-one-lowest-vo/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[22]/div/div"));
               
        }
        @Test
        public void test00008() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/02/bernie-s/sanders-welfare-reform-more-doubled-extreme-povert/");     
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[32]/div/div"));     
        }
        @Test
        public void test00009() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/truth-o-meter/statements/2016/mar/09/hillary-clinton/hillary-clinton-said-my-predecessors-did-same-thin/");
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[20]/div/div"));    
        }
        @Test
        public void test000010() throws InterruptedException {
                wd.get("http://qa-ta.politifact.com/nbc/statements/2016/mar/21/hillary-clinton/hillary-clinton-says-her-campaign-depends-small-do/");  
                Thread.sleep(3000);    
                wd.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/main/article/div[1]/p[29]/div/div"));
        }     
   
        
        @After
          public void tearDown() throws Exception {
            Thread.sleep(3000);
           //  wd.close();
          }
 
       
       
       
       
}