package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageModifierCalendrier extends PageObject_bandeau {

	String id_titrePage = "s38Py4";
	private WebElement titrePage;
	
	String id_formulaire = "s38Py4";
	private WebElement formulaire;

	String id_boutonEnregistrer = "s38Pz7-box";
	private WebElement boutonEnregistrer;

	String id_boutonEnregistrerEtContinuer = "ss38P_8-box";
	private WebElement boutonEnregistrerEtContinuer;

	String id_boutonAnnuler = "s38P08-box";
	private WebElement boutonAnnuler;

	String id_boutonCreerUneException = "s38Pv6-box";
	private WebElement boutonCreerUneException;

	String id_cadreRouge = "_z_14";
	private WebElement cadreRouge;

	String id_fleche = "_z_14-a";
	private WebElement fleche;

	String id_croix = "_z_14-c";
	private WebElement croix;

	String id_listeDeroulante = "s38Ps6-btn";
	private WebElement listeDeroulante;

	String id_cadreRouge2 = "_z_15";
	private WebElement cadreRouge2;

	String id_fleche2 = "_z_15-a";
	private WebElement fleche2;

	String id_croix2 = "_z_15-c";
	private WebElement croix2;

	String id_champDateDeFin = "s38Pi6-real";
	private WebElement champDateDeFin;

	String id_dateDebut = "rDHQg6-real";
	private WebElement dateDebut;

	String id_valeurJour = "rDHQ1b";
	private WebElement valeurJour;

	String id_valeurTypeDException = "rDHQ5b";
	private WebElement valeurTypeDException;

	String id_valeurEffortNormal = "rDHQyd";
	private WebElement valeurEffortNormal;
	
	String id_valeurEffortSupp="rDHQua";
	private WebElement valeurEffortSupp;

	String id_inputCode = "rDHQ1e";
	private WebElement inputCode;

	String id_valeurOrigine = " rDHQ3e";
	private WebElement valeurOrigine;

	String id_valeurJourTabGauche = "rDHQt5-real";
	private WebElement valeurJourTabGauche;

	String id_valeurTypeTabGauche = "rDHQw5";
	private WebElement valeurTypeTabGauche;

	String id_tempsTravailleTabGauche = "rDHQz5";
	private WebElement tempsTravailleTabGauche;
	
	String id_typeDException = "oGKQs6-btn";
	private WebElement typeDException;

	public boolean isVisibleTitrePage(WebDriver driver) {

		titrePage = driver.findElement(By.id(findElementByIdDynamique(id_titrePage)));

		return titrePage.isDisplayed();
	}
	
	public boolean isVisibleFormulaire(WebDriver driver) {

		formulaire = driver.findElement(By.id(findElementByIdDynamique(id_formulaire)));

		return formulaire.isDisplayed();
	}

	public boolean isVisibleBoutonEnregistrer(WebDriver driver) {

		boutonEnregistrer = driver.findElement(By.id(findElementByIdDynamique(id_boutonEnregistrer)));

		return boutonEnregistrer.isDisplayed();
	}

	public boolean isVisibleBoutonEnregistrerEtContinuer(WebDriver driver) {

		boutonEnregistrerEtContinuer = driver
				.findElement(By.id(findElementByIdDynamique(id_boutonEnregistrerEtContinuer)));

		return boutonEnregistrerEtContinuer.isDisplayed();
	}

	public boolean isVisibleBoutonAnnuler(WebDriver driver) {

		boutonAnnuler = driver.findElement(By.id(findElementByIdDynamique(id_boutonAnnuler)));

		return boutonAnnuler.isDisplayed();
	}

	public boolean isVisibleCadreRouge(WebDriver driver) {

		cadreRouge = driver.findElement(By.id(findElementByIdDynamique(id_cadreRouge)));

		return cadreRouge.isDisplayed();
	}

	public boolean isVisibleFleche(WebDriver driver) {

		fleche = driver.findElement(By.id(findElementByIdDynamique(id_fleche)));

		return fleche.isDisplayed();
	}

	public boolean isVisibleCroix(WebDriver driver) {

		croix = driver.findElement(By.id(findElementByIdDynamique(id_croix)));

		return croix.isDisplayed();
	}

	public boolean isVisibleCadreRouge2(WebDriver driver) {

		cadreRouge2 = driver.findElement(By.id(findElementByIdDynamique(id_cadreRouge2)));

		return cadreRouge2.isDisplayed();
	}

	public boolean isVisibleFleche2(WebDriver driver) {

		fleche2 = driver.findElement(By.id(findElementByIdDynamique(id_fleche2)));

		return fleche2.isDisplayed();
	}

	public boolean isVisibleCroix2(WebDriver driver) {

		croix2 = driver.findElement(By.id(findElementByIdDynamique(id_croix2)));

		return croix2.isDisplayed();
	}

	public boolean isVisibleValeurJour(WebDriver driver) {

		valeurJour = driver.findElement(By.id(findElementByIdDynamique(id_valeurJour)));

		return valeurJour.isDisplayed();
	}

	public boolean isVisibleValeurTypeDException(WebDriver driver) {

		valeurTypeDException = driver.findElement(By.id(findElementByIdDynamique(id_valeurTypeDException)));

		return valeurTypeDException.isDisplayed();
	}

	public boolean isVisibleValeurEffortNormal(WebDriver driver) {

		valeurEffortNormal = driver.findElement(By.id(findElementByIdDynamique(id_valeurEffortNormal)));

		return valeurEffortNormal.isDisplayed();
	}

	public boolean isVisibleValeurEffortSupp(WebDriver driver) {

		valeurEffortSupp = driver.findElement(By.id(findElementByIdDynamique(id_valeurEffortSupp)));

		return valeurEffortSupp.isDisplayed();
	}

	
	public boolean isVisibleInputCode(WebDriver driver) {

		inputCode = driver.findElement(By.id(findElementByIdDynamique(id_inputCode)));

		return inputCode.isDisplayed();
	}

	public boolean isVisibleValeurOrigine(WebDriver driver) {

		valeurOrigine = driver.findElement(By.id(findElementByIdDynamique(id_valeurOrigine)));

		return valeurOrigine.isDisplayed();
	}

	public boolean isVisibleValeurJourTabGauche(WebDriver driver) {

		valeurJourTabGauche = driver.findElement(By.id(findElementByIdDynamique(id_valeurJourTabGauche)));

		return valeurJourTabGauche.isDisplayed();
	}

	public boolean isVisibleValeurTypeTabGauche(WebDriver driver) {

		valeurTypeTabGauche = driver.findElement(By.id(findElementByIdDynamique(id_valeurTypeTabGauche)));

		return valeurTypeTabGauche.isDisplayed();
	}

	public boolean isVisibleTempsTravailleTabGauche(WebDriver driver) {

		tempsTravailleTabGauche = driver.findElement(By.id(findElementByIdDynamique(id_tempsTravailleTabGauche)));

		return tempsTravailleTabGauche.isDisplayed();
	}

}
