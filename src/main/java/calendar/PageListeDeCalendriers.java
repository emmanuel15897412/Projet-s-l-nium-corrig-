package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;
import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageListeDeCalendriers extends PageObject_bandeau {

	String id_titrePageListeDeCalendriers = "xEFPj4-cap";
	WebElement titrePageListeDeCalendriers;

	String id_boutonCreer = "qFJQq4-box";
	WebElement boutonCreer;

	String id_calendrierTest1 = "eYDQwc";
	private WebElement calendrierTest1;

	String id_iconeCreerUneDerive = "o8CQ1d-box";
	private WebElement iconeCreerUneDerive;

	String id_sousCalendrier = "oFxP2e";
	private WebElement sousCalendrier;

	String id_tiretDerouler = "z1APrc-open";
	private WebElement tiretDerouler;

	String id_calendrierTestCalendrierDerive = "uDEP2e";
	private WebElement calendrierTestCalendrierDerive;

	String id_iconeCreerUneCopie = "tPzPwd-box";
	private WebElement iconeCreerUneCopie;

	String id_nom = "s38Pm4-cave";
	private WebElement nom;

	String id_heriteDeLaDate = "s38Pn4-cave";
	private WebElement heriteDeLaDate;

	String id_heritagesAJour = "c13So4-cave";
	private WebElement heritagesAJour;

	String id_operations = "s38Pp4-cave";
	private WebElement operations;

	String id_titreModifierCalendrier = "s38Ps4-cnt";
	private WebElement titreModifierCalendrier;

	String id_donneesDeCalendrier = "s38Pv4-hm";
	private WebElement donneesDeCalendrier;

	String id_cadreVert = "rDHQ8e";
	private WebElement cadreVert;

	String id_messageINFO = "rDHQae";
	private WebElement messageINFO;

	String id_iconeModif = "rDHQze";
	private WebElement iconeModif;

	public boolean isVisibleTitrePageListeDeCalendriers(WebDriver driver) {

		titrePageListeDeCalendriers = driver
				.findElement(By.id(findElementByIdDynamique(id_titrePageListeDeCalendriers)));

		return titrePageListeDeCalendriers.isDisplayed();
	}
	
	public boolean texteTitreCalendrier(WebDriver driver, String string) {
		titrePageListeDeCalendriers = driver.findElement(By.id(findElementByIdDynamique(id_titrePageListeDeCalendriers)));

		return titrePageListeDeCalendriers.getText().equals(string);
	}
	
	public boolean texteCalendrierTestCalendrierDerive(WebDriver driver, String string) {
		calendrierTestCalendrierDerive = driver.findElement(By.id(findElementByIdDynamique(id_calendrierTestCalendrierDerive)));

		return calendrierTestCalendrierDerive.getText().equals(string);
	}
	
	public boolean isVisibleBoutonCreer(WebDriver driver) {

		boutonCreer = driver.findElement(By.id(findElementByIdDynamique(id_boutonCreer)));

		return boutonCreer.isDisplayed();
	}

	public boolean texteCreer(WebDriver driver) {

		boutonCreer = driver.findElement(By.id(findElementByIdDynamique(id_boutonCreer)));

		return boutonCreer.getText().equals("Créer");
	}

	public boolean isVisibleCalendrierTest1(WebDriver driver) {

		sousCalendrier = driver.findElement(By.id(findElementByIdDynamique(id_sousCalendrier)));

		return sousCalendrier.isDisplayed();
	}
	
	public boolean textCalendrierTest1(WebDriver driver, String string) {

		calendrierTest1 = driver.findElement(By.id(findElementByIdDynamique(id_calendrierTest1)));

		return calendrierTest1.getText().equals(string);
	}

	public boolean isVisibleIconeCreerUneDerive(WebDriver driver) {

		iconeCreerUneDerive = driver.findElement(By.id(findElementByIdDynamique(id_iconeCreerUneDerive)));

		return iconeCreerUneDerive.isDisplayed();
	}

	public boolean isVisibleSousCalendrier(WebDriver driver) {

		sousCalendrier = driver.findElement(By.id(findElementByIdDynamique(id_sousCalendrier)));

		return sousCalendrier.isDisplayed();
	}

	public boolean isVisibleCalendrierTestCalendrierDerive(WebDriver driver) {

		calendrierTestCalendrierDerive = driver
				.findElement(By.id(findElementByIdDynamique(id_calendrierTestCalendrierDerive)));

		return calendrierTestCalendrierDerive.isDisplayed();
	}

	public boolean isVisibleIconeCreerUneCopie(WebDriver driver) {

		iconeCreerUneCopie = driver.findElement(By.id(findElementByIdDynamique(id_iconeCreerUneCopie)));

		return iconeCreerUneCopie.isDisplayed();
	}

	public boolean isVisibleNom(WebDriver driver) {

		nom = driver.findElement(By.id(findElementByIdDynamique(id_nom)));

		return nom.isDisplayed();
	}

	public boolean texteNom(WebDriver driver) {

		nom = driver.findElement(By.id(findElementByIdDynamique(id_nom)));

		return nom.getText().equals("Nom");
	}

	public boolean isVisibleHeriteDeLaDate(WebDriver driver) {

		heriteDeLaDate = driver.findElement(By.id(findElementByIdDynamique(id_heriteDeLaDate)));

		return heriteDeLaDate.isDisplayed();
	}

	public boolean texteHeriteDeLaDate(WebDriver driver) {

		heriteDeLaDate = driver.findElement(By.id(findElementByIdDynamique(id_heriteDeLaDate)));

		return heriteDeLaDate.getText().equals("Hérité de la date");
	}

	public boolean isVisibleHeritagesAJour(WebDriver driver) {

		heritagesAJour = driver.findElement(By.id(findElementByIdDynamique(id_heritagesAJour)));

		return heritagesAJour.isDisplayed();
	}

	public boolean texteHeritagesAJour(WebDriver driver) {

		heritagesAJour = driver.findElement(By.id(findElementByIdDynamique(id_heritagesAJour)));

		return heritagesAJour.getText().equals("Héritages à jour");
	}

	public boolean isVisibleOperations(WebDriver driver) {

		operations = driver.findElement(By.id(findElementByIdDynamique(id_operations)));

		return operations.isDisplayed();
	}

	public boolean texteOperations(WebDriver driver) {

		operations = driver.findElement(By.id(findElementByIdDynamique(id_operations)));

		return operations.getText().equals("Opérations");
	}

	public boolean isVisibleTitreModifierCalendrier(WebDriver driver) {

		titreModifierCalendrier = driver.findElement(By.id(findElementByIdDynamique(id_titreModifierCalendrier)));

		return titreModifierCalendrier.isDisplayed();
	}

	public boolean isVisibleDonneesDeCalendrier(WebDriver driver) {

		donneesDeCalendrier = driver.findElement(By.id(findElementByIdDynamique(id_donneesDeCalendrier)));

		return donneesDeCalendrier.isDisplayed();
	}

	public boolean isVisibleCadreVert(WebDriver driver) {

		cadreVert = driver.findElement(By.id(findElementByIdDynamique(id_cadreVert)));

		return cadreVert.isDisplayed();
	}

	public boolean isVisibleMessageInfo(WebDriver driver) {

		messageINFO = driver.findElement(By.id(findElementByIdDynamique(id_messageINFO)));

		return messageINFO.isDisplayed();
	}

	public PageCreerCalendrier cliquerBouton(WebDriver driver) {

		boutonCreer.click();

		return PageFactory.initElements(driver, PageCreerCalendrier.class);
	}

	public PageCreerCalendrier cliquerIconeDerive(WebDriver driver) {
		iconeCreerUneDerive = driver.findElement(By.id(findElementByIdDynamique(id_iconeCreerUneDerive)));

		iconeCreerUneDerive.click();

		return PageFactory.initElements(driver, PageCreerCalendrier.class);
	}

	public void deroulerOnglet(WebDriver driver) {
		tiretDerouler = driver.findElement(By.id(findElementByIdDynamique(id_tiretDerouler)));
	
		tiretDerouler.click();
	}

	public PageCreerCalendrier clicCopie(WebDriver driver) {
		iconeCreerUneCopie = driver.findElement(By.id(findElementByIdDynamique(id_iconeCreerUneCopie)));

		iconeCreerUneCopie.click();
		return PageFactory.initElements(driver, PageCreerCalendrier.class);
	}

}
