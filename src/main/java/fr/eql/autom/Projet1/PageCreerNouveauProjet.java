package fr.eql.autom.Projet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;



public class PageCreerNouveauProjet extends PageObject_bandeau {

	 @FindBy(xpath = "//input[contains(@id,'p7')]") WebElement champ_nom;
	 @FindBy(xpath = "//input[contains(@id,'v7-real')]") WebElement champ_modele;
	 @FindBy(xpath = "//input[contains(@id,'38')]") WebElement champ_code;
	 @FindBy(xpath = "//input[contains(@id,'48-real')]") WebElement bouton_code;
	 @FindBy(xpath = "//tr/td[@class=\"z-button-cm\"][contains(.,'Accepter')]") WebElement bouton_accepter;
	
	
	public PageDetailProjet remplir_champ(WebDriver driver) {
	Outils.remplir_un_champ(champ_nom, "PROJET_TEST1");
	bouton_code.click();
	champ_code.click();
	Outils.remplir_un_champ(champ_code, "PRJTEST001");
	bouton_accepter.click();
	return PageFactory.initElements(driver, PageDetailProjet.class);
	}
}
