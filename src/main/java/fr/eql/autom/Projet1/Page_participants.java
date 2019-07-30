package fr.eql.autom.Projet1;

import java.sql.Driver;
import java.util.List;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;

public class Page_participants extends PageObject_bandeau{
 @FindBy (xpath = "//div[contains(text(), 'Liste des participants')] ")
 private WebElement titre_page_participants;
 
 @FindBy (xpath = "//span[contains(text(), 'Filtré par')]")
 private WebElement titre_champ_de_recherche;
 
 @FindBy (xpath = "//span[contains(text(),'Détails personnels')]")
 private WebElement titre_champ_détail;
 
 @FindBy (xpath = "//td[contains(text(),\"Plus d'options\")] ")
 private WebElement bouton_bleu;
 
 @FindBy (xpath = "//td[contains(text(),\"Créer\")] ")
 private WebElement bouton_Creer;
 
 @FindBy (xpath = "//td[contains(text(),'Filtre')]")
 private WebElement bouton_Filtrer;
 
 @FindBy (xpath = "//span[.='Participant enregistré']")
 private WebElement Message_confirmation_enregistrement;
 
 @FindBy (xpath = "//input[@class='z-textbox'][@style='width:200px;']")
 private WebElement champ_details_personnels;

 @FindBy (xpath = "//span[@title='Appliquer le filtrage aux ressources satisfaisant le critère demandé']")
 private WebElement bouton_filtre;
 
 
 String id_loupe = "lTFMq4-btn";
 
 String id_col6 = "vXgYx5-cave";
 
 String id_champ_recherche = "lTFMq4-real";
 
 String id_champ_details_personnels = "p0GMd5";
 
 String id_utilisateur = "v6EQq9";
 
 String id_bouton_plus_option = "dT2Qf5-cnt";
 
 
 
 public String verifier_titre_participant() {
	 return titre_page_participants.getText();
	 
 }
 
 public boolean colonnes_tableau(WebDriver driver) {
	 WebElement we1 = driver.findElement(By.xpath("//div[contains(text(), 'Surnom')]"));
	 WebElement we2 = driver.findElement(By.xpath("//div[contains(text(), 'Prénom')]"));
	 WebElement we3 = driver.findElement(By.xpath("//div[contains(text(), 'ID')]"));
	 WebElement we4 = driver.findElement(By.xpath("//div[@class='z-column-cnt'][contains(text(), 'Code')]"));
	 WebElement we5 = driver.findElement(By.xpath("//div[contains(text(), 'En file')]"));
	 WebElement we6 = driver.findElement(By.id(findElementByIdDynamique(id_col6)));
	 
	 boolean c1 = we1.isDisplayed();
	 boolean c2 = we2.isDisplayed();
	 boolean c3 = we3.isDisplayed();
	 boolean c4 = we4.isDisplayed();
	 boolean c5 = we5.isDisplayed();
	 boolean c6 = we6.isDisplayed();
	 
	 if (c1 && c2 && c3 && c4 && c5 && c6) {
	 System.out.println("Les colonnes sont présentes");
	 return true;
	 }
	 else {
	 System.out.println("Erreur sur les colonnes");
     return false;
 }
	 
 } 
 
 public String verifier_titre_1(WebDriver driver) {
	 WebElement we1 = driver.findElement(By.xpath("//div[contains(text(), 'Surnom')]"));
	 return we1.getText();
	 
 }
 
 public  String verifier_titre_2(WebDriver driver) {
	 WebElement we2 = driver.findElement(By.xpath("//div[contains(text(), 'Prénom')]"));
	 return we2.getText();
 }
 
 public String verifier_titre_3(WebDriver driver) {
	 WebElement we3 = driver.findElement(By.xpath("//div[contains(text(), 'ID')]"));
	 return we3.getText();
 }
  
 public String verifier_titre_4(WebDriver driver) {
	 WebElement we4 = driver.findElement(By.xpath("//div[contains(text(), 'Code')]"));
	 return we4.getText();
 }
 
 public String verifier_titre_5(WebDriver driver) {
	 WebElement we5 = driver.findElement(By.xpath("//div[contains(text(), 'En file')]"));
	 return we5.getText();
 }
 
 public String verifier_titre_6(WebDriver driver) {
	 WebElement we6 = driver.findElement(By.id(findElementByIdDynamique("aXFMx5-cave")));
	 return we6.getText();
 }
 public String verifier_titre_champ_recherche() {
	 return titre_champ_de_recherche.getText();
	 
 }
 public boolean verifier_presence_champ(WebDriver driver) {
	 WebElement champ_recherche = driver.findElement(By.xpath("//input[@style = 'width: 266px;']"));
	 return champ_recherche.isDisplayed();
	 
 }
 public boolean verifier_loupe(WebDriver driver) {
	 WebElement loupe = driver.findElement(By.id(findElementByIdDynamique(id_loupe)));
	 return loupe.isDisplayed();
 }
 
 public String verifier_titre_champ_detail_personnel() {
	 return titre_champ_détail.getText();
 }
 public boolean verifier_champ_details_personnels(WebDriver driver) {
	  WebElement champ_details_personnels = driver.findElement(By.id(findElementByIdDynamique(id_champ_details_personnels)));
	  return champ_details_personnels.isDisplayed();
 }
 
public String verifier_nom_bouton_options() {
	return bouton_bleu.getText();
}
 
