package Regression;

import java.sql.Driver;
import java.util.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import java.util.List;



import Data_Functions.Functions;
import Data_Functions.constantData;
import Data_Functions.driverUtil;
import Data_Functions.pageElements;
import SiteMonitoring.SiteMonitoringConstantData;

public class Homepage {
	
	public driverUtil util = new driverUtil() ;
	constantData data_obj ;
	pageElements element_obj ;
	Functions func ;
	Data_Regression data_regression = new Data_Regression() ;
	SiteMonitoringConstantData SiteData;
	
	public Homepage(constantData data,pageElements elem,Functions functions) throws Exception
	   {
		   data_obj=data;
		   element_obj=elem;
		   func= functions;		   
	   }
	
	public void Homepage_Links() throws Exception
	{
        System.out.println("Home Page");
		
//		System.out.println("\tRegression Testing: Menu Icon Click");
		
		System.out.println("\t\tTestcase - 1"); 
		
	    data_obj.driver.get(data_regression.URL);
		
		if(util.Isdisplayed(element_obj.no))
		{
			util.Click(element_obj.no);
		}
		
		int fail=0 ;
		
//		util.Click(element_obj.MenuIcon_click);
//		
//		if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//span[contains(text(),'Fifth Member Fan Club')]"))))
//		{
//			System.out.println("\t\t\t"+"Menu icon verification Successful");
//			
//			data_regression.result = true;
//			
//			func.write_Regressiontest(data_regression.result, 1);
//		}
//		
//		else
//		{
//			System.out.println("\t\t\t"+"Menu icon verification UnSuccessful");
//			
//			data_regression.result = false;
//			
//			func.write_Regressiontest(data_regression.result, 1);
//		}
//		
//		util.Click(element_obj.MenuClose);
		
		System.out.println("\tRegression Testing: Search icon click");
		
		System.out.println("\t\tTestcase - 1"); 
		
		util.Click(element_obj.srch);
		
		if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("(//a[contains(text(),'Tour')])[1]"))))
		{
			System.out.println("\t\t\t"+"Search icon verification Successful");
			
			data_regression.result = true;
			
			func.write_Regressiontest(data_regression.result, 1);
		}
		
		else
		{
			System.out.println("\t\t\t"+"Search Icon verification UnSuccessful");
			
			data_regression.result = false;
			
			func.write_Regressiontest(data_regression.result, 1);
		}
		
		util.Click(element_obj.SearchClose);
		
        System.out.println("\tRegression Testing: Login icon click");
		
		System.out.println("\t\tTestcase - 2"); 
		
		util.Click(element_obj.login);
		
		if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//div[@class='login-box login-account']"))))
		{
			System.out.println("\t\t\t"+"Login Icon verification Successful");
			
			data_regression.result = true;
			
			func.write_Regressiontest(data_regression.result, 2);
		}
		
		else
		{
			System.out.println("\t\t\t"+"Login Icon verification UnSuccessful");
			
			data_regression.result = false;
			
			func.write_Regressiontest(data_regression.result, 2);
		}
		
		 data_obj.driver.navigate().back();
		
