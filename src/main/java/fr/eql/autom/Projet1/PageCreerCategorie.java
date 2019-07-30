package fr.eql.autom.Projet1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import fr.eql.autom.Outils.Outils;

public class PageCreerCategorie {

	private @FindBy(xpath = "//span[contains(@id,'e5')]/input") WebElement checkbox_code;
	private @FindBy(xpath = "//input[contains(@id,'h5')]") WebElement field_nom;
	private @FindBy(xpath = "//span[contains(@id,'k5')]/input") WebElement checkbox_active;
	private @FindBy(xpath = "//td[contains(@class,'z-button-cm')][.='Ajouter une ligne']") WebElement bouton_ajouter_ligne;
	private @FindBy(xpath = "//div[contains(@id,'p5-body')]") WebElement nouvelle_ligne;
	private @FindBy(xpath = "//select") WebElement liste_deroulante;
	private @FindBy(xpath = "//select/option[.='Prix 1']") WebElement choix_prix1;
	private @FindBy(xpath = "//td[.='Enregistrer']") WebElement bouton_enregistrer;
	
	public boolean checkbox() {
		return checkbox_code.isSelected();
	}

	public void CreerCategorie() {
		Outils.remplir_un_champ(field_nom, "New Categorie");
		checkbox_active.click();
		bouton_ajouter_ligne.click();
	}
	
	public boolean nouvelleLigne() {
		return nouvelle_ligne.isDisplayed();
	}
	
	public void manipulationDuTableau() {
	liste_deroulante.click();		
		
	}
	public boolean choixPrix1() {
		return choix_prix1.isDisplayed();
	}
	
	public void  selected() {
		
		Select select = new Select(liste_deroulante);
select.selectByVisibleText("Prix 1");
	}
	
	public void valider() {
		bouton_enregistrer.click();
	}
}
