package fr.eql.autom.Projet1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;

public class Page_creation_machine extends PageObject_bandeau{
	
	private @FindBy(xpath = "//td[.='Sauver et continuer']") WebElement bouton_sauver;



	public boolean verifTableauDonneMachine(WebDriver driver){
		List<WebElement> ligneTr = driver.findElements(By.xpath("//div[@id='"+findElementByIdDynamique("aDuPy5")+"']/descendant::tbody[@class='z-rows'][1]/tr/td"));
		String code = ligneTr.get(0).getText();
		WebElement machine001 = ligneTr.get(1);
		boolean bool = machine001.findElement(By.xpath("descendant::input[@disabled]")).isDisplayed();
		String nom = ligneTr.get(2).getText();
		WebElement nomInput = ligneTr.get(3);
		String description = ligneTr.get(4).getText();
		WebElement descriptionInput = ligneTr.get(5);
		String type = ligneTr.get(6).getText();
		WebElement typeCombo = ligneTr.get(7);
		
		System.out.println("machine001 "+bool);
		return bool;
	}
	
	public void remplirTableauDonneMachine(WebDriver driver){
		List<WebElement> ligneTr = driver.findElements(By.xpath("//div[@id='"+findElementByIdDynamique("aDuPy5")+"']/descendant::tbody[@class='z-rows'][1]/tr/td"));
		WebElement machine001 = ligneTr.get(1);
		WebElement nomInput = ligneTr.get(3).findElement(By.xpath("div/input"));
		Outils.remplir_un_champ(nomInput, "MACHINETEST1");
		WebElement descriptionInput = ligneTr.get(5).findElement(By.xpath("div/input"));
		Outils.remplir_un_champ(descriptionInput, "MACHINETEST1");

		WebElement cb = driver.findElement(By.xpath("//input[@id='"+findElementByIdDynamique("jFFQh6-real")+"']"));
		cb.click();
		bouton_sauver.click();
	    
	}
	
	public boolean testerModifMachine(WebDriver driver){

		WebElement titreModif = driver.findElement(By.xpath("//span[.='Machine \"MACHINETEST1\" enregistré']"));
		return true;
	    
	}
	public void clickAnnuler(WebDriver driver) {
		WebElement bouton_annuler = driver.findElement(By.xpath("//table[@id='"+findElementByIdDynamique("fJDPld-box")+"']/descendant::td[.='Annuler']"));
		 bouton_annuler.click();
	}
	
}
