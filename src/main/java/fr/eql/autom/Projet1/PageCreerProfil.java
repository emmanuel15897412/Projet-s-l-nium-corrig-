package fr.eql.autom.Projet1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import fr.eql.autom.Outils.Outils;

public class PageCreerProfil extends PageObject_bandeau {

	@FindBy(xpath = "//*/ul[@class='z-tabs-cnt']/descendant::span")
	private WebElement ongletProfil;

	@FindBy(xpath = "//td[.='Enregistrer']")
	private WebElement btnEnregistrer;

	@FindBy(xpath = "//td[.='Sauver et continuer']")
	private WebElement btnSauver;

	@FindBy(xpath = "")
	private WebElement btnAjouterRole;

	private WebDriverWait wait;

	private WebElement nom;
	private String nomTxt;

	public String getOngletProfilTxt() {
		return ongletProfil.getText();
	}

	public String isNomVide(WebDriver driver) {
		WebElement weNom = driver.findElement(By.id(findElementByIdDynamique("n1xPa5")));
		return weNom.getText();
	}

	public boolean testPresenceFieldSet(WebDriver driver) {
		boolean bool = false;
		WebElement fieldset = driver.findElement(By.id(findElementByIdDynamique("vQvPb5")));
		//System.out.println("fieldset = " + fieldset.getText());
		WebElement tableauCombo = fieldset.findElement(By.id(findElementByIdDynamique("vQvPd5")));
		WebElement tableauComboResultat = fieldset.findElement(By.id(findElementByIdDynamique("vQvPg5")));
		if (tableauCombo.isDisplayed() && tableauComboResultat.isDisplayed()) {
			bool = true;
			System.out.println("OK");
		}
		return bool;
	}

	public boolean testPresenceEnregisterSauver(WebDriver driver) {
		boolean bool = false;
		if (btnEnregistrer.isDisplayed() && btnSauver.isDisplayed()) {
			bool = true;
		}
		return bool;
	}

	public void creerProfil(WebDriver driver, String comboValue, int caseCombo) {
		/**
		 * remplir Nom
		 */
		nom = driver.findElement(By.id(findElementByIdDynamique("vQvPa5")));
		Outils.remplir_un_champ(nom, "Role_test");
		nomTxt = "Role_test";

		// cOMBO
		// WebElement combo =
		// driver.findElement(By.id(findElementByIdDynamique("sF8Pe5-cave")));
		// Select selectionRole = new Select(combo);
		// selectionRole.selectByValue(comboValue);

		WebElement btnFlecheCombo = driver.findElement(By.id(findElementByIdDynamique("zWGPe5-btn")));
		btnFlecheCombo.click();

		//
		WebElement weResultatCombo = driver.findElement(By.id(findElementByIdDynamique("zWGPe5-cave")));
		WebElement weProfil = Outils.itererTableau(weResultatCombo, "*/tr", caseCombo);
	//	System.out.println("weProfil " + weProfil.getText());
		weProfil.click();

		WebElement btnAjouterRole = driver.findElement(By.id(findElementByIdDynamique("tJyPf5-chdex")));
		btnAjouterRole.click();

	}

	public boolean testPresenceProfilCree(WebDriver driver, String idWebELementMere) {

		WebElement ajoutRoleTr;
		try {
			ajoutRoleTr = driver.findElement(By.id(findElementByIdDynamique(idWebELementMere)));
		} catch (Exception e) {
			return false;
		}
		String xpathPerso = "td";
		WebElement nomRolePRofil = Outils.itererTableau(ajoutRoleTr, xpathPerso, 0);
		WebElement nomRolePoubelle = Outils.itererTableau(ajoutRoleTr, xpathPerso, 1);
		WebElement poubelle = nomRolePoubelle
				.findElement(By.xpath("descendant::img[@src='/libreplan/common/img/ico_borrar1.png']"));
		boolean isPoubelle = poubelle.isDisplayed();
	//	System.out.println("Profils ? " + nomRolePRofil.getText());
		boolean isNomRoleProfil = nomRolePRofil.isDisplayed();

		if (isPoubelle && isNomRoleProfil) {
			return true;
		} else {
			return false;
		}
	}

