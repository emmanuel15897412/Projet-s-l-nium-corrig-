package fr.eql.autom.Projet1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import fr.eql.autom.Outils.Outils;

public class PageCreerHeure extends PageObject_bandeau {

	private @FindBy(xpath = "//div[contains(@id,'j4-cap')]") WebElement titre;
	private @FindBy(xpath = "//div[contains(@id,'n4-cave')][.='Code']") WebElement colonne_code;
	private @FindBy(xpath = "//div[contains(@id,'o4-cave')][.='Nom de type']") WebElement colonne_nom_de_type;

	private @FindBy(xpath = "//div[contains(@id,'p4-cave')][.='Prix par défaut']") WebElement colonne_prix;
	private @FindBy(xpath = "//div[contains(@id,'q4-cave')][.='Activé']") WebElement colonne_active;
	private @FindBy(xpath = "//div[contains(@id,'r4-cave')][.='Actions']") WebElement colonne_actions;
	private @FindBy(xpath = "//td[.='Créer']") WebElement bouton_creer;
	private @FindBy(xpath = "//input[contains(@id,'i5')]") WebElement field_code2;
	private @FindBy(xpath = "//input[contains(@id,'j5')]") WebElement checkbox_code;
	private @FindBy(xpath = "//input[contains(@id,'m5')]") WebElement field_nom;
	private @FindBy(xpath = "//input[contains(@id,'p5')]") WebElement field_prix;
	private @FindBy(xpath = "//input[contains(@id,'s5-real')]") WebElement checkbox_active;
	private @FindBy(xpath = "//td[.='Enregistrer']") WebElement bouton_enregistrer;
	private @FindBy(xpath = "//td[.='Sauver et continuer']") WebElement bouton_sauverEtContinuer;
	private @FindBy(xpath = "//td[.='Annuler']") WebElement bouton_annuler;
	private @FindBy(xpath = "//div[.='Vous devez spécifier un nombre au lieu de Prix 1.'][contains(@class,'errbox')]") WebElement message_erreur;
	private @FindBy(xpath = " //div[@class='z-errbox-center']") WebElement message_d_erreur;
	private @FindBy(xpath = "//div/div/div/div/div/div/div/div[contains(.,'ne peut pas être vide')]") WebElement message_d_erreur2;
	private @FindBy(xpath = "//tbody[substring(@id,5)='s4']/tr/td[1]//span") List<WebElement> toutes_lignes;

	// verifier page type heure
	public String titre() {
		return titre.getText();
	}

	public boolean code() {
		return colonne_code.isDisplayed();
	}

	public boolean nomDeType() {
		return colonne_nom_de_type.isDisplayed();
	}

	public boolean prix() {
		return colonne_prix.isDisplayed();
	}

	public boolean activation() {
		return colonne_active.isDisplayed();
	}

	public boolean actions() {
		return colonne_actions.isDisplayed();
	}

	// cliquer sur le bouton creer pour ouvrir un formulaire
	public void creer() {
		bouton_creer.click();
	}

	// verifier le formulaire de création d'un nouveau type d'heures

	public boolean code2() {
		return field_code2.isDisplayed();
	}

	public boolean checkboxCode() {
		return checkbox_code.isDisplayed();
	}

	public void decocher() {
		checkbox_code.click(); // decocher la case permet de degriser le champs code afin de verifier sa
								// presence
	}

	public boolean nom() {
		return field_nom.isDisplayed();
	}

	public boolean prix2() {
		return field_prix.isDisplayed();
	}

	public boolean checkbox_active() {
		return checkbox_active.isSelected();
	}

	public boolean bouton_sauverEtContinuer() {
		return bouton_sauverEtContinuer.isDisplayed();
	}

	public boolean bouton_enregistrer() {
		return bouton_enregistrer.isDisplayed();
	}

	public boolean bouton_annuler() {
		return bouton_annuler.isDisplayed();
	}

	// remplir le champs nom avec la valeur Prix 1 et faire copier coller dans le
	// champs prix puis valider le formulaire
	public void remplir(WebDriver driver) {

		Outils.remplir_un_champ(field_nom, "Prix 1");
		Outils.remplir_un_champ(field_prix, "150");
	}

	public void valider() {
		bouton_enregistrer.click();
	}

	// verification du message d'erreur

	public boolean messageDErreur() {
		return message_d_erreur.isDisplayed();
	}

	public String erreur() {
		return message_d_erreur.getText();
	}

	public void manipulationChampCode() throws InterruptedException {
		checkbox_code.click();
		Thread.currentThread().sleep(5000);
		field_code2.clear();
		bouton_enregistrer.click();

	}

	public String messageDErreurChampVide() {

		return message_d_erreur2.getText();
	}

	public void changerChampCode() {

		Outils.remplir_un_champ(field_code2, "J9");
		bouton_enregistrer.click();
	}

	public String testErioc(WebDriver driver) {

		WebElement eric = driver.findElement(By.id(findElementByIdDynamique("wYCQv4")));
		return eric.getText();
	}



	public int retournerNumeroDeLigne(String s) {
		int ligneCourante = 1;
		int ligneSauvegarder = 0;
		for (WebElement ligne : toutes_lignes) {

			if (ligne.getText().equals(s)) {
				System.out.println(s + "est pésent "+"dans la colonne "+ligneCourante);

				ligneSauvegarder = ligneCourante;
			}
			ligneCourante++;
System.out.println(ligneSauvegarder);
		}
		return ligneSauvegarder;

	}

	public PageModifierHeure trouver(String s, WebDriver driver) {
		WebElement boutonTrouver = driver.findElement(By.xpath("//div[substring(@id,5)='k4-body']//tbody[@class='z-rows']/tr["+retournerNumeroDeLigne(s)+"]/td[3]//span"));
		boutonTrouver.click();
		return PageFactory.initElements(driver, PageModifierHeure.class);
	}

	
	public PageModifierHeure trouver2 (String s, WebDriver driver) throws InterruptedException {
		
		WebElement boutonTrouver2 = driver.findElement(By.xpath("//div[substring(@id,5)='k4-body']//tbody[@class='z-rows']/tr[3]/td[1]//span")); /*l'appel a la methode retournerNumeroDeLignes fait tomber le test en échec*/
		Thread.currentThread().sleep(5000);
		boutonTrouver2.click();
		return PageFactory.initElements(driver, PageModifierHeure.class);
	}

	
}
