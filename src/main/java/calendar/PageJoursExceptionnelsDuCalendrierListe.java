package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageJoursExceptionnelsDuCalendrierListe extends PageObject_bandeau {

	String id_titrePage = "qEIQj4-cap";
	private WebElement titrePage;

	String id_nom = "pFJQn4-cave";
	private WebElement nom;

	String id_couleur = "pFJQo4-cave";
	private WebElement couleur;

	String id_surAffecte = "pFJQp4-cave";
	private WebElement surAffecte;

	String id_effortStandard = "pFJQq4-cave";
	private WebElement effortStandard;

	String id_effortEnHeuresSup = "pFJQr4-cave";
	private WebElement effortEnHeuresSup;

	String id_operations = "pFJQs4-cave";
	private WebElement operations;

	String id_creer = "pFJQt4-box";
	private WebElement creer;

	String id_cadreVert = "pFJQi4-real";
	private WebElement cadreVert;

	String id_messageINFO = "pFJQk7";
	private WebElement messageINFO;
	
	public boolean isVisibleTitrePage(WebDriver driver) {

		titrePage = driver.findElement(By.id(findElementByIdDynamique(id_titrePage)));

		return titrePage.isDisplayed();
	}

	public boolean isVisibleNom(WebDriver driver) {

		nom = driver.findElement(By.id(findElementByIdDynamique(id_nom)));

		return nom.isDisplayed();
	}

	public boolean isVisibleCouleur(WebDriver driver) {

		couleur = driver.findElement(By.id(findElementByIdDynamique(id_couleur)));

		return couleur.isDisplayed();
	}

	public boolean isVisibleSurAffecte(WebDriver driver) {

		surAffecte = driver.findElement(By.id(findElementByIdDynamique(id_surAffecte)));

		return surAffecte.isDisplayed();
	}

	public boolean isVisibleEffortStandard(WebDriver driver) {

		effortStandard = driver.findElement(By.id(findElementByIdDynamique(id_effortStandard)));

		return effortStandard.isDisplayed();
	}

	public boolean isVisibleEffortEnHeuresSup(WebDriver driver) {

		effortEnHeuresSup = driver.findElement(By.id(findElementByIdDynamique(id_effortEnHeuresSup)));

		return effortEnHeuresSup.isDisplayed();
	}

	public boolean isVisibleOperations(WebDriver driver) {

		operations = driver.findElement(By.id(findElementByIdDynamique(id_operations)));

		return operations.isDisplayed();
	}

	public boolean isVisibleCreer(WebDriver driver) {

		creer = driver.findElement(By.id(findElementByIdDynamique(id_creer)));

		return creer.isDisplayed();
	}
	
	public boolean isVisibleCadreVert(WebDriver driver) {

		cadreVert = driver.findElement(By.id(findElementByIdDynamique(id_cadreVert)));

		return cadreVert.isDisplayed();
	}
	
	public boolean isVisibleMessageInfo(WebDriver driver) {

		messageINFO = driver.findElement(By.id(findElementByIdDynamique(id_messageINFO)));

		return messageINFO.isDisplayed();
	}

}
