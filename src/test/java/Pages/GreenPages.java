package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreenPages {
	
	
	WebDriver driver;
	public GreenPages(WebDriver driver) {// constructer
		
		this.driver = driver;
		PageFactory.initElements(driver, this);//method overloading
		
	}
	@FindBy(xpath="//*[@id=\'root\']/div/div[1]/div/div[1]/div[3]/button")
	WebElement addField;
	
	
	public WebElement getAddField() {
		return addField;
	}

	
	@FindBy(xpath =" //*[@id=\'root\']/div/header/div/div[3]/a[4]/img")
	WebElement logoField;
	
	
	public WebElement getLogoField() {
		return logoField;
	}

	
	@FindBy(xpath ="//*[@id=\'root\']/div/header/div/div[3]/div[2]/div[2]/button")
	WebElement proccedField;
	
	
	
	public WebElement getProccedField() {
		return proccedField;
	}

	
	
	  @FindBy(css ="#root > div > div > div > div > div > input") 
	  WebElement codeField;
	  
	  
	  ////*[@id="root"]/div/div/div/div/div/input
	  
	  public WebElement getCodeField() { 
		  return codeField; }
	 

	@FindBy(xpath="//*[@id=\'root\']/div/div/div/div/div/button")
	WebElement applyField;
	public WebElement getApplyField() {
		return applyField;
	}


	
	
	
	
	
	

}
