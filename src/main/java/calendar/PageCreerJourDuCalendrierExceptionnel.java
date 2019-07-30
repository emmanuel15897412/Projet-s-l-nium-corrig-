package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import fr.eql.autom.Projet1.PageObject_bandeau;

public class PageCreerJourDuCalendrierExceptionnel extends PageObject_bandeau {

	String id_titrePage = "pFJQv4-cnt";
	private WebElement titrePage;

	String id_modifier = "pFJQy4-hm";
	private WebElement modifier;

	String id_code = "pFJQ65";
	private WebElement code;

	String id_inputCode = "pFJQ85";
	private WebElement inputCode;

	String id_checkBox1 = "pFJQ95-real";
	private WebElement checkBox1;

	String id_generer = "pFJQ95";
	private WebElement generer;

	String id_nom = "pFJQ95-real";
	private WebElement nom;

	String id_inputNom = "pFJQ95";
	private WebElement inputNom;

	String id_couleur = "pFJQe5";
	private WebElement couleur;

	String id_couleurStyle1 = "pFJQh5";
	private WebElement couleurStyle1;

	String id_couleurStyle2 = "pFJQj5";
	private WebElement couleurStyle2;

	String id_couleurSelect = "pFJQg5";
	private WebElement couleurSelect;

	String id_boxExceptionParticuliere = "pFJQh5";
	private WebElement boxExceptionParticuliere;

	String id_exceptionParticuliere = "pFJQi5";
	private WebElement exceptionParticuliere;

	String id_boxExceptionHeritee = "pFJQj5";
	private WebElement boxExceptionHeritee;

	String id_exceptionHeritee = "pFJQk5";
	private WebElement exceptionHeritee;

	String id_effortStandard = "pFJQm5";
	private WebElement effortStandard;

	String id_listeEffortStandard1 = "pFJQo5";
	private WebElement listeEffortStandard1;

	String id_listeEffortStandard2 = "pFJQp5";
	private WebElement listeEffortStandard2;

	String id_effortSupp = "pFJQr5";
	private WebElement effortSupp;

	String id_listeEffortSupp1 = "pFJQu5";
	private WebElement listeEffortSupp1;

	String id_listeEffortSupp2 = "pFJQv5-chdex";
	private WebElement listeEffortSupp2;

	String id_checkBox2 = "pFJQw5-real";
	private WebElement checkBox2;

	String id_infiniment = "pFJQw5-real";
	private WebElement infiniment;

	String id_boutonEnregistrer = "pFJQx5-box";
	private WebElement boutonEnregistrer;

	String id_boutonEnregistrerEtContinuer = "pFJQy5-box";
	private WebElement boutonEnregistrerEtContinuer;

	String id_boutonAnnuler = "pFJQz5-box";
	private WebElement boutonAnnuler;

	String id_cadreRougeEST1 = "_z_1";
	private WebElement cadreRougeEST1;

	String id_flecheEST1 = "_z_1-a";
	private WebElement flecheEST1;

	String id_croixEST1 = "_z_1-c";
	private WebElement croixEST1;

	String id_cadreRougeEST2 = "_z_19";
	private WebElement cadreRougeEST2;

	String id_flecheEST2 = "_z_23-a";
	private WebElement flecheEST2;

	String id_croixEST2 = "_z_23-c";
	private WebElement croixEST2;

	String id_cadreRougeESU1 = "_z_26";
	private WebElement cadreRougeESU1;

	String id_flecheESU1 = "_z_26-a";
	private WebElement flecheESU1;

	String id_croixESU1 = "_z_26-c";
	private WebElement croixESU1;

	String id_cadreRougeESU2 = "_z_29";
	private WebElement cadreRougeESU2;

	String id_flecheESU2 = "_z_29-a";
	private WebElement flecheESU2;

	String id_croixESU2 = "_z_29-c";
	private WebElement croixESU2;

	public boolean isVisibleTitrePage(WebDriver driver) {

		titrePage = driver.findElement(By.id(findElementByIdDynamique(id_titrePage)));

		return titrePage.isDisplayed();
	}

	public boolean isVisibleModifier(WebDriver driver) {

		modifier = driver.findElement(By.id(findElementByIdDynamique(id_modifier)));

		return modifier.isDisplayed();
	}

	public boolean isVisibleCode(WebDriver driver) {

		code = driver.findElement(By.id(findElementByIdDynamique(id_code)));

		return code.isDisplayed();
	}

	public boolean isVisibleInputCode(WebDriver driver) {

		inputCode = driver.findElement(By.id(findElementByIdDynamique(id_inputCode)));

		return inputCode.isDisplayed();
	}

	public boolean isVisibleCheckBox1(WebDriver driver) {

		checkBox1 = driver.findElement(By.id(findElementByIdDynamique(id_checkBox1)));

		return checkBox1.isDisplayed();
	}

	public boolean isVisibleGenerer(WebDriver driver) {

		generer = driver.findElement(By.id(findElementByIdDynamique(id_generer)));

		return generer.isDisplayed();
	}

	public boolean isVisibleNom(WebDriver driver) {

		nom = driver.findElement(By.id(findElementByIdDynamique(id_nom)));

		return nom.isDisplayed();
	}

	public boolean isVisibleInputNom(WebDriver driver) {

		inputNom = driver.findElement(By.id(findElementByIdDynamique(id_inputNom)));

		return inputNom.isDisplayed();
	}

	public boolean isVisibleCouleur(WebDriver driver) {

		couleur = driver.findElement(By.id(findElementByIdDynamique(id_couleur)));

		return couleur.isDisplayed();
	}

	public boolean isVisibleCouleurSelect(WebDriver driver) {

		couleurSelect = driver.findElement(By.id(findElementByIdDynamique(id_couleurSelect)));

		return couleurSelect.isDisplayed();
	}