//		 System.out.println("\tRegression Testing: Fifth Member Club Icon click");
//			
//		 System.out.println("\t\tTestcase - 4"); 
//			
//			util.Click(element_obj.FifthMemberIcon);
//			
//			if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//div[@class='col metclub-heading']/h3[contains(text(),'Become A Fifth Member')]"))))
//			{
//				System.out.println("\t\t\t"+"Fifth Member Club Icon verification Successful");
//				
//				data_regression.result = true;
//				
//				func.write_Regressiontest(data_regression.result, 4);
//			}
//			
//			else
//				
//			{
//				System.out.println("\t\t\t"+"Fifth Member Club Icon verification UnSuccessful");
//				
//				data_regression.result = false;
//				
//				func.write_Regressiontest(data_regression.result, 4);
//			}
//			
//		   data_obj.driver.navigate().back();
//		   
//		   System.out.println("\tRegression Testing: Metstore Icon click");
//			
//			 System.out.println("\t\tTestcase - 5"); 
//				
//				util.Click(element_obj.MetStoreIcon);
//				
//				if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//div[@class='refinement-content refinement']"))))
//				{
//					System.out.println("\t\t\t"+"Metstore Icon verification Successful");
//					
//					data_regression.result = true;
//					
//					func.write_Regressiontest(data_regression.result, 5);
//				}
//				
//				else
//					
//				{
//					System.out.println("\t\t\t"+"Metstore Icon verification UnSuccessful");
//					
//					data_regression.result = false;
//					
//					func.write_Regressiontest(data_regression.result, 5);
//				}
//				
//			   data_obj.driver.navigate().back();
//			   
//			   Thread.sleep(2000);
			   
			   System.out.println("\tRegression Testing: Cart Icon click");
				
				 System.out.println("\t\tTestcase - 3"); 
					
					util.Click(element_obj.MinicartIcon);
					
					if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//h2[contains(text(),'Cart')]"))))
					{
						System.out.println("\t\t\t"+"Cart Icon verification Successful");
						
						data_regression.result = true;
						
						func.write_Regressiontest(data_regression.result, 3);
					}
					
					else
						
					{
						System.out.println("\t\t\t"+"Cart Icon verification UnSuccessful");
						
						data_regression.result = false;
						
						func.write_Regressiontest(data_regression.result, 3);
					}
					
				   data_obj.driver.navigate().back();
				   
				   System.out.println("\t\tTestcase - 4"); 
				   
				   System.out.println("\tRegression Testing: Help Link click");
				   
				   Thread.sleep(2000);
					
					util.Click(element_obj.HelpLink);
					
					if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//a[contains(text(),'Sign Up Today')]"))))
					{
						System.out.println("\t\t\t"+"Help Link verification Successful");
						
						data_regression.result = true;
						
						func.write_Regressiontest(data_regression.result, 4);
					}
					
					else
						
					{
						System.out.println("\t\t\t"+"Help Link verification UnSuccessful");
						
						data_regression.result = false;
						
						func.write_Regressiontest(data_regression.result, 4);
					}
					
				   data_obj.driver.navigate().back();


				   System.out.println("\t\tTestcase - 5"); 

				   System.out.println("\tRegression Testing: Return Link click");

				   Thread.sleep(2000);	
	
				   util.Click(element_obj.ReturnLink);
	
				   if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//a[contains(text(),'Sign Up Today')]"))))
				   {
					   System.out.println("\t\t\t"+"Return Link verification Successful");
		
					   data_regression.result = true;
		
					   func.write_Regressiontest(data_regression.result, 5);
				   }
	
				   else
		
				   {
					   System.out.println("\t\t\t"+"Return Link verification UnSuccessful");
		
					   data_regression.result = false;
		
					   func.write_Regressiontest(data_regression.result, 5);
				   }
	
				   data_obj.driver.navigate().back();
				   
				   
				   
				   System.out.println("\t\tTestcase - 6"); 
				   
				   System.out.println("\tRegression Testing: Credit Link click");
				   			   
				   util.waitForElementToLoad(element_obj.CreditsLink);
					
				   util.jClick(data_obj.driver,element_obj.CreditsLink);
					
					if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//h3[contains(text(),'METALLICA.COM')]"))))
					{
						System.out.println("\t\t\t"+"Credit Link verification Successful");
						
						data_regression.result = true;
						
						func.write_Regressiontest(data_regression.result, 6);
					}
					
					else
						
					{
						System.out.println("\t\t\t"+"Credit Link verification UnSuccessful");
						
						data_regression.result = false;
						
						func.write_Regressiontest(data_regression.result, 6);
					}
					
				   data_obj.driver.navigate().back();
				   
				   System.out.println("\t\tTestcase - 7"); 
				   
				   System.out.println("\tRegression Testing: Terms Of Use Link click");
					
					util.Click(element_obj.TermsOfUseLink);
					
					if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//a[contains(text(),'Sign Up Today')]"))))
					{
						System.out.println("\t\t\t"+"Terms Of Use Link verification Successful");
						
						data_regression.result = true;
						
						func.write_Regressiontest(data_regression.result, 7);
					}
					
					else
						
					{
						System.out.println("\t\t\t"+"Terms Of Use Link verification UnSuccessful");
						
						data_regression.result = false;
						
						func.write_Regressiontest(data_regression.result, 7);
					}
					
				   data_obj.driver.navigate().back();
				   
				   System.out.println("\t\tTestcase - 8"); 
				   
				   System.out.println("\tRegression Testing: Privacy Policy Link click");
					
					util.Click(element_obj.PrivacyPolicyLink);
					
					if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//a[contains(text(),'Sign Up Today')]"))))
					{
						System.out.println("\t\t\t"+"Privacy Policy Link verification Successful");
						
						data_regression.result = true;
						
						func.write_Regressiontest(data_regression.result, 8);
					}
					
					else
						
					{
						System.out.println("\t\t\t"+"Privacy Policy verification UnSuccessful");
						
						data_regression.result = false;
						
						func.write_Regressiontest(data_regression.result, 8);
					}
					
				    data_obj.driver.navigate().back();
		
