package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Projet1.PageObject_bandeau;
import fr.eql.autom.Projet1.Page_participants;

public class PageAccueilCalendrier extends PageObject_bandeau {
	@FindBy(xpath = "//button[contains(text(),'Ressources')]")
	WebElement ongletRessources;

	String id_sousOngletCalendriers = "f6BPw-a";
	WebElement sousOngletCalendriers;

	public PageListeDeCalendriers accesCalendriers(WebDriver driver) {

		Actions a = new Actions(driver);
		a.moveToElement(ongletRessources).build().perform();
		
		sousOngletCalendriers = driver.findElement(By.id(findElementByIdDynamique(id_sousOngletCalendriers)));
		
		sousOngletCalendriers.click();
				
		return PageFactory.initElements(driver, PageListeDeCalendriers.class);

	}
}
