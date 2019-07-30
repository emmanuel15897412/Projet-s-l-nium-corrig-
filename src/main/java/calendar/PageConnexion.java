package calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;
import fr.eql.autom.Projet1.PageAccueil;
import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageConnexion extends PageObject_bandeau {

	private @FindBy(xpath = "//input[contains(@id,'textfield')]")
	static WebElement champUtilisateur;

	private @FindBy(xpath = "//input[contains(@id,'textfield2')]")
	static WebElement champMotDePasse;
	
	private @FindBy(xpath = "//input[contains(@id,'button')]")
	static WebElement bouttonSeConnecter;
	
	public PageAccueilCalendrier seConnecter(WebDriver driver) {
		Outils.remplir_un_champ(champUtilisateur, "admin");
		Outils.remplir_un_champ(champMotDePasse, "admin");
		bouttonSeConnecter.click();
		return PageFactory.initElements(driver, PageAccueilCalendrier.class);
	}
	
}
