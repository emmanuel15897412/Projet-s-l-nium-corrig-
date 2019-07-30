package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;
import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageCreerCalendrier extends PageObject_bandeau {

	String id_titreCreerCalendrier = "uTxPr4-cap";
	WebElement titreCreerCalendrier;

	String id_ongletDoneesDeCalendrier = "pGKQv4-hm";
	WebElement ongletDoneesDeCalendrier;

	String id_boutonEnregistrer = "pGKQz7-box";
	WebElement boutonEnregistrer;

	String id_boutonEnregistrerEtContinuer = "pGKQ_8-box";
	WebElement boutonEnregistrerEtContinuer;

	String id_boutonAnnuler = "pGKQ08-box";
	WebElement boutonAnnuler;

	String id_nom = "tEsP45";
	WebElement nom;

	String id_champNom = "mHMQ45";
	WebElement champNom;

	String id_type = "dP3Q65";
	WebElement type;

	String id_champType = "eZGQ85";
	WebElement champType;

	String id_message_INFO = "i0xPqd";
	WebElement message_INFO;
	
	String id_messageOrange = "aBMTod";
	WebElement messageOrange;
	
	String id_titreCreerCalendrierDerive = "z-caption-l";
	WebElement titreCreerCalendrierDerive;

	String id_valeurJour = "rDHQ1h";
	WebElement valeurJour;

	String id_valeurTypeDException = "rDHQ3h";
	WebElement valeurTypeDException;

	String id_valeurEffortNormal = "rDHQ5h";
	WebElement valeurEffortNormal;

	String id_valeurEffortSupp = "rDHQ6h";
	WebElement valeurEffortSupp;

	String id_libelleCode = "aT5Qa5";
	WebElement libelleCode;

	String id_inputCode = "v2CQc5";
	WebElement inputCode;

	String id_valeurOrigine = "rDHQah";
	WebElement valeurOrigine;

	String id_checkBox = "nD8Qd5-chdex";
	WebElement checkBox;

	public boolean isVisibleTitreCreerCalendrier(WebDriver driver) {

		titreCreerCalendrier = driver.findElement(By.id(findElementByIdDynamique(id_titreCreerCalendrier)));

		return titreCreerCalendrier.isDisplayed();
	}

	public boolean texteTitreCalendrier(WebDriver driver, String string) {
		titreCreerCalendrier = driver.findElement(By.id(findElementByIdDynamique(id_titreCreerCalendrier)));

		return titreCreerCalendrier.getText().equals(string);
	}

	public boolean isVisibleOngletDoneesDeCalendrier(WebDriver driver) {

		ongletDoneesDeCalendrier = driver.findElement(By.id(findElementByIdDynamique(id_ongletDoneesDeCalendrier)));

		return ongletDoneesDeCalendrier.isDisplayed();
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

	public boolean isVisibleNom(WebDriver driver) {

		nom = driver.findElement(By.id(findElementByIdDynamique(id_nom)));

		return nom.isDisplayed();
	}

	public boolean isVisiblechampNom(WebDriver driver) {

		champNom = driver.findElement(By.id(findElementByIdDynamique(id_champNom)));

		return champNom.isDisplayed();
	}

	public boolean texteChampNom(WebDriver driver, String string) {

		champNom = driver.findElement(By.id(findElementByIdDynamique(id_nom)));

		return champNom.getText().equals(string);
	}

	public boolean isVisibleType(WebDriver driver) {

		type = driver.findElement(By.id(findElementByIdDynamique(id_type)));

		return type.isDisplayed();
	}

	public boolean isVisibleChampType(WebDriver driver) {

		champType = driver.findElement(By.id(findElementByIdDynamique(id_champType)));

		return champType.isDisplayed();
	}

	public boolean texteChampType(WebDriver driver, String string) {

		champType = driver.findElement(By.id(findElementByIdDynamique(id_champType)));

		return champType.getText().equals(string);
	}

	public boolean isVisibleMessageInfo(WebDriver driver) {

		message_INFO = driver.findElement(By.id(findElementByIdDynamique(id_message_INFO)));

		return message_INFO.isDisplayed();
	}
	
	public boolean texteMessageInfo(WebDriver driver, String string) {
		message_INFO = driver.findElement(By.id(findElementByIdDynamique(id_message_INFO)));

		return message_INFO.getText().equals(string);
	}
	
	public boolean texteMessageInfoCouleur(WebDriver driver, String string) {
		messageOrange = driver.findElement(By.id(findElementByIdDynamique(id_messageOrange)));

		return messageOrange.getText().equals(string);
	}
	
	public String couleurMessageInfo(WebDriver driver) {
		
		String color = message_INFO.getCssValue("color");
		String hex = Color.fromString(color).asHex();
		//#FDCA87
		return hex;
	}

	public boolean isVisibleTitreCreerCalendrierDerive(WebDriver driver) {

		titreCreerCalendrierDerive = driver.findElement(By.id(findElementByIdDynamique(id_titreCreerCalendrierDerive)));

		return titreCreerCalendrierDerive.isDisplayed();
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

	public boolean isVisiblelibelleCode(WebDriver driver) {

		libelleCode = driver.findElement(By.id(findElementByIdDynamique(id_libelleCode)));

		return libelleCode.isDisplayed();
	}

	public boolean isVisibleCheckBox(WebDriver driver) {

		checkBox = driver.findElement(By.id(findElementByIdDynamique(id_checkBox)));

		return checkBox.isDisplayed();
	}

	public boolean isVisibleValeurOrigine(WebDriver driver) {

		valeurOrigine = driver.findElement(By.id(findElementByIdDynamique(id_valeurOrigine)));

		return valeurOrigine.isDisplayed();
	}

	public String textCheckBox(WebDriver driver) {

		checkBox = driver.findElement(By.id(findElementByIdDynamique(id_checkBox)));

		return checkBox.getText();
	}

	public void remplirFormulaire(WebDriver driver, String string) {
		champNom = driver.findElement(By.id(findElementByIdDynamique(id_champNom)));
		Outils.remplir_un_champ(champNom, string);
	}

	public PageListeDeCalendriers cliquerBoutonEnregistrer(WebDriver driver) {

		boutonEnregistrer = driver.findElement(By.id(findElementByIdDynamique(id_boutonEnregistrer)));
		boutonEnregistrer.click();

		return PageFactory.initElements(driver, PageListeDeCalendriers.class);
	}

	public PageListeDeCalendriers cliquerBoutonEnregistrerEtContinuer(WebDriver driver) {

		boutonEnregistrerEtContinuer = driver
				.findElement(By.id(findElementByIdDynamique(id_boutonEnregistrerEtContinuer)));
		boutonEnregistrerEtContinuer.click();

		return PageFactory.initElements(driver, PageListeDeCalendriers.class);
	}

	public PageListeDeCalendriers cliquerBoutonAnnuler(WebDriver driver) {
		boutonAnnuler = driver.findElement(By.id(findElementByIdDynamique(id_boutonAnnuler)));
		boutonAnnuler.click();

		return PageFactory.initElements(driver, PageListeDeCalendriers.class);
	}

}
