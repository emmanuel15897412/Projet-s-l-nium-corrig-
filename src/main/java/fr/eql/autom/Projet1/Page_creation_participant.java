package fr.eql.autom.Projet1;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;

public class Page_creation_participant extends PageObject_bandeau {
	

	private @FindBy(xpath = "//td[@class = 'z-caption-l'][contains(text(),'Créer Participant')]") WebElement Titre_page;

	private @FindBy(xpath = "//li[@class = 'z-tab z-tab-seld']/descendant::span[contains(text(), 'Données personnelles')]") WebElement onglet_données_personnelles;

	private @FindBy(xpath = "//li[@class = 'z-tab z-tab-seld']/descendant::span[contains(text(), 'Calendrier')]") WebElement onglet_Calendrier;

	private @FindBy(xpath = "//span[contains(text(), 'Données de base')]/ancestor::legend/ancestor::fieldset ") WebElement onglet_données_de_base;

	private @FindBy(xpath = "//label[@for = 't3EPl6-real']") WebElement intitulé_case_coche;

	private @FindBy(xpath = "//option[@selected = \"selected\"][contains(text(), \"Ressource normale\")]") WebElement valeur_menu_type;

	private @FindBy(xpath = "//label[contains(text(), \"Non lié\")]") WebElement intitulé_bouton_NonLié;

	private @FindBy(xpath = "//label[contains(text(), \"Utilisateur existant\")]") WebElement intitulé_bouton_utilisateur_existant;

	private @FindBy(xpath = "//label[contains(text(), \"Créer un nouvel utilisateur\")]") WebElement intitulé_bouton_nouvel_utilisateur;

	private @FindBy(xpath = "//td[ .='Enregistrer'] ") WebElement bouton_enregistrer;

	private @FindBy(xpath = "//td[ .='Sauver et continuer'] ") WebElement bouton_sauver_et_enregistrer;

	private @FindBy(xpath = "//span[@id = 'pUEQve']/table/tbody/tr/td[.='Annuler']") WebElement bouton_annuler;
	
	private @FindBy(xpath = "//span[contains(@id,'kf')]/input") WebElement bouton_nouvel_utilisateur;
	private @FindBy(xpath = "//td[.='Créer Participant']") WebElement titreCreerParticipant;
	
	
	

	String id_données_de_base = "t3EPb6-cnt";
	String id_utilisateur_lié = "eMEP67-cnt";
	String id_code = "gGMQi6";
	String id_prénom = "gGMQn6";
	String  id_Nom = "gGMQt6";
	String id_ID = "gGMQw6";
	String id_Type = "gGMQ_7";
    String id_éléments_données_de_base = "t3EPa6-cave";
    String id_champ_code = "t3EPk6";
    String id_case_code = "t3EPl6-real";
    String id_champ_prenom = "s4FPo6";
    String id_champ_nom = "s4FPu6";
    String id_champ_ID = "s4FPx6";
    String id_menu_type = "s4FP17";

    
    public boolean Verification_titre_page(WebDriver driver) throws InterruptedException {
    	Thread.currentThread().sleep(1000);;
	//WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return titreCreerParticipant.isDisplayed();
	 

}	
public boolean titre_onglet_par_default() {
	
	return onglet_données_personnelles.isDisplayed();
}

public boolean selection_onglet_par_default() {
	
	return onglet_données_personnelles.isDisplayed();
}

