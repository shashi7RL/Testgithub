package mytra.test;



import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.file.EnvrFiles;
import mytra.pages.MytraPages;




public class MytraTest extends EnvrFiles{
	

	@Test(priority = 1)
	public void loginToMytra() throws IOException {
		
		PageFactory.initElements(driver,MytraPages.class);
		
		String actualtitle = driver.getTitle();
		
		System.out.println(actualtitle);
		
		Assert.assertEquals(actualtitle.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"), true);
		
		WebElement profile = MytraPages.profileIcon;
		
		Actions A = new Actions(driver);
		A.moveToElement(profile).build().perform();
		
		
		String actualtext = MytraPages.btnLogin.getText();
		System.out.println(actualtext);
		
		String Exptext ="login / Signup";
		
		SoftAssert SA= new SoftAssert();
		
		SA.assertEquals(actualtext,Exptext);
		
		takeSceenshot();
		
		MytraPages.btnLogin.click();
		
	//	SA.assertAll();
		
		
	}
	
	@Test(priority = 2)
	@Parameters("Mobilenumber")
	public void loginToProfile(String Mobilenumber) throws IOException {
		
		PageFactory.initElements(driver,MytraPages.class);
		
		MytraPages.txtMobileNumber.sendKeys(Mobilenumber);
		
		
		takeSceenshot();
		 
		MytraPages.btnContinue.click();
		
		driver.navigate().back();
		
	}
	
	
	@Test(priority = 3)
	
	public void validateHomeAndLiving() throws IOException {
		
		PageFactory.initElements(driver,MytraPages.class);
		
		Actions A = new Actions(driver);
		A.moveToElement(MytraPages.lnkHomeAndLiving).build().perform();
		
		MytraPages.lnkPlantsPlanters.click();
		takeSceenshot();
		
	}
	
@Test(priority = 4 , enabled =false)
	
	public void validateSortByItems() throws IOException, InterruptedException {
		
		/*
		 * WebElement SortItems = MytraPages.dropdownSortByItems;
		 * 
		 * Select ItemsList = new Select(SortItems);
		 * 
		 * List<WebElement> UIList = ItemsList.getOptions();
		 * 
		 * for (WebElement listofItems : UIList) {
		 * 
		 * System.out.println(listofItems.getAttribute("UIvalues")); }
		 */
	
	PageFactory.initElements(driver,MytraPages.class);
	
	Actions A = new Actions(driver);
	A.moveToElement(MytraPages.dropdownSortBy).build().perform();
	
	String dropdown =MytraPages.dropdownSortBy.getText();
	
	System.out.println(dropdown);
	
	
	
	takeSceenshot();
	Thread.sleep(2000);
	
	MytraPages.chckMen.click();
	
	Boolean menitem=MytraPages.chckMen.isDisplayed();
	
	SoftAssert SAA =new SoftAssert();
	
	SAA.assertEquals(menitem, "true");
	
	
	  String filterItem =MytraPages.chckMen.getText();
	  
	  System.out.println(filterItem);
	  
	  Assert.assertEquals(filterItem, "Men");
	 
	
    Boolean BedsheetsIsSelected = MytraPages.radioBedsheets.isSelected();
	
	if (BedsheetsIsSelected ==true) {
		MytraPages.radioBedsheets.click();
	}else {
		
	System.out.println("Bedsheets is not Selected");
	
	}
	
	takeSceenshot();
	}


@Test(priority = 5)

public void validateFancyMart() throws IOException {
	
	PageFactory.initElements(driver,MytraPages.class);
	
	WebElement fancyMart = MytraPages.lnkFancyMart;
	
	JavascriptExecutor clickFacnyMart = (JavascriptExecutor) driver;
	clickFacnyMart.executeScript("arugments[0].scrollIntiview(true)",fancyMart);
	
	fancyMart.click();
	
	takeSceenshot();
	
	String actualTitle ="Buy Fancy Mart Green & White Artificial Bamboo Leaves In Apple Pot  - Artificial Flowers And Plants for Unisex 13649032 | Myntra";
	
	System.out.println(actualTitle);
	
	Assert.assertEquals(actualTitle, "Buy Fancy Mart Green & White Artificial Bamboo Leaves In Apple Pot  - Artificial Flowers And Plants for Unisex 13649032 | Myntra");
	
}


}