//		
//                    System.out.println("\t\tTestcase - 54");
//				   
//				    System.out.println(" \tRegression Testing: Adding pre-order and instock product to cart ");
//					
//				    func.Add_product(data_regression.Preorderinstock, data_regression.qty);
//					
//					if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//div[@class='col col--xs-12 col--md-4']/h3"))))
//					{
//						System.out.println("\t\t\t"+"Adding pre-order and instock product to cart Successful");
//						
//						func.write_Regressiontest(true, 54);
//					}
//					else
//					{
//						System.out.println("\t\t\t"+"Adding pre-order and instock product to cart  Unsuccessful");
//						
//						func.write_Regressiontest(false, 54);
//					}
////					
////					util.Click(element_obj.driver.findElement(By.xpath("(//span[text()='Back to Cart'])[2]")));
////					
////					util.WaitAndClick(element_obj.remove);
////				}   
				    
	   	   
	}
	
	public void Pagination() throws Exception
	{
		  System.out.println("\t\tTestcase - 55");
		   
	      System.out.println(" \tRegression Testing:Navigating through page number option in metstore ");
	      
	      data_obj.driver.get(data_regression.URL);
			
			if(util.Isdisplayed(element_obj.no))
			{
				util.Click(element_obj.no);
			}
			
			int fail=0 ;
	     
	  	  util.Click(element_obj.MetStoreIcon);
	  	  
	  	  util.Click(element_obj.page3);
	  	  
	  	  Thread.sleep(2000);
	  	 
	  	  util.Click(element_obj.page5);
	  	  
	  	if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//a[contains(text(),'...And Justice For All (Remastered) - Vinyl')]"))))
		{
			System.out.println("\t\t\t"+"Navigating through page number verification Successful");
			
			data_regression.result = true;
			
			func.write_Regressiontest(data_regression.result, 55);
		}
		
		else
			
		{
			System.out.println("\t\t\t"+"Navigating through page number verification UnSuccessful");
			
			data_regression.result = false;
			
			func.write_Regressiontest(data_regression.result, 55);
			
		}
			
	}
			public void ViewAll() throws Exception
			{
			
			 System.out.println("\t\tTestcase - 56");
			   
		     System.out.println(" \tRegression Testing: Displaying all the products by clicking View All buttton ");
		     
		     util.Click(element_obj.viewAll);
		     
		 	if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//a[@title='Refine by:2XL']"))))
			{
				System.out.println("\t\t\t"+"Displaying all the products by clicking View All buttton verification Successful");
				
				data_regression.result = true;
				
				func.write_Regressiontest(data_regression.result, 56);
			}
			
			else
				
			{
				System.out.println("\t\t\t"+"Displaying all the products by clicking View All buttton verification UnSuccessful");
				
				data_regression.result = false;
				
				func.write_Regressiontest(data_regression.result, 56);
		     
			
			}
		
			}
			
			public void ApplyandRemovefilters() throws Exception
			{
				System.out.println("\t\tTestcase - 57");
				   
			    System.out.println(" \tRegression Testing: Applying and removing the Filters in the left panel ");
			    
			    Thread.sleep(2000);
				
				util.Click(element_obj.XXl);
				
				util.Click(element_obj.Price20to49);
				
				util.Click(element_obj.XXLRemove);
				
				util.Click(element_obj.Price20to49Remove);
				
				if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//a[contains(text(),'Curitiba Screen Printed Concert Poster')]"))))
				{
					System.out.println("\t\t\t"+"Applying and removing the Filters in the left panel verification Successful");
					
					data_regression.result = true;
					
					func.write_Regressiontest(data_regression.result, 57);
				}
				
				else
					
				{
					System.out.println("\t\t\t"+"Applying and removing the Filters in the left panel verification UnSuccessful");
					
					data_regression.result = false;
					
					func.write_Regressiontest(data_regression.result, 57);
					
				}
				
						
			}


			public void SortBy() throws Exception
			{
				System.out.println("\t\tTestcase - 58");
				   
			    System.out.println(" \tRegression Testing: Sorting the products ");
			    
			    util.Click(element_obj.Most);
			        
			    Select drp = new Select(element_obj.Most);
			    
				drp.selectByVisibleText("Most Popular");
			    
				if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("(//select[@id='grid-sort-header']//option[contains(text(),'Most Popular')])[2]"))))
				{
					System.out.println("\t\t\t"+"Sorting the products verification Successful");
					
					data_regression.result = true;
					
					func.write_Regressiontest(data_regression.result, 58);
				}
				
				else
					
				{
					System.out.println("\t\t\t"+"Sorting the products verification UnSuccessful");
					
					data_regression.result = false;
					
					func.write_Regressiontest(data_regression.result, 58);
					
				}
			        
			}

			public void AddressSuggestionScroll() throws Exception
			{
				   data_obj.driver.get(data_regression.URL);
					
					if(util.Isdisplayed(element_obj.no))
					{
						util.Click(element_obj.no);
					}
				
					func.PRD_login();
					
//					func.PreorderPopupScroll("LIVE METALLICA: WERCHTER, BELGIUM - JULY 1, 2022 (2CD)");
					
					func.Add_product("DON'T TREAD ON ME T-SHIRT - MEDIUM");
					
					util.Click(element_obj.checkout);

					util.Clear(element_obj.address1);
					
					util.Sendkeys(element_obj.address1,"1667 K Street NW");

					util.Clear(element_obj.city);
					
					util.Sendkeys(element_obj.city,"Washington");
					
					Select country = new Select(element_obj.countryField);
					country.selectByVisibleText("United States");

					util.Clear(element_obj.zipcode);
					
					util.Sendkeys(element_obj.zipcode,"20006");
					
					Select state = new Select(element_obj.stateField);
					state.selectByVisibleText("Washington");
					
					util.Clear(element_obj.phone);
					
					util.Sendkeys(element_obj.phone,"9858989588");
							
					util.WaitAndClick(element_obj.continuebill);
					
					Thread.sleep(1000);
					
					JavascriptExecutor scrollup = (JavascriptExecutor) data_obj.driver;
					
					scrollup.executeScript("window.scrollTo(0,55);");
					
					JavascriptExecutor scrolldown = (JavascriptExecutor) data_obj.driver;
					
					scrolldown.executeScript("window.scrollTo(0,2000);");
					
				}

			public void PreOrderPopupScroll() throws Exception
			{
				   data_obj.driver.get(data_regression.URL);
					
					if(util.Isdisplayed(element_obj.no))
					{
						util.Click(element_obj.no);
					}
				
					func.PRD_login();
					
					func.PreorderPopupScroll("LIVE METALLICA: WERCHTER, BELGIUM - JULY 1, 2022 (2CD)");
					
					Thread.sleep(2000);
					
					JavascriptExecutor scrollup = (JavascriptExecutor) data_obj.driver;
					
					scrollup.executeScript("window.scrollTo(0,55);");
					
					JavascriptExecutor scrolldown = (JavascriptExecutor) data_obj.driver;
					
					scrolldown.executeScript("window.scrollTo(0,2000);");
					
			}
			
			
			
			
			public void MiniCartOverlay() throws Exception
			{
				
				data_obj.driver.get(data_obj.DEV_url);
				
				if(util.Isdisplayed(element_obj.no))
				{
					util.Click(element_obj.no);
				}
			
				func.PRD_login();
				
				util.Click(element_obj.srch);
				
				util.Click(element_obj.SearchBar);
				
				util.Sendkeys(element_obj.srchIP,"Shirt");

				element_obj.srchTxt.submit();

				Actions act = new Actions(data_obj.driver);
				 
				 act.moveToElement(element_obj.Product).perform();
				 
				 util.jClick(data_obj.driver,element_obj.Quickview);
				 
				 Thread.sleep(2000);
				 
				 if(util.Isdisplayed(element_obj.SizeMedium))
				 {
					 util.jClick(data_obj.driver,element_obj.SizeMedium);
					 
					
				}
				 
				 
				 
					if(util.Isdisplayed(element_obj.preorder))
					{
						util.jClick(data_obj.driver,element_obj.preorder);
						
						util.jClick(data_obj.driver,element_obj.preorder_ack);
						
						util.jClick(data_obj.driver,element_obj.preorder_ATC);
						
					}
					
					else
					{
						util.jClick(data_obj.driver,element_obj.addcart);
					}
				  
				 	 
			
//				func.MiniCart("DON'T TREAD ON ME T-SHIRT - MEDIUM");
					
				util.waitForElementToLoad(element_obj.Overlay);
				 
				String opacity = element_obj.Overlay.getCssValue("opacity").toString();
				 				
				System.out.println(opacity);
				
				if(opacity.equals("0.7"))
				{
					System.out.println("\t\t\t"+"Opacity = 0.7 validation successful");
					
					data_regression.result = true;
					
					func.write_Regressiontest(data_regression.result, 51);
					
					util.Click(element_obj.miniviewcart);
					
					int Site = element_obj.Multipleremove.size();
					
					System.out.println(Site);
					
					for(int i=1; i <= Site; i++)
					
					{
						util.Click(element_obj.Multipleremove.get(0));
						
				    } 
					
				}
				else
				{
					
					System.out.println("\t\t\t"+"Opacity = 0.7 validation unsuccessful");
					
					data_regression.result = false;
					
					func.write_Regressiontest(data_regression.result, 51);
					
					util.Click(element_obj.miniviewcart);
					
					int Site = element_obj.Multipleremove.size();
					
					System.out.println(Site);
					
					for(int i=1; i <= Site; i++)
					
					{
						util.Click(element_obj.Multipleremove.get(0));
						
				    } 
					
//					data_obj.driver.close();
					
				}
				
				
			}
			
			
			public void Click_Product_Link_in_Cart_Page() throws InterruptedException
			{
				
				data_obj.driver.get(data_regression.URL);
				
				if(util.Isdisplayed(element_obj.no))
				{
					util.Click(element_obj.no);
				}
				
//				func.Add_product("BUFFALO 2022 TOUR T-SHIRT - MEDIUM");
			
//				func.PRD_login();
				
				 util.Click(element_obj.MetStoreIcon);
				 
				 Actions act = new Actions(data_obj.driver);
				 
				 act.moveToElement(element_obj.Product).perform();
				 
				 util.jClick(data_obj.driver,element_obj.Quickview);
				 
//				 util.jClick(data_obj.driver,element_obj.SizeSmall);
				  
				 
				 if(util.Isdisplayed(element_obj.SizeSmall))
				 {
					 util.jClick(data_obj.driver,element_obj.SizeSmall);
					 
					
				}
				 
				 
				 
					if(util.Isdisplayed(element_obj.preorder))
					{
						util.jClick(data_obj.driver,element_obj.preorder);
						
						util.jClick(data_obj.driver,element_obj.preorder_ack);
						
						util.jClick(data_obj.driver,element_obj.preorder_ATC);
						
					}
					
					else
					{
						util.jClick(data_obj.driver,element_obj.addcart);
					}
				  
				 
				 util.Click(element_obj.miniviewcart);
				 
				 String Product = element_obj.Product_Link.getText().toUpperCase();
				 
				 System.out.println(Product);
				 
//				 Thread.sleep(10000);
				 
				 util.Click(element_obj.Product_Link); 
				 
				 String PDP_Product = element_obj.Product_name_PDP.getText();
				 
				 System.out.println(PDP_Product);
				 
				 if(PDP_Product.equals(Product))
				 {
					 
					 System.out.println("Product link in Cart page successful");
					 
				 }
			
				}
			
		public void Shipping_and_Billing_address_validation() throws InterruptedException
		{
			
			data_obj.driver.get(data_regression.URL);
			
			if(util.Isdisplayed(element_obj.no))
			{
				util.Click(element_obj.no);
			}
			
			func.PRD_login();
			
			func.Add_product("BUFFALO 2022 TOUR T-SHIRT - MEDIUM");
			
			util.Click(element_obj.checkout);
			
			String Shipaddress = element_obj.Shippingaddress.getText();
			
			System.out.println(Shipaddress);
			
			util.Click(element_obj.continuebill);
			
			if(util.Isdisplayed(element_obj.userAddress)) 
			{
				util.WaitAndClick(element_obj.userAddress);
			}
			
			String Shipaddress_Billingpage = element_obj.Shippingaddress.getText();
			
			System.out.println(Shipaddress_Billingpage);
			
			if(Shipaddress_Billingpage.equals(Shipaddress))
			{
				
				
				System.out.println("Shipping address in billing page validation successful");
				
			}
			
			}
			
	public void GiftCertificate_Validation() throws Exception
	{
		
		data_obj.driver.get(data_regression.URL);
		
		if(util.Isdisplayed(element_obj.no))
		{
			util.Click(element_obj.no);
		}
		
		func.PRD_login();
		
		util.Click(element_obj.srch);
		
		util.Click(element_obj.SearchBar);
		
		util.Sendkeys(element_obj.srchIP,"Gift Certificate");

		element_obj.srchTxt.submit();
		
		util.Click(element_obj.GiftCertificateProduct);
		
		util.Clear(element_obj.YourNameField);
		
		util.Sendkeys(element_obj.YourNameField, "TesterMetallica");
		
		util.Sendkeys(element_obj.FriendNameField, "Ithikash");
		
		util.Sendkeys(element_obj.FriendEmailField, "ithikasha@unitedtechno.com");
		
		util.Sendkeys(element_obj.ConfirmFriendEmail, "ithikasha@unitedtechno.com");
		
		util.Sendkeys(element_obj.MessageField, "Test");
		
		util.Sendkeys(element_obj.AmountField, "100");
		
		util.Click(element_obj.AddToCartCTA);
		
		util.Click(element_obj.checkout);
		
		try
		{
			System.out.println("Entering Try");
			
			util.Isdisplayed(element_obj.driver.findElement(By.xpath("//div[@id='billing-address-header']")));
			
			util.Clear(element_obj.firstname);

			util.Sendkeys(element_obj.firstname,data_obj.firstname);
			
			util.Clear(element_obj.lastname);

			util.Sendkeys(element_obj.lastname,data_obj.lastname);

			util.Clear(element_obj.address1);
			
			util.Sendkeys(element_obj.address1,"5411 3rd St");

			util.Clear(element_obj.city);
			
			util.Sendkeys(element_obj.city,"San Francisco");

			util.Clear(element_obj.zipcode);
			
			util.Sendkeys(element_obj.zipcode,"94124-2605");

			Select country = new Select(element_obj.countryField);
			country.selectByVisibleText("United States");
			
				Select state = new Select(element_obj.Bill_stateField);
				state.selectByVisibleText("California");
				
				util.Clear(element_obj.phone);
				
				util.Sendkeys(element_obj.phone,data_obj.Phone);
			
				
				

		     
		     if(data_obj.preorder_flag > 1)
				{
					util.Click(element_obj.preorder_ack);
				}
		     
		}	
		
		catch(Exception ex)
		{
			
			System.out.println("Entering Catch");
			
			util.Clear(element_obj.address1);
			
			util.Sendkeys(element_obj.address1,"5411 3rd St");

			util.Clear(element_obj.city);
			
			util.Sendkeys(element_obj.city,"San Francisco");
			
			Select country = new Select(element_obj.countryField);
			country.selectByVisibleText("United States");

			util.Clear(element_obj.zipcode);
			
			util.Sendkeys(element_obj.zipcode,"94124-2605");
			
			Select state = new Select(element_obj.stateField);
			state.selectByVisibleText("California");
			
			util.Clear(element_obj.phone);
			
			util.Sendkeys(element_obj.phone,"9858989588");
			
			util.WaitAndClick(element_obj.continuebill);
			
			if(util.Isdisplayed(element_obj.userAddress)) 
			{
				util.WaitAndClick(element_obj.userAddress);
			}
			
			
			
		}	
		
		func.smoke_payment("Amex");
			
			if(util.Isdisplayed(element_obj.shpInt))
			{
				util.Click(element_obj.shpInt);
				
			}
						
			util.Click(element_obj.continuePlaceorder);
			
			if(util.Isdisplayed(element_obj.userAddress)) 
			{
				util.WaitAndClick(element_obj.userAddress);
				util.WaitAndClick(element_obj.continuePlaceorder);

			}
			
			if(util.Isdisplayed(element_obj.driver.findElement(By.xpath("//div[@class='place-order-header']//child::h2"))))
			{
				System.out.println("Gift Certificate Validation successful");
			}
	}
	
	
	
