package fr.eql.autom.Projet1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_profil extends PageObject_bandeau {

	@FindBy(xpath = "//tbody/tr/th/div[contains(.,'Nom de profil')]")
	WebElement nom;

	@FindBy(xpath = "//tbody[@id='zY6Tp4']/tr")
	String idTitreTableau = "rAdXn4-cave";

	@FindBy(xpath = "//*/td[.='Créer']")
	WebElement btnCreer;

	WebElement txtEncart;

	public void getTitreTableau(WebDriver driver) {
		WebElement titreTab = driver.findElement(By.id(findElementByIdDynamique(idTitreTableau)));
		System.out.println("titre tableau =" + titreTab.getText());

		List<WebElement> tableau = driver
				.findElements(By.xpath("//tbody[@id='" + findElementByIdDynamique("zY6Tp4") + "']/tr"));
		for (WebElement webElement : tableau) {
			System.out.println("tab" + webElement.getText());
			WebElement image = webElement.findElement(By.xpath("//img[@src='/libreplan/common/img/ico_editar1.png']"));
			System.out.println("True? " + image.isDisplayed());
		}
	}

	public String getCreerBoutonTxt() {
		return btnCreer.getText();
	}

	public PageCreerProfil clickCreerBouton(WebDriver driver) {
		btnCreer.click();
		return PageFactory.initElements(driver, PageCreerProfil.class);
	}

	public String testTxtEncart(WebDriver driver) {
		txtEncart = driver.findElement(By.id(findElementByIdDynamique("yIyVu4")));
		return txtEncart.getText().replace("Profil", "").replace("enregistré", "").replace('"',' ').trim();
	}

	public String testCouleurEncart(WebDriver driver) {		
		return Color.fromString(txtEncart.getCssValue("background-color")).asHex();
	}
	
	public String testCouleurEncart2(WebDriver driver) {	
		WebElement txtEncart = driver.findElement(By.id(findElementByIdDynamique("wR8Qq7")));
		return Color.fromString(txtEncart.getCssValue("background-color")).asHex();
	}

	public String supprimerProfil(WebDriver driver, String idASup) {
		WebElement webElementRoleCustom = driver.findElement(By.xpath("//tr/descendant::span[.='" + idASup + "']"));
		//click sur la poubelle de webElementRoleCustom
		WebElement wePoubelle = webElementRoleCustom.findElement(By.xpath("/../../following-sibling::td/descendant::span[@title='Supprimer']"));
		wePoubelle.click();
		return "";
	}
	
	public PageCreerProfil modifierProfil(WebDriver driver, String idASup) {
		//WebElement webElementRoleCustom = driver.findElement(By.xpath("//tr/descendant::span[.='" + idASup + "']"));
		//click sur la poubelle de webElementRoleCustom
		WebElement weModif = driver.findElement(By.xpath("//tr/descendant::span[.='" + idASup + "']/../../following-sibling::td/descendant::img[@src='/libreplan/common/img/ico_editar1.png']"));
		weModif.click();
		 return PageFactory.initElements(driver, PageCreerProfil.class);
	}

	public int testProfilModifie(WebDriver driver, String profil_modifie) {
		List<WebElement> weModiftab = driver.findElements(By.xpath("//span[contains(.,'"+profil_modifie+"')]"));

		return weModiftab.size();
	}


}
