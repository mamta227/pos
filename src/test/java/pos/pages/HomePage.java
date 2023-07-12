package pos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BaseTest;
import generic.WebUtil;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyHomePageIsDisplayed(WebDriverWait wait)
	{
		return WebUtil.verifyPageByElement(wait, logoutLink, "HomePage");
	}

}
