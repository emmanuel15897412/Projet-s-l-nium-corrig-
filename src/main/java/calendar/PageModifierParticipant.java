package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageModifierParticipant extends PageObject_bandeau {

	String id_titrePage = "zAsP_6-cnt";
	private WebElement titrePage;

	String id_ongletCalendrier = "zAsP66-hl";
	private WebElement ongletCalendrier;

	String id_type = "zAsPib-cell";
	private WebElement type;

	String id_deriveDuCalendrierStandardCalendar = "zAsPjb-chdextr";
	private WebElement deriveDuCalendrierStandardCalendar;

	String id_calendrier = "zAsPvb-chdex";
	private WebElement calendrier;

	String id_proprietesDesJours = "zAsPwb-chdex";
	private WebElement proprietesDesJours;

	String id_boutonSupprimerLeCalendrier = "zAsPce-box";
	private WebElement boutonSupprimerLeCalendrier;

	String id_exceptions = "zAsPdc";
	private WebElement exceptions;

	String id_semaineDeTravail = "zAsPec";
	private WebElement semaineDeTravail;

	String id_periodesDActivation = "zAsPfc";
	private WebElement periodesDActivation;

	String id_boutonEnregistrer = "zAsP7f";
	private WebElement boutonEnregistrer;

	String id_boutonEnregistrerEtContinuer = "zAsP8f-box";
	private WebElement boutonSauverEtContinuer;

	String id_boutonAnnuler = "zAsPzAsP9f-box7f";
	private WebElement boutonAnnuler;

	String id_choisirUnCalendrierParent = "zAsPya";
	private WebElement choisirUnCalendrierParent;

	String id_listeDeroulante = "zAsP0b-real";
	private WebElement listeDeroulante;

	@FindBy(className = "message_INFO")
	private WebElement message_INFO;

	String id_donneesPersonnelles = "zAsP26-hl";
	private WebElement donneesPersonnelles;

	public boolean isVisibleTitrePage(WebDriver driver) {

		titrePage = driver.findElement(By.id(findElementByIdDynamique(id_titrePage)));

		return titrePage.isDisplayed();
	}

	public boolean isVisibleOngletCalendrier(WebDriver driver) {

		ongletCalendrier = driver.findElement(By.id(findElementByIdDynamique(id_ongletCalendrier)));

		return ongletCalendrier.isDisplayed();
	}

	public boolean isVisibleType(WebDriver driver) {

		type = driver.findElement(By.id(findElementByIdDynamique(id_type)));

		return type.isDisplayed();
	}

	public boolean isVisibleDeriveDuCalendrierStandardCalendar(WebDriver driver) {

		deriveDuCalendrierStandardCalendar = driver
				.findElement(By.id(findElementByIdDynamique(id_deriveDuCalendrierStandardCalendar)));

		return deriveDuCalendrierStandardCalendar.isDisplayed();
	}

	public boolean isVisibleCalendrier(WebDriver driver) {

		calendrier = driver.findElement(By.id(findElementByIdDynamique(id_calendrier)));

		return calendrier.isDisplayed();
	}

	public boolean isVisibleProprietesDesJours(WebDriver driver) {

		proprietesDesJours = driver.findElement(By.id(findElementByIdDynamique(id_proprietesDesJours)));

		return proprietesDesJours.isDisplayed();
	}

	public boolean isVisibleBoutonSupprimerLeCalendrier(WebDriver driver) {

		boutonSupprimerLeCalendrier = driver
				.findElement(By.id(findElementByIdDynamique(id_boutonSupprimerLeCalendrier)));

		return boutonSupprimerLeCalendrier.isDisplayed();
	}

	public boolean isVisibleExceptions(WebDriver driver) {

		exceptions = driver.findElement(By.id(findElementByIdDynamique(id_exceptions)));

		return exceptions.isDisplayed();
	}

	public boolean isVisibleSemaineDeTravail(WebDriver driver) {

		semaineDeTravail = driver.findElement(By.id(findElementByIdDynamique(id_semaineDeTravail)));

		return semaineDeTravail.isDisplayed();
	}

	public boolean isVisiblePeriodesDActivation(WebDriver driver) {

		periodesDActivation = driver.findElement(By.id(findElementByIdDynamique(id_periodesDActivation)));

		return periodesDActivation.isDisplayed();
	}

	public boolean isVisibleBoutonEnregistrer(WebDriver driver) {

		boutonEnregistrer = driver.findElement(By.id(findElementByIdDynamique(id_boutonEnregistrer)));

		return boutonEnregistrer.isDisplayed();
	}

	public boolean isVisibleBoutonAnnuler(WebDriver driver) {

		boutonAnnuler = driver.findElement(By.id(findElementByIdDynamique(id_boutonAnnuler)));

		return boutonAnnuler.isDisplayed();
	}

	public boolean isVisibleChoisirUnCalendrierParent(WebDriver driver) {

		choisirUnCalendrierParent = driver.findElement(By.id(findElementByIdDynamique(id_choisirUnCalendrierParent)));

		return choisirUnCalendrierParent.isDisplayed();
	}

	public boolean isVisibleListeDeroulante(WebDriver driver) {

		listeDeroulante = driver.findElement(By.id(findElementByIdDynamique(id_listeDeroulante)));

		return listeDeroulante.isDisplayed();
	}

	public boolean isVisibleDonneesPersonnelles(WebDriver driver) {

		donneesPersonnelles = driver.findElement(By.id(findElementByIdDynamique(id_donneesPersonnelles)));

		return donneesPersonnelles.isDisplayed();
	}

}
