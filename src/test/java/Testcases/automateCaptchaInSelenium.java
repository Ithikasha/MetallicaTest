//package Testcases;
//
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Test;
//
//import Data_Functions.Functions;
//import Data_Functions.constantData;
//import Data_Functions.driverUtil;
//import Data_Functions.pageElements;
//import Email.SendingEmail;
//import Regression.ContactUsForm;
//import SiteMonitoring.SiteMonitoringConstantData;
//import Smoke_test.Data_smoke;
//
//import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Reporter;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
// 
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
// 
//
//public class automateCaptchaInSelenium {
//	
//	public static driverUtil util = new driverUtil();
//	
//	public static constantData data = new constantData();
//	
//	public static SiteMonitoringConstantData SiteData = new SiteMonitoringConstantData();
//	
//	public static SendingEmail email = new SendingEmail();
//    
//    public static Data_smoke data_smoke = new Data_smoke();
//    
//    public static ContactUsForm ContactUs = new ContactUsForm();
//       
//    public static pageElements elements ;
//	
//    public static Functions functions;
//
//    public static void main(String args[]) throws Exception
//	{ 
//	 
//	    public String username = "YOUR USERNAME";
//	    public String accesskey = "YOUR ACCESSKEY";
//	    public static RemoteWebDriver driver = null;
//	    public String gridURL = "[@hub](http://twitter.com/hub).lambdatest.com/wd/hub";
//	 
//	 
//	    public void setUp() throws Exception {
//	    	
//	        DesiredCapabilities capabilities = new DesiredCapabilities();
//	        capabilities.setCapability("browserName", "chrome");
//	        capabilities.setCapability("version", "95.0");
//	        capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
//	        capabilities.setCapability("build", "CaptchaInSelenium");
//	        capabilities.setCapability("name", "TCaptchaInSeleniumSample");
//	        try
//	        {
//	        	
//	            data.driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
//	            
//	        } 
//	        
//	        catch (MalformedURLException e)
//	        {
//	            System.out.println("Invalid grid URL");
//	            
//	        }
//	        catch (Exception e) 
//	        {
//	            System.out.println(e.getMessage());
//	        }
//	        
//	        data.driver.get("https://metclub.tejassoftware.com/toms");
//	 
//	 
//	    }
//	    
//	    
//	    public void clickOnRecaptchaCheckBoxInSelenium() {
//	        try {
//	           
//	        	util.Sendkeys(elements.TomsEmail, data.ProdTomsusername);
//	    		
//	    		util.Sendkeys(elements.TomsPassword, data.ProdTomspassword);
//	    		
//	    		util.waitForElementToLoad(elements.reCAPTCHA);
//	    		
//	    		util.jClick(data.driver,elements.reCAPTCHA);
//	    		
//	    		System.out.println("Clicked the checkbox");
//	 
//	        }
//	        
//	        catch (Exception e) {
//	 
//	        }
//	 
//	    }
//} 
//}