 public String données_de_base(WebDriver driver) {
	 WebElement texte_données_de_base = driver.findElement(By.id(findElementByIdDynamique(id_données_de_base)));
	 return texte_données_de_base.getText();
 }
 public String Utilisateur_lié(WebDriver driver) {
	 WebElement texte_utilisateur_lié = driver.findElement(By.id(findElementByIdDynamique(id_utilisateur_lié)));
	 return texte_utilisateur_lié.getText();
 }
 public void intitules_elements_donnees_de_base (WebDriver driver) {
	WebElement onglet_données_de_base = driver.findElement(By.id(findElementByIdDynamique(id_éléments_données_de_base)));
	List <WebElement> liste_données_de_base_1 = driver.findElements(By.xpath("//tr[@id='"
			+findElementByIdDynamique("cHxPh6") + "']/td"));
	List <WebElement> liste_données_de_base_2 = driver.findElements(By.xpath("//tr[@id='"
			+findElementByIdDynamique("t3EPm6") + "']/td"));
	List <WebElement> liste_données_de_base_3 = driver.findElements(By.xpath("//tr[@id='"
			+findElementByIdDynamique("t3EPs6") + "']/td"));
	List <WebElement> liste_données_de_base_4 = driver.findElements(By.xpath("//tr[@id='"
			+findElementByIdDynamique("t3EPv6") + "']/td"));
	List <WebElement> liste_données_de_base_5 = driver.findElements(By.xpath("//tr[@id='"
			+findElementByIdDynamique("t3EPy6") + "']/td"));
	
//	for (WebElement li: liste_données_de_base_1) {
//	System.out.println(li.getText());
//	}
	System.out.println("ici : " +liste_données_de_base_1.get(0).getText());
	System.out.println("ici : " +liste_données_de_base_2.get(0).getText());
	System.out.println("ici : " +liste_données_de_base_3.get(0).getText());
	System.out.println("ici : " +liste_données_de_base_4.get(0).getText());
	System.out.println("ici : " +liste_données_de_base_5.get(0).getText());
	
 }
 
 //public void verifier_intitulé_case_coche(WebDriver driver) {
	 //intitulé_case_coche.getText();
	 //System.out.println("La case s'intitule "+ intitulé_case_coche.getText());
 //}
 public void verifier_case_code_coche(WebDriver driver) {
	 WebElement case_code = driver.findElement(By.id(findElementByIdDynamique(id_case_code)));
	 assertTrue(case_code.isSelected());
	 System.out.println("La case est cochée");
 }
 
 
 
 public boolean champ_code(WebDriver driver) {
	 WebElement champ_code = driver.findElement(By.xpath("//input[@id='"+findElementByIdDynamique("t3EPk6")+"'][@disabled = '']"));
	return champ_code.isDisplayed();
 }
 //public void intitulés_elements(WebDriver driver) {
	 //WebElement Code = driver.findElement(By.id(findElementByIdDynamique(id_code)));
	// WebElement Prénom = driver.findElement(By.id(findElementByIdDynamique(id_prénom)));
	// WebElement Nom = driver.findElement(By.id(findElementByIdDynamique(id_Nom)));
	// WebElement ID = driver.findElement(By.id(findElementByIdDynamique(id_ID)));
	 //WebElement Type = driver.findElement(By.id(findElementByIdDynamique(id_Type)));
	 
	 //assertEquals("Code", Code.getText());
	// assertEquals("Prénom", Prénom.getText());
	// assertEquals("Nom", Nom.getText());
	// assertEquals("ID", ID.getText());
	// assertEquals("Type", Type.getText());
 //}
 public boolean champs_vide(WebDriver driver) {
	 WebElement champ_prenom = driver.findElement(By.id(findElementByIdDynamique(id_champ_prenom))); 
	 WebElement champ_nom = driver.findElement(By.id(findElementByIdDynamique(id_champ_nom)));
	 WebElement champ_ID = driver.findElement(By.id(findElementByIdDynamique(id_champ_ID)));
	 String texte_champ_prenom = champ_prenom.getText();
	 //assertTrue(texte_champ_prenom.isEmpty());
	
	 System.out.println("Le champ Prénom est vide");
	 String texte_champ_nom = champ_nom.getText();
	 //assertTrue(texte_champ_nom.isEmpty());
	 System.out.println("Le champ Nom est vide");
	 String texte_champ_ID = champ_ID.getText();
	// assertTrue(texte_champ_ID.isEmpty());
	 System.out.println("Le champ ID est vide");
	 
	 if (texte_champ_prenom.isEmpty() && texte_champ_nom.isEmpty() && texte_champ_ID.isEmpty() ) {
		 return true;
	 } else {
		 return false;
	 }
 }
 public void champ_type(WebDriver driver) {
	assertTrue(valeur_menu_type.isDisplayed());
	System.out.println(valeur_menu_type.getText()+" est sélectionné par défault");
 }
 public void bouton(WebDriver driver) throws InterruptedException {
	 
	 WebElement bouton_Non_Lié = driver.findElement(By.xpath("//span[contains(@class,'z-radio')][1]"));
	 WebElement bouton_utilisateur_existant = driver.findElement(By.xpath("//span[contains(@class,'z-radio')][2]"));
	 WebElement bouton_nouvel_utilisateur = driver.findElement(By.xpath("//span[contains(@class,'z-radio')][3]"));
	 
	 Thread.currentThread().sleep(1000);
	 
	 assertTrue(bouton_Non_Lié.isSelected());
	 System.out.println("Le bouton "+intitulé_bouton_NonLié.getText()+" est présent et coché");
	 assertTrue(bouton_utilisateur_existant.isDisplayed());
	 System.out.println("Le bouton "+intitulé_bouton_utilisateur_existant.getText()+" est présent");
	 assertTrue(bouton_nouvel_utilisateur.isDisplayed());
	 System.out.println("Le bouton "+intitulé_bouton_nouvel_utilisateur.getText()+" est présent");
	 
 }
 
