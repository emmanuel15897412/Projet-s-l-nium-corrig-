package fr.eql.autom.Projet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_machine extends PageObject_bandeau {
	
	
	@FindBy(xpath = "//*/td[.='Créer']")
	WebElement btnCreer;

	public Page_creation_machine clickCreerBtn(WebDriver driver) {
//		WebElement btnCreer = driver.findElement(By.id(findElementByIdDynamique("aDuPx5-box")));
		btnCreer.click();
	    return PageFactory.initElements(driver, Page_creation_machine.class);
 
	}
	
}