 public boolean verifier_bouton_options() {
	return bouton_bleu.isDisplayed();
	
 }
 
public String verifier_nom_bouton_filtre() {
	return bouton_Filtrer.getText();
}
 
 public boolean verifier_bouton_filtre() {
	return  bouton_Filtrer.isDisplayed();
	 
	 
 }
 
 public String verifier_nom_bouton_creer() {
	 return bouton_Creer.getText();
 }
  public boolean verifier_bouton_creer() {
	 return  bouton_Creer.isDisplayed();
	  
  }
  
  public Page_creation_participant cliquer_sur_créer(WebDriver driver) {
	  bouton_Creer.click();
	  return PageFactory.initElements(driver, Page_creation_participant.class);
	   
  }
  
  public void verifier_message() {
	    Message_confirmation_enregistrement.isDisplayed();	
	    System.out.println(Message_confirmation_enregistrement.getText());
	}
  
  public boolean verifier_utilisateur(WebDriver driver) {
	  boolean isOk = false;
      boolean isGood = false;
	  List<WebElement> liste_données_utilisateur = driver.findElements(By.xpath("//tr[@id='"+findElementByIdDynamique("gD6Qq9")+"']/td"));

		 liste_données_utilisateur.get(0).getText();
		 liste_données_utilisateur.get(1).getText();
		 liste_données_utilisateur.get(2).getText();
		liste_données_utilisateur.get(3).getText();
		  
		 if(liste_données_utilisateur.get(0).getText().equals("DU")
				 && liste_données_utilisateur.get(1).getText().equals("Jean")
				 && liste_données_utilisateur.get(2).getText().equals("JDU")
				 && liste_données_utilisateur.get(3).getText().equals("WORKER0116")
				 ) {
			 isOk = true;
		 }
		 if(liste_données_utilisateur.get(0).isDisplayed() 
				 && liste_données_utilisateur.get(1).isDisplayed() 
				 && liste_données_utilisateur.get(2).isDisplayed()
				 && liste_données_utilisateur.get(3).isDisplayed()) {
			 isGood = true;
	  }
         if(isOk && isGood) {
        	return true;
         }
         else {
         return false;
}
  }
  public void remplir_champ_details_personnels () {
	 
	  Outils.remplir_un_champ(champ_details_personnels, "Jean");
	  
  }
  public void cliquer_sur_filtre (WebDriver driver) {
	  bouton_Filtrer.click();

  }
  public boolean verifier_utilisateur_filtre(WebDriver driver) throws InterruptedException {
	  boolean isOk = false;
	  Thread.currentThread().sleep(2000);
	  List <WebElement> liste_données_jean_du = driver.findElements(By.xpath("//tr[@class='clickable-rows z-row']/td"));
	     liste_données_jean_du.get(0).getText();
		 liste_données_jean_du.get(1).getText();
		 if ( liste_données_jean_du.get(0).isDisplayed() &&  liste_données_jean_du.get(1).isDisplayed()) {
			 isOk = true;
		 }
		 if(isOk) {
			 return true;
		 }
		 else {
			 return false;
		 }
  }
   public void cliquer_sur_plus_d_options (WebDriver driver) {
	   WebElement bouton_plus_d_options = driver.findElement(By.id(findElementByIdDynamique(id_bouton_plus_option)));
	   bouton_plus_d_options.click();
   }
   public void cliquer_sur_icone_suivante_tableau (WebDriver driver) {
	   List <WebElement> liste_boutons_tableau_participants = driver.findElements(By.xpath("//em/button[@class='z-paging-next']"));
	   liste_boutons_tableau_participants.get(0).click();
   }
   public void cliquer_sur_icone_precedente_tableau (WebDriver driver) throws InterruptedException {
	   WebElement boutons_tableau_participants_2 = driver.findElement(By.xpath("//table[contains(@id,'q5-prev')]/tbody/tr/td[2]"));
	   Thread.currentThread().sleep(1000);
	   boutons_tableau_participants_2.click();
	 /*  
	   try {
		   Actions a = new Actions(driver);
			  a.moveToElement(liste_boutons_tableau_participants_2.get(0));
	   liste_boutons_tableau_participants_2.get(0).click();
	   }
	   catch (Exception e) {
		   liste_boutons_tableau_participants_2.get(0).click(); 
	   }*/
   }

   public void cliquer_sur_icone_retourInitial_tableau (WebDriver driver) throws InterruptedException {
	    Thread.currentThread();
		Thread.sleep(2000);
	   List <WebElement> liste_boutons_tableau_participants_3 = driver.findElements(By.xpath("//em/button[@class='z-paging-first']"));
	   liste_boutons_tableau_participants_3.get(0).click();
}
   
   public void cliquer_sur_icone_retourFinal_tableau (WebDriver driver) throws InterruptedException {
	    Thread.currentThread();
		Thread.sleep(2000);
	   List <WebElement> liste_boutons_tableau_participants_4 = driver.findElements(By.xpath("//em/button[@class='z-paging-last']"));
	   liste_boutons_tableau_participants_4.get(0).click();
}
   public  void verifier_champ_calendrier(WebDriver driver) {
	  WebElement calendrier = (WebElement) driver.findElements(By.xpath("//i[@id='"
				+findElementByIdDynamique("i85Qi5-btn") + "']"));
	 calendrier.getAttribute("class");
   }
}
	 
 
 

