package mytra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MytraPages {
	
	
	
	@FindBy(xpath="//span[text()='Profile']")
	public static WebElement profileIcon;
	
	
	@FindBy(xpath="//input[@class='form-control mobileNumberInput']")
	public static WebElement txtMobileNumber;


	@FindBy(xpath="//div[text()='CONTINUE']")
	public static WebElement btnContinue;
	
	
	@FindBy(xpath="//a[text()='login / Signup']")
	public static WebElement btnLogin;
	
	
	@FindBy(xpath="//div[@class='welcome-header']")
	public static WebElement txtlogin;
	
	//5th
	
	@FindBy(xpath="//div[@class='desktop-navLink']//a[text()='Home & Living']")
	public static WebElement lnkHomeAndLiving;
	
	@FindBy(xpath="//a[text()='Plants & Planters']")
	public static WebElement lnkPlantsPlanters;
	 
	@FindBy(xpath="//div[@class='sort-sortBy']")
	public static WebElement dropdownSortBy;
	
	/*
	 * @FindBy(xpath="//div[@class='sort-sortBy']/ul/li") public static WebElement
	 * dropdownSortByItems;
	 */
	
	@FindBy(xpath="//label[text()='Men']//div[@class='common-radioIndicator']")
	public static WebElement chckMen;
	
	/*
	 * @FindBy(xpath="//label[text()='Men']/input") public static WebElement txtMen;
	 */
	
	
	@FindBy(xpath="//label[text()='Bedsheets']/div")
	public static WebElement radioBedsheets;
	
	
	
	@FindBy(xpath="//h4[text()='Artifical Flowers with Vase']")
	public static WebElement lnkFancyMart;
	
	
	
	
	
	
	
	
	
	
	
	
}
