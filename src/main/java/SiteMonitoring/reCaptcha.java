package SiteMonitoring;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Data_Functions.Functions;
import Data_Functions.constantData;
import Data_Functions.driverUtil;
import Data_Functions.pageElements;
import Email.SendingEmail;
import Regression.ContactUsForm;
import Smoke_test.Data_smoke;

	public class reCaptcha {
	
	public static driverUtil util = new driverUtil();
	
	public static constantData data = new constantData();
	
	public static SiteMonitoringConstantData SiteData = new SiteMonitoringConstantData();
	
	public static SendingEmail email = new SendingEmail();
    
    public static Data_smoke data_smoke = new Data_smoke();
    
    public static ContactUsForm ContactUs = new ContactUsForm();
       
    public static pageElements elements ;
	
    public static Functions functions;
    

    public static void main(String[] args) throws InterruptedException
	
	{
		data.driver = util.chrome();
	    
	    elements = new pageElements(data.driver);
	    
	    functions = new Functions(data,elements);
	
		data.driver.manage().window().maximize();
	
		data.driver.get(data.ProdTomsUrl);
		
		util.waitForElementToLoad(elements.reCAPTCHA);
		
//		data.driver.switchTo().frame("iframe");
		
		Thread.sleep(2000);
		
		util.jClick(data.driver,elements.reCAPTCHA);		
	    
		
	}	
		
}