 public void renseigner_champs(WebDriver driver) {
	 WebElement champ_prenom = driver.findElement(By.id(findElementByIdDynamique(id_champ_prenom))); 
	 WebElement champ_nom = driver.findElement(By.id(findElementByIdDynamique(id_champ_nom)));
	 WebElement champ_ID = driver.findElement(By.id(findElementByIdDynamique(id_champ_ID)));
	 
	 Outils.remplir_un_champ(champ_prenom, "Jean");
	 Outils.remplir_un_champ(champ_nom, "DU");
	 Outils.remplir_un_champ(champ_ID,  "jdu");
 }
 public void renseigner_bloc_utilisateur(WebDriver driver) throws InterruptedException {
	 Thread.currentThread();
		Thread.sleep(2000);
	 WebElement bouton_Non_Lié = driver.findElement(By.xpath("//span[contains(@id,'if')]/input"));
	 WebElement bouton_utilisateur_existant = driver.findElement(By.xpath("//span[contains(@id,'jf')]/input"));
	 WebElement bouton_nouvel_utilisateur = driver.findElement(By.xpath("//span[contains(@id,'kf')]/input"));
	 WebElement nom_nouvel_utilisateur = driver.findElement(By.xpath("//input[contains(@id,'i8')]"));
	 WebElement mot_de_passe_nouvel_utilisateur = driver.findElement(By.xpath("//input[contains(@id,'l8')]"));
	 WebElement confirmation_mdp_nouvel_utilisateur = driver.findElement(By.xpath("//input[contains(@id,'o8')]"));
	 WebElement email_nouvel_utilisateur = driver.findElement(By.xpath("//input[contains(@id,'r8')]"));
	 
	 Outils.remplir_un_champ(nom_nouvel_utilisateur, "jdu");
	 Outils.remplir_un_champ(mot_de_passe_nouvel_utilisateur, "$jdumdp1");
	 Outils.remplir_un_champ(confirmation_mdp_nouvel_utilisateur, "$jdumdp1");
	 Outils.remplir_un_champ(email_nouvel_utilisateur, "jdu@test.fr");
	}
 public void verifier_boutons (WebDriver driver) {
	 WebElement bouton_annuler = driver.findElement(By.xpath("//table[contains(@id,'f-box')]/descendant::td[.='Annuler']"));
	 bouton_annuler.isDisplayed();
	 bouton_enregistrer.isDisplayed();
	 bouton_sauver_et_enregistrer.isDisplayed();
 }
 public Page_creation_participant cliquer_sur_Enregistrer(WebDriver driver) {
	bouton_enregistrer.click(); 
    return PageFactory.initElements(driver, Page_creation_participant.class);
 }
 public void cliquerSurBoutonRadio() {
	 bouton_nouvel_utilisateur.click();
 }
 
 
}