	public boolean testPresenceProfilCree2(WebDriver driver) {

		WebElement profilNew = driver.findElement(By.xpath(
				"//div[@id='" + findElementByIdDynamique("fMAQy4") + "']/descendant::tr[@class='z-row'][2]"));
		boolean isprofilNew = profilNew.isDisplayed();

		return isprofilNew;
	}

	public boolean testMouseHoverPoubelle(WebDriver driver) {
		// todo -> id dynamique
		// //div[@id='"+findElementByIdDynamique("yNxPg5-body")+
		// "']/table/tbody/tr[@class[contains(.,'z-row')]]/..
		WebElement ajoutRoleTr = driver.findElement(By.id(findElementByIdDynamique("k7xPg5-body")));
		// String xpathPerso = "td";
		// WebElement caseAction = Outils.itererTableau(ajoutRoleTr, xpathPerso, 1);
		WebElement poubelle = ajoutRoleTr
				.findElement(By.xpath("descendant::img[@src='/libreplan/common/img/ico_borrar1.png']"));
		Actions a = new Actions(driver);
		a.moveToElement(poubelle).build().perform();
		WebElement poubelle2 = ajoutRoleTr
				.findElement(By.xpath("descendant::img[@src='/libreplan/common/img/ico_borrar.png']"));
		return poubelle2.isDisplayed();

	}

	public String testListeRoleAssoc(WebDriver driver, int numeroLigne) {
		wait = new WebDriverWait(driver, 10);

		wait.until(
				ExpectedConditions.invisibilityOf(driver.findElement(By.id(findElementByIdDynamique("xBiUe5-cave")))));
		try {
			// todo -> id dynamique
			String xpath = "//div[@id='" + findElementByIdDynamique("yNxPg5-body")
					+ "']/table/tbody/tr[@class[contains(.,'z-row')]]/..";
			//System.out.println("xpath = " + xpath);
			WebElement webElem = driver.findElement(By.xpath(xpath));

		//	System.out.println("WebElement yNxPg5-body " + webElem.getText());

			WebElement ligne = Outils.itererTableau(webElem, "tr", numeroLigne);
			if (ligne != null) {
				WebElement cellule = Outils.itererTableau(ligne, "td", 0);
			//	System.out.println("cellule " + cellule.getText());
				return cellule.getText();
			} else {
				return "vide";
			}
		}
		// catch (org.openqa.selenium.NoSuchElementException ex) {
		catch (Exception ex) {
			return "WebElement non trouvé";
		}
	}

	public boolean testEnum(String profilATest, String[] tableau) {
		boolean bool = false;
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i].equalsIgnoreCase(profilATest)) {
				bool = true;
			//	System.out.println("trouvé");
				break;
			} else
				bool = false;
		}
		return bool;
	}

	public void clickPoubelle(WebDriver driver) {
		WebElement spanIdDynamique = driver.findElement(By.xpath("//td/div/span[@title='Supprimer']"));
		spanIdDynamique.click();
	}

	public Page_profil clickEnregister(WebDriver driver) {
		btnEnregistrer = driver.findElement(By.id(findElementByIdDynamique("z08Pk5-box")));
		btnEnregistrer.click();
		return PageFactory.initElements(driver, Page_profil.class);
	}

	public String getNomTxt() {
		return nomTxt;
	}

	public void changementNomProfil(WebDriver driver, String profil_modifie) {
		WebElement profilNew = driver
				.findElement(By.xpath("//div[@id='" + findElementByIdDynamique("mMDPy4") + "']/descendant::tr[@class='z-row'][1]/td[2]/descendant::input"));
		Outils.remplir_un_champ(profilNew,profil_modifie);
		WebElement profilModififie = driver
				.findElement(By.xpath("//div[@id='" + findElementByIdDynamique("mMDPy4") + "']/descendant::tr[@class='z-row'][1]/td[2]/descendant::input"));
		WebElement enregister = driver
				.findElement(By.xpath("//div[@id='" + findElementByIdDynamique("mMDPy4") + "']/descendant::tr[@class='z-row'][1]/td[2]/descendant::input"));
		
	}

}