public void Hostek() throws Exception
{
	
	data_obj.driver.get(data_obj.Prod_url);
	
//	util.Click(elements.no);
	
//	func.PRD_login();
	
	util.Click(element_obj.srch);
	
	util.Click(element_obj.ContestsLink);
	
	int ContestLists = element_obj.ContestLists.size();
	
	System.out.println(ContestLists);
	
	
	int fail = 0;
	
	if(util.Isdisplayed(element_obj.ContestPageError)) {
		
		System.out.println("Error Occurs");
		
		System.out.println("\t\t\t"+"Contest Lists validation Unsuccessful");
		
		func.Hostek(false, 16);
		
	}
	
	
	else {	
	
		
	for(int i=1; i<=ContestLists; i++)
		
	{
		
		
		String ContestName = element_obj.driver.findElement(By.xpath("//div[@class='show contest']//following::h4[text()]["+i+"]")).getText();
		
		String ContestLocation = element_obj.driver.findElement(By.xpath("//div[@class='show contest']//following::p["+i+"]")).getText();
		
		WebElement ContestButton = element_obj.driver.findElement(By.xpath("//div[@class='show contest']//following::div[@class='col col--xs-6 col--lg-7 ctas']["+i+"]"));
			
//		Assert.assertTrue(a.isDisplayed(),"Contest Name is displayed");
//		
//		Assert.assertTrue(b.isDisplayed(),"Contest Location is displayed");
//		
//		Assert.assertTrue(c.isDisplayed(),"Contest Button is displayed in "+i+" section");
//		
		if (ContestName != null )
		{
			System.out.println(ContestName);
			System.out.println("\t\t\t"+"ContestsName validation successful");
			}
		
		else
		{
			System.out.println("\t\t\t"+"ContestsName validation unsuccessful in Contest" + i + ContestName);	
			SiteData.FailedContestLists = SiteData.FailedContestLists.concat( i + ContestName + ",");
			fail++;
		}	
		
		if (ContestLocation.length() != 0 )	
		{
			System.out.println(ContestLocation);
			System.out.println("\t\t\t"+"ContestsLocation validation successful");
			}
		
		else
		{
			System.out.println("\t\t\t"+"ContestsLocation validation unsuccessful in Contest" +  i + ContestName);
			SiteData.FailedContestLists = SiteData.FailedContestLists.concat( i + ContestName);
			fail++;
		}	
		
		
		if (ContestButton.isDisplayed())
			
		{
			System.out.println("\t\t\t"+"ContestsButton validation successful");
			}
		
		else
		{
			System.out.println("\t\t\t"+"ContestsButton validation unsuccessful in Contest" +  i + ContestName);
			SiteData.FailedContestLists = SiteData.FailedContestLists.concat( i + ContestName);
			fail++;
		}	
		
	}
	
	if(fail>0)
	{
		System.out.println("\t\t\t"+"Contest Lists validation Unsuccessful");
		func.Hostek(false, 16);
	}
	
	else
	{
		System.out.println("\t\t\t"+"Contest Lists validation Successful");
		func.Hostek(true, 16);
		
	
	}
	}
	
}


	
public void Amplience() throws Exception
{
	
    data_obj.driver.get(data_obj.Prod_url);
   
	util.Click(element_obj.srch);
	
	util.Click(element_obj.PastDatesLink);
	
	int PastdateLists = element_obj.PastDateLists.size();
	
	System.out.println(PastdateLists);
	
	int fail = 0;
	
	for(int i=1; i<=PastdateLists; i++)
		
	{
		
		String PastTourDate = element_obj.driver.findElement(By.xpath("(//a[@class='past-show-item']//following::span[@class='date-numbers']//following-sibling::p)["+i+"]")).getText();
		
		String PastTourLocation = element_obj.driver.findElement(By.xpath("//a[@class='past-show-item']//following::span[@class='venue-city'][text()]["+i+"]")).getText();
		
		String PastTourStadium = element_obj.driver.findElement(By.xpath("//a[@class='past-show-item']//following::span[@class='venue-name-wrap'][text()]["+i+"]")).getText();
		
		WebElement PastTourButton = element_obj.driver.findElement(By.xpath("//a[@class='past-show-item']//following::button[@class='button cta']["+i+"]"));
		
		if (PastTourDate.length() != 0 )
		{
			System.out.println(PastTourDate);
			System.out.println("\t\t\t"+"PastTourDate validation successful");
			}
		
		else
		{
			System.out.println("\t\t\t"+"PastTourDate validation unsuccessful in Contest" + i + PastTourLocation);	
			SiteData.FailedPastTourDateLists = SiteData.FailedPastTourDateLists.concat( i + PastTourLocation);
			fail++;
		}	
		
		if (PastTourLocation.length() != 0 )	
		{
			System.out.println(PastTourLocation);
			System.out.println("\t\t\t"+"PastTourLocation validation successful");
			}
		
		else
		{
			System.out.println("\t\t\t"+"PastTourLocation validation unsuccessful in Contest" +  i + PastTourLocation);
			SiteData.FailedPastTourDateLists = SiteData.FailedPastTourDateLists.concat( i + PastTourLocation);
			fail++;
		}	
		
		
		if (PastTourStadium.length() != 0 )	
		{
			System.out.println(PastTourStadium);
			System.out.println("\t\t\t"+"PastTourStadium validation successful");
			}
		
		else
		{
			System.out.println("\t\t\t"+"PastTourStadium validation unsuccessful in Contest" +  i + PastTourLocation);
			SiteData.FailedPastTourDateLists = SiteData.FailedPastTourDateLists.concat( i + PastTourLocation);
			fail++;
		}	
		
		
		
		if (PastTourButton.isDisplayed())
			
		{
			System.out.println("\t\t\t"+"PastTourButton validation successful");
			
			}
		
		else
		{
			System.out.println("\t\t\t"+"PastTourButton validation unsuccessful in Contest" +  i + PastTourLocation);
			SiteData.FailedPastTourDateLists = SiteData.FailedPastTourDateLists.concat( i + PastTourLocation);
			fail++;
		}	
		
	}
	
	if(fail>0)
	{
		System.out.println("\t\t\t"+"PastTourdates Lists validation Unsuccessful");
		func.Amplience(false, 17);
	}
	else
	{
		System.out.println("\t\t\t"+"PastTourdates Lists validation Successful");
		func.Amplience(true, 17);
		
	
	}		
		
	}
	
	
	public void Algolia() throws InterruptedException
	{
		
		int fail = 0;
		
		data_obj.driver.get(data_obj.Prod_url);
		
		func.PRD_login();
		
		data_obj.driver.get(data_regression.AlgoliaURL);
		
		int Pages = element_obj.Pages.size();
		
		if(Pages == 20)
		{
			
			System.out.println("Pass");
				
		}
		
		else
		{
			
			System.out.println("Fail");
		}
		
//		  List<WebElement> ReadMore = data_obj.driver.findElements(By.xpath("//a[text()='Read More']"));
		   
		for (int x = 7; x < Pages; x++) {
		
		   List<WebElement> ReadMore = data_obj.driver.findElements(By.xpath("//a[text()='Read More']"));
			
	       String  a= ReadMore.get(x).getAttribute("href");
	        System.out.println(a);
	        data_obj.driver.get(a);
	        
	        try {
	        if(data_obj.driver.findElement(By.xpath("//h1[contains(text(),'Page Not Found')]")).isDisplayed())
	        {
	      
	        System.out.println("Failed in" + a);
	        fail ++;
	        
	        }}
	        
		catch(Exception e)
	        {
	        	System.out.println("Passed");
	        }        
	       	      
	        data_obj.driver.navigate().back(); 
		}


}
	
	
	public void AlgoliaSongs() throws InterruptedException
	{
		SeventyTwoSeasons();
		
		AintMyBitch();
		
		AllWithinMyHands();
		
		EnterSandman();
		
		IfDarknessHadASon();		
		
		}
	
	
	public void SeventyTwoSeasons() throws InterruptedException
	{
		data_obj.driver.get(data_obj.Prod_url);
		
		util.Click(element_obj.srch);
		
		util.Click(element_obj.SongsandLyricsLink);
		
		util.waitForElementToLoad(element_obj.SongPageTitle);
		
		util.Click(element_obj.ChangeViewIcon);
		
		int SongLists = element_obj.SongsList.size();
		
		System.out.println(SongLists);
		
		SiteData.SeventyTwoSeasonsName = element_obj.SeventyTwoSeasonsName.getText().toString();
		
		SiteData.SeventyTwoSeasonsCount = element_obj.SeventyTwoSeasonsCount.getText().toString();
		
		System.out.println("Count for 72 Seasons in Songs List page");
		
		System.out.println(SiteData.SeventyTwoSeasonsName+" = "+ SiteData.SeventyTwoSeasonsCount);
		
		util.Click(element_obj.SeventyTwoSeasonsName);
		
		util.waitForElementToLoad(element_obj.CountInSongsDetailPage);
		
		SiteData.SeventyTwoSeasonsCountinSongsPage = element_obj.CountInSongsDetailPage.getText().toString();
		
		System.out.println("Count for 72 Seasons in Song Detail page");
		
		System.out.println(SiteData.SeventyTwoSeasonsName+" = "+SiteData.SeventyTwoSeasonsCountinSongsPage);
		
		data_obj.driver.navigate().back();
		
		if(SiteData.SeventyTwoSeasonsCount.equals(SiteData.SeventyTwoSeasonsCountinSongsPage))
		{
			System.out.println("Pass\n");			
		}
		
	}
	
	
	public void AintMyBitch() throws InterruptedException
		{
		
		SiteData.AintMyBitchName = element_obj.AintMyBitchName.getText().toString();
		
		SiteData.AintMyBitchCount = element_obj.AintMyBitchCount.getText().toString();
		
		System.out.println("Count for Ain't My Bitch in Songs List page");
		
		System.out.println(SiteData.AintMyBitchName+" = "+ SiteData.AintMyBitchCount);
		
		util.Click(element_obj.AintMyBitchName);
		
		util.waitForElementToLoad(element_obj.CountInSongsDetailPage);
		
		SiteData.AintMyBitchCountinSongsPage = element_obj.CountInSongsDetailPage.getText().toString();
		
		System.out.println("Count for Ain't My Bitch in Song Detail page");
		
		System.out.println(SiteData.AintMyBitchName+" = "+SiteData.AintMyBitchCountinSongsPage);
		
		data_obj.driver.navigate().back();
		
		if(SiteData.AintMyBitchCount.equals(SiteData.AintMyBitchCountinSongsPage))
		{
			System.out.println("Pass\n");		
		}
		
		}
		
		public void AllWithinMyHands() throws InterruptedException
		{
		
		SiteData.AllWithinMyHandsName = element_obj.AllWithinMyHandsName.getText().toString();
		
		SiteData.AllWithinMyHandsCount = element_obj.AllWithinMyHandsCount.getText().toString();
		
		System.out.println("Count for All Within My Hands in Songs List page");
		
		System.out.println(SiteData.AllWithinMyHandsName+" = "+ SiteData.AllWithinMyHandsCount);
		
		util.Click(element_obj.AllWithinMyHandsName);
		
		util.waitForElementToLoad(element_obj.CountInSongsDetailPage);
		
		SiteData.AllWithinMyHandsCountinSongsPage = element_obj.CountInSongsDetailPage.getText().toString();
		
		System.out.println("Count for All Within MyHands in Song Detail page");
		
		System.out.println(SiteData.AllWithinMyHandsName+" = "+SiteData.AllWithinMyHandsCountinSongsPage);
		
		data_obj.driver.navigate().back();
		
		if(SiteData.AllWithinMyHandsCount.equals(SiteData.AllWithinMyHandsCountinSongsPage))
		{
			System.out.println("Pass\n");		
		}
		
		}
		
		public void  EnterSandman() throws InterruptedException
		{
		
		SiteData.EnterSandmanName = element_obj.EnterSandmanName.getText().toString();
		
		SiteData.EnterSandmanCount = element_obj.EnterSandmanCount.getText().toString();
		
		System.out.println("Count for Enter Sandman in Songs List page");
		
		System.out.println(SiteData.EnterSandmanName+" = "+ SiteData.EnterSandmanCount);
		
		util.Click(element_obj.EnterSandmanName);
		
		util.waitForElementToLoad(element_obj.CountInSongsDetailPage);
		
		SiteData.EnterSandmanCountinSongsPage = element_obj.CountInSongsDetailPage.getText().toString();
		
		System.out.println("Count for Enter Sandman in Song Detail page");
		
		System.out.println(SiteData.EnterSandmanName+" = "+SiteData.EnterSandmanCountinSongsPage);
		
		data_obj.driver.navigate().back();
		
		if(SiteData.EnterSandmanCount.equals(SiteData.EnterSandmanCountinSongsPage))
		{
			System.out.println("Pass\n");		
		}	
		
		}
		
		public void IfDarknessHadASon() throws InterruptedException
		{
		
		SiteData.IfDarknessHadASonName = element_obj.IfDarknessHadASonName.getText().toString();
		
		SiteData.IfDarknessHadASonCount = element_obj.IfDarknessHadASonCount.getText().toString();
		
		System.out.println("Count for If Darkness Had A Son Name in Songs List page");
		
		System.out.println(SiteData.IfDarknessHadASonName+" = "+ SiteData.IfDarknessHadASonCount);
		
		util.Click(element_obj.IfDarknessHadASonName);
		
		util.waitForElementToLoad(element_obj.CountInSongsDetailPage);
		
		SiteData.IfDarknessHadASonCountinSongsPage = element_obj.CountInSongsDetailPage.getText().toString();
		
		System.out.println("Count for If Darkness Had A Son in Song Detail page");
		
		System.out.println(SiteData.IfDarknessHadASonName+" = "+SiteData.IfDarknessHadASonCountinSongsPage);
		
		data_obj.driver.navigate().back();
		
		if(SiteData.IfDarknessHadASonCount.equals(SiteData.IfDarknessHadASonCountinSongsPage))
		{
			System.out.println("Pass\n");		
		}		
		
		
	}

}
		
		

		
		
		
		





