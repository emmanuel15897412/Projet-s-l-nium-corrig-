package fr.eql.autom.Projet1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Categorie {

	
	private @FindBy(xpath = "//div[contains(@id,'4-cap')]") WebElement titre_categorie;
	private @FindBy(xpath = "//td[.='Créer']") WebElement bouton_creer;

	
public String titreCategorie() {
	return titre_categorie.getText();
	
}
public boolean titreCategorie2() {
	return titre_categorie.isDisplayed();
}

public PageCreerCategorie creerUneCategorie(WebDriver driver) {
	bouton_creer.click();
	return PageFactory.initElements(driver, PageCreerCategorie.class);
}



}
