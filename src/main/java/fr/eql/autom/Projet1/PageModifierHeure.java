package fr.eql.autom.Projet1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageModifierHeure {

	private @FindBy(xpath = "//div[contains(@id,'4-cap')]") WebElement titre;
	private @FindBy(xpath = "//td[.='Enregistrer']") WebElement bouton_enregistrer;
	private @FindBy(xpath = "//td[.='Sauver et continuer']") WebElement bouton_sauverEtContinuer;
	private @FindBy(xpath = "//td[.='Annuler']") WebElement bouton_annuler;
	private @FindBy(xpath = "//td[contains(@id,'5-cnt')]") WebElement titreModifier;
	private @FindBy(xpath = "//span[contains(@id,'s5')]/input") WebElement case_activite;

	public boolean verifierTitre() {

		return titre.isDisplayed();
	}

	public String verifierTitreModifier() {

		return titreModifier.getText();
	}

	public PageCreerHeure annuler(WebDriver driver) {
		bouton_annuler.click();

		return PageFactory.initElements(driver, PageCreerHeure.class);
	}

	
	public void cliquerSurCaseActivite() {
		case_activite.click();
		bouton_enregistrer.click();
	}
	
	
	
}
