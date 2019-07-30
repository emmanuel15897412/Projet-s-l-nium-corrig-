package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageCreerCalendrierCalendrierTest1 extends PageObject_bandeau {

	String id_nom = "pH2Q35-chdextr";
	private WebElement nom;

	String id_champNom = "pH2Q45-chdextr";
	private WebElement champNom;

	String id_type = "pH2Q65-chdextr";
	private WebElement type;

	String id_champType = "pH2Q75-chdextr";
	private WebElement champType;

	String id_boutonEnregistrerEtContinuer = "saveandcontinue-button global-action z-button";
	private WebElement boutonEnregistrerEtContinuer;

	String id_messageWarning = "message_WARNING";
	private WebElement messageWarning;

	String id_boutonEnregistrer = "save-button global-action z-button";
	private WebElement boutonEnregistrer;

	String id_messageInfo = "message_INFO";
	private WebElement messageInfo;

	String id_calendrierTest2 = "gQBQ1d";
	private WebElement calendrierTest2;

	public boolean isVisibleNom(WebDriver driver) {

		nom = driver.findElement(By.id(findElementByIdDynamique(id_nom)));

		return nom.isDisplayed();
	}

	public boolean isVisiblechampNom(WebDriver driver) {

		champNom = driver.findElement(By.id(findElementByIdDynamique(id_champNom)));

		return champNom.isDisplayed();
	}

	public boolean isVisibleType(WebDriver driver) {

		type = driver.findElement(By.id(findElementByIdDynamique(id_type)));

		return type.isDisplayed();
	}

	public boolean isVisibleChampType(WebDriver driver) {

		champType = driver.findElement(By.id(findElementByIdDynamique(id_champType)));

		return champType.isDisplayed();
	}

	public boolean isVisibleBoutonEnregistrer(WebDriver driver) {

		boutonEnregistrer = driver.findElement(By.id(findElementByIdDynamique(id_boutonEnregistrer)));

		return boutonEnregistrer.isDisplayed();
	}

	public boolean isVisibleBoutonEnregistrerEtContinuer(WebDriver driver) {

		boutonEnregistrerEtContinuer = driver.findElement(By.id(findElementByIdDynamique(id_boutonEnregistrerEtContinuer)));

		return boutonEnregistrerEtContinuer.isDisplayed();
	}

	public boolean isVisibleMessageWarning(WebDriver driver) {

		messageWarning = driver.findElement(By.id(findElementByIdDynamique(id_messageWarning)));

		return messageWarning.isDisplayed();
	}

	public boolean isVisibleMessageWInfo(WebDriver driver) {

		messageInfo = driver.findElement(By.id(findElementByIdDynamique(id_messageInfo)));

		return messageInfo.isDisplayed();
	}

	public boolean isVisibleCalendrierTest2(WebDriver driver) {

		calendrierTest2 = driver.findElement(By.id(findElementByIdDynamique(id_calendrierTest2)));

		return calendrierTest2.isDisplayed();
	}

}
