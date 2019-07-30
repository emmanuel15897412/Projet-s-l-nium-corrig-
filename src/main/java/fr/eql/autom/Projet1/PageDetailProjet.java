package fr.eql.autom.Projet1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageDetailProjet extends PageObject_bandeau {

	
	
	@FindBy(xpath = "//td[@class='z-button-cm'][contains(.,'Détail du projet')]") WebElement menu_detailProjet;
	@FindBy(xpath = "//span[@class='z-tab-text'][contains(.,'WBS (tâches)')]") WebElement onglet_WBSTaches;
	
	@FindBy(xpath = "//td[@class=\\\"z-button-cm\\\"][contains(.,'Chargement des ressources')]") WebElement menu_ressources;
	@FindBy(xpath = "//td[@class=\\\"z-button-cm\\\"][contains(.,'Allocation avancée')]") WebElement menu_allocation;
	@FindBy(xpath = "//td[@class=\\\"z-button-cm\\\"][contains(.,'Tableau de bord')]") WebElement menu_tableauBord;
	
	@FindBy(xpath = "//img[@src='/libreplan/common/img/ico_save.png']") WebElement buton_save;
	@FindBy(xpath = "//img[@src='/libreplan/common/img/ico_back.png']") WebElement buton_back;
	
	@FindBy(xpath = "//span[@title='Enregistrer le projet']") WebElement buble_save;
	@FindBy(xpath = "//span[@title='Annuler l'édition']") WebElement buble_back;
	
	
	
	
	
	public boolean PresenceOngletaches() {
		return onglet_WBSTaches.isDisplayed();
	}
	
	public boolean PresenceMenuDetailProjet() {
		return menu_detailProjet.isDisplayed();
	}
	
	public boolean testPresenceSaveButon() {
		return buton_save.isDisplayed();
	}
	
	public boolean testPresenceBackButon() {
		return buton_back.isDisplayed();
	}
	
	public boolean testPresenceBubleSave() {
		return buble_save.isDisplayed();
	}
	
	public boolean testPresenceBubleBack() {
		return buble_back.isDisplayed();
	}
	
	public PageConfirmationAnnulation clickOnBackButon(WebDriver driver) throws InterruptedException {
		buton_back.click();
		return PageFactory.initElements(driver, PageConfirmationAnnulation.class);
	}
}
