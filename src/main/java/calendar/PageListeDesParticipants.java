package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageListeDesParticipants extends PageObject_bandeau {

	String id_titreListeDesParticipants = "jBBQj4-cap";
	private WebElement titreListeDesParticipants;

	String id_surnom = "jBBQs5-cave";
	private WebElement surnom;

	String id_prenom = "jBBQt5-cave";
	private WebElement prenom;

	String id_id = "jBBQs5-cave";
	private WebElement id;

	String id_code = "jBBQv5-cave";
	private WebElement code;

	String id_en_file = "jBBQw5-cave";
	private WebElement en_file;

	String id_operations = "jBBQx5-cave";
	private WebElement operations;

	String id_filtre_par = "jBBQn4-chdex";
	private WebElement filtre_par;

	String id_champ_filtre_par = "jBBQq4-real";
	private WebElement champ_filtre_par;

	String id_loupe = "jBBQq4-btn";
	private WebElement loupe;

	String id_details_personnels = "jBBQc5-chdex";
	private WebElement details_personnels;

	String id_champ_details_personnels = "jBBQd5-chdex";
	private WebElement champ_details_personnels;

	String id_plus_d_options = "jBBQf5-cnt";
	private WebElement plus_d_options;

	String id_filtre = "jBBQn5-box";
	private WebElement filtre;

	String id_bouton_creer = "jBBQy5-box";
	private WebElement bouton_creer;

	String id_participant = "clickable-rows z-row";
	private WebElement participant;

	public boolean isVisibleTitreListeDesParticipants(WebDriver driver) {

		titreListeDesParticipants = driver.findElement(By.id(findElementByIdDynamique(id_titreListeDesParticipants)));

		return titreListeDesParticipants.isDisplayed();
	}

	public boolean isVisibleSurnom(WebDriver driver) {

		surnom = driver.findElement(By.id(findElementByIdDynamique(id_surnom)));

		return surnom.isDisplayed();
	}

	public boolean isVisiblePrenom(WebDriver driver) {

		prenom = driver.findElement(By.id(findElementByIdDynamique(id_prenom)));

		return prenom.isDisplayed();
	}

	public boolean isVisibleId(WebDriver driver) {

		id = driver.findElement(By.id(findElementByIdDynamique(id_id)));

		return id.isDisplayed();
	}

	public boolean isVisibleCode(WebDriver driver) {

		code = driver.findElement(By.id(findElementByIdDynamique(id_code)));

		return code.isDisplayed();
	}

	public boolean isVisibleEnFile(WebDriver driver) {

		en_file = driver.findElement(By.id(findElementByIdDynamique(id_en_file)));

		return en_file.isDisplayed();
	}

	public boolean isVisibleOperations(WebDriver driver) {

		operations = driver.findElement(By.id(findElementByIdDynamique(id_operations)));

		return operations.isDisplayed();
	}

	public boolean isVisibleFiltrePar(WebDriver driver) {

		filtre_par = driver.findElement(By.id(findElementByIdDynamique(id_filtre_par)));

		return filtre_par.isDisplayed();
	}

	public boolean isVisibleChampFiltrePar(WebDriver driver) {

		champ_filtre_par = driver.findElement(By.id(findElementByIdDynamique(id_champ_filtre_par)));

		return champ_filtre_par.isDisplayed();
	}

	public boolean isVisibleLoupe(WebDriver driver) {

		loupe = driver.findElement(By.id(findElementByIdDynamique(id_loupe)));

		return loupe.isDisplayed();
	}

	public boolean isVisibleDetailsPersonnels(WebDriver driver) {

		details_personnels = driver.findElement(By.id(findElementByIdDynamique(id_details_personnels)));

		return details_personnels.isDisplayed();
	}

	public boolean isVisibleChampDetailsPersonnels(WebDriver driver) {

		champ_details_personnels = driver.findElement(By.id(findElementByIdDynamique(id_champ_details_personnels)));

		return champ_details_personnels.isDisplayed();
	}

	public boolean isVisiblePlusDOptions(WebDriver driver) {

		plus_d_options = driver.findElement(By.id(findElementByIdDynamique(id_plus_d_options)));

		return plus_d_options.isDisplayed();
	}

	public boolean isVisibleFiltre(WebDriver driver) {

		filtre = driver.findElement(By.id(findElementByIdDynamique(id_filtre)));

		return filtre.isDisplayed();
	}

	public boolean isVisibleBoutonCreer(WebDriver driver) {

		bouton_creer = driver.findElement(By.id(findElementByIdDynamique(id_bouton_creer)));

		return bouton_creer.isDisplayed();
	}

	public boolean isVisibleParticipant(WebDriver driver) {

		participant = driver.findElement(By.id(findElementByIdDynamique(id_participant)));

		return participant.isDisplayed();
	}
	
	

}
