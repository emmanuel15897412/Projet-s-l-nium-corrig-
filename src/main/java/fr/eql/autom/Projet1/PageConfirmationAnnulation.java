package fr.eql.autom.Projet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageConfirmationAnnulation extends PageObject_bandeau{

	
	@FindBy(xpath = "//div[contains(text(),'Confirmer la fenêtre de sortie')]") WebElement titre;
	@FindBy(xpath = "//span[contains(.,'Les modifications non enregistrées seront perdues. Êtes-vous sûr ?')]") WebElement message_confirmation;
	@FindBy(xpath = "//td[@class='z-button-cm'][contains(.,'OK')]") WebElement buton_OK;
	//@FindBy(xpath = "//table[@id='bBwDf5-box']/tbody/tr/td[contains(.,'Annuler')]") WebElement buton_annuler;
	////table[@id='vK7Qs6-box']/tbody/tr[2]/td[2][contains(text(),'Annuler')]
	@FindBy(xpath = "//div[@class='z-window-modal-icon z-window-modal-close']") WebElement croix;
	
	
	
	public String message_titre() {
		return titre.getText();
	}
	
	public String message_confirmation() {
		return message_confirmation.getText();
	}
	public boolean PresenceButonOK() {
		return buton_OK.isDisplayed();
	}
	/*public boolean PresenceButonAnnuler() {
		return buton_annuler.isDisplayed();
	}*/
	public PageDetailProjet clickOnX (WebDriver driver) {
		croix.click();
		return PageFactory.initElements(driver, PageDetailProjet.class);
	}
	public PageAccueil clickOnOK (WebDriver driver) {
		buton_OK.click();
		return PageFactory.initElements(driver, PageAccueil.class);
	}
	
	
}

