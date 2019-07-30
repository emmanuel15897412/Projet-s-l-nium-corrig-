package fr.eql.autom.Projet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObjectIndex extends PageObject_bandeau{
	@FindBy(name = "j_username")
	WebElement username_field;
	
	@FindBy(name = "j_password")
	WebElement password_field;
	
	@FindBy(name = "button")
	WebElement bouton_se_connecter;
	
	WebElement ressources;
	String idressource = "n3IQr-b";
	
	public PageAccueil se_connecter(WebDriver driver, String username, String password) {
		 
		username_field.clear();
	    username_field.sendKeys(username);
	    password_field.clear();
	    password_field.sendKeys(password);
	    bouton_se_connecter.click();
	    return PageFactory.initElements(driver, PageAccueil.class);
 }
	// todo
	// a virer
	/**
	 * 
	 * @param driver
	 * @return 
	 */
	public String findRessourceTest(WebDriver driver) {
		
		System.out.println(idressource);
		WebElement we = driver.findElement(By.id(findElementByIdDynamique(idressource)));
		return we.getText();
	}
}