	public boolean isVisibleBoxExceptionParticuliere(WebDriver driver) {

		boxExceptionParticuliere = driver.findElement(By.id(findElementByIdDynamique(id_boxExceptionParticuliere)));

		return boxExceptionParticuliere.isDisplayed();
	}

	public boolean isVisibleExceptionParticuliere(WebDriver driver) {

		exceptionParticuliere = driver.findElement(By.id(findElementByIdDynamique(id_exceptionParticuliere)));

		return exceptionParticuliere.isDisplayed();
	}

	public boolean isVisiblebBoxExceptionHeritee(WebDriver driver) {

		boxExceptionHeritee = driver.findElement(By.id(findElementByIdDynamique(id_boxExceptionHeritee)));

		return boxExceptionHeritee.isDisplayed();
	}

	public boolean isVisibleExceptionHeritee(WebDriver driver) {

		exceptionHeritee = driver.findElement(By.id(findElementByIdDynamique(id_exceptionHeritee)));

		return exceptionHeritee.isDisplayed();
	}

	public boolean isVisibleEffortStandard(WebDriver driver) {

		effortStandard = driver.findElement(By.id(findElementByIdDynamique(id_effortStandard)));

		return effortStandard.isDisplayed();
	}

	public boolean isVisibleListeEffortStandard1(WebDriver driver) {

		listeEffortStandard1 = driver.findElement(By.id(findElementByIdDynamique(id_listeEffortStandard1)));

		return listeEffortStandard1.isDisplayed();
	}

	public boolean isVisibleListeEffortStandard2(WebDriver driver) {

		listeEffortStandard2 = driver.findElement(By.id(findElementByIdDynamique(id_listeEffortStandard2)));

		return listeEffortStandard2.isDisplayed();
	}

	public boolean isVisibleEffortSupp(WebDriver driver) {

		effortSupp = driver.findElement(By.id(findElementByIdDynamique(id_effortSupp)));

		return effortSupp.isDisplayed();
	}

	public boolean isVisibleListeEffortSupp1(WebDriver driver) {

		listeEffortSupp1 = driver.findElement(By.id(findElementByIdDynamique(id_listeEffortSupp1)));

		return listeEffortSupp1.isDisplayed();
	}

	public boolean isVisibleListeEffortSupp2(WebDriver driver) {

		listeEffortSupp2 = driver.findElement(By.id(findElementByIdDynamique(id_listeEffortSupp2)));

		return listeEffortSupp2.isDisplayed();
	}

	public boolean isVisibleCheckBox2(WebDriver driver) {

		checkBox2 = driver.findElement(By.id(findElementByIdDynamique(id_checkBox2)));

		return checkBox2.isDisplayed();
	}

	public boolean isVisibleInfiniment(WebDriver driver) {

		infiniment = driver.findElement(By.id(findElementByIdDynamique(id_infiniment)));

		return infiniment.isDisplayed();
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

	public boolean isVisibleCadreRougeEST1(WebDriver driver) {

		cadreRougeEST1 = driver.findElement(By.id(findElementByIdDynamique(id_cadreRougeEST1)));

		return cadreRougeEST1.isDisplayed();
	}

	public boolean isVisibleFlecheEST1(WebDriver driver) {

		flecheEST1 = driver.findElement(By.id(findElementByIdDynamique(id_flecheEST1)));

		return flecheEST1.isDisplayed();
	}

	public boolean isVisibleCroixEST1(WebDriver driver) {

		croixEST1 = driver.findElement(By.id(findElementByIdDynamique(id_croixEST1)));

		return croixEST1.isDisplayed();
	}

	public boolean isVisibleCadreRougeEST2(WebDriver driver) {

		cadreRougeEST2 = driver.findElement(By.id(findElementByIdDynamique(id_cadreRougeEST2)));

		return cadreRougeEST2.isDisplayed();
	}

	public boolean isVisibleFlecheEST2(WebDriver driver) {

		flecheEST2 = driver.findElement(By.id(findElementByIdDynamique(id_flecheEST2)));

		return flecheEST2.isDisplayed();
	}

	public boolean isVisibleCroixEST2(WebDriver driver) {

		croixEST2 = driver.findElement(By.id(findElementByIdDynamique(id_croixEST2)));

		return croixEST2.isDisplayed();
	}

	public boolean isVisibleCadreRougeESU1(WebDriver driver) {

		cadreRougeESU1 = driver.findElement(By.id(findElementByIdDynamique(id_cadreRougeESU1)));

		return cadreRougeESU1.isDisplayed();
	}

	public boolean isVisibleFlecheESU1(WebDriver driver) {

		flecheESU1 = driver.findElement(By.id(findElementByIdDynamique(id_flecheESU1)));

		return flecheESU1.isDisplayed();
	}

	public boolean isVisibleCroixESU1(WebDriver driver) {

		croixESU1 = driver.findElement(By.id(findElementByIdDynamique(id_croixESU1)));

		return croixESU1.isDisplayed();
	}

	public boolean isVisibleCadreRougeESU2(WebDriver driver) {

		cadreRougeESU2 = driver.findElement(By.id(findElementByIdDynamique(id_cadreRougeESU2)));

		return cadreRougeESU2.isDisplayed();
	}

	public boolean isVisibleFlecheESU2(WebDriver driver) {

		flecheESU2 = driver.findElement(By.id(findElementByIdDynamique(id_flecheESU2)));

		return flecheESU2.isDisplayed();
	}

	public boolean isVisibleCroixESU2(WebDriver driver) {

		croixESU2 = driver.findElement(By.id(findElementByIdDynamique(id_croixESU2)));

		return croixESU2.isDisplayed();
	}
}
