package fr.eql.autom.Projet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil extends PageObject_bandeau {

	static @FindBy(xpath = "//td[contains(text(),'utilisateur: admin')]") WebElement texte_connexion_administrateur;

	private @FindBy(xpath = "//button[contains(text(),'Calendrier')]") WebElement onglet_calendrier;
	//private @FindBy(xpath = "//li[@class='z-menu-item z-menu-item-over']") WebElement item_projet;
	
	@FindBy(xpath = "//td[@class=\"z-button-cm\"][contains(.,'Planification des projets')]")
	WebElement menu_planification;

	private @FindBy(xpath = "//button[contains(.,'Coût')]") WebElement onglet_cout;

	private @FindBy(xpath = "//a[contains(.,'Feuille de temps')][contains(@href,'zul')]") WebElement feuille_de_temps;
	private @FindBy(xpath = "//a[contains(.,'Canevas de feuille de temps')][contains(@href,'zul')]") WebElement canevas_fdt;
	private @FindBy(xpath = "//a[contains(.,'Liste des lignes de la feuille de temps')][contains(@href,'zul')]") WebElement liste_des_lignes;
	private @FindBy(xpath = "//a[contains(.,'Dépenses')][contains(@href,'zul')]") WebElement depenses;
	private @FindBy(xpath = "//a[contains(.,' Catégories de coût')][contains(@href,'zul')]") WebElement categorie_de_cout;
	private @FindBy(xpath = "//a[contains(.,\" Types d'heures\")][contains(@href,'zul')]") WebElement type_heure;
	private @FindBy(xpath = "//button[contains(text(),'Ressources')]") WebElement onglet_ressources;
	private @FindBy(xpath = "//button[contains(text(),'Configuration')]") WebElement onglet_config;
	private @FindBy(xpath = "//td[@class= 'z-menu-inner-m']") WebElement menu_ressources;
	private @FindBy(xpath = "//a[@href = '/libreplan/resources/worker/worker.zul']") WebElement onglet_participant;
	private @FindBy(xpath = "//table[@style='width:100%;height:100%']") WebElement icone_newProject;

//	@FindBy (xpath = "//td[@class= 'z-menu-inner-m']")
//	private WebElement menu_ressources;
//	
//	@FindBy (xpath = "//a[@href = '/libreplan/resources/worker/worker.zul']")
//	private WebElement onglet_participant;
	
	@FindBy (xpath = "//a[@href = '/libreplan/resources/machine/machines.zul']")
	private WebElement onglet_machine;
	
	@FindBy (xpath = "//button[contains(text(),'Configuration')]")
	private WebElement onglet_configuration;
	

	@FindBy (xpath = "//a[@href = '/libreplan/profiles/profiles.zul']")
	private WebElement onglet_profil;
	// @FindBy(xpath = "//div[@style='width: 1817px; height: 481px; overflow:
	// hidden;']") WebElement menu_horyzontal;
	
	public PageListeProjett MouseHoverCalendrier(WebDriver driver) throws InterruptedException {
		// mouse over jusqu'à l'élement Calendrier
		Actions a = new Actions(driver);
		a.moveToElement(onglet_calendrier).build().perform();
		driver.findElement(By.xpath("//a[@href='/libreplan/planner/index.zul;orders_list']")).click();
		return PageFactory.initElements(driver, PageListeProjett.class);
	}
	

	
	public PageCreerHeure demarrer(WebDriver driver) {
		// mouse over jusqu'à l'élement cout 
		
	//assert verif contenu révélé par le mouse over
		
		
		// click element Type d'heures

	public boolean PresenceMenuPlanification() {
		return menu_planification.isDisplayed();
	}


	public PageCreerNouveauProjet clickNewProject(WebDriver driver) {
		icone_newProject.click();
		return PageFactory.initElements(driver, PageCreerNouveauProjet.class);
	}

	public void demarrer(WebDriver driver) {
		// mouse over jusqu'à l'élement cout
		Actions a = new Actions(driver);
		a.moveToElement(onglet_cout).build().perform();

	}

	public boolean cavenasIsPresent() {
		return canevas_fdt.isDisplayed();
	}

	public boolean feuilleDeTemps() {
		return feuille_de_temps.isDisplayed();
	}

	public boolean listeLignes() {
		return liste_des_lignes.isDisplayed();
	}

	public boolean depenses() {
		return depenses.isDisplayed();
	}

	public boolean categorieDeCout() {
		return categorie_de_cout.isDisplayed();
	}

	public boolean typeHeure() {
		return type_heure.isDisplayed();
	}

	public PageCreerHeure selectionnerTypeHeure(WebDriver driver) throws InterruptedException {

		type_heure.click();
		return PageFactory.initElements(driver, PageCreerHeure.class);
	}
	
   
   public Page_participants acces_gestion_participants(WebDriver driver) {
		  
	   Actions a = new Actions(driver);
	   a.moveToElement(onglet_ressources).build().perform();
	   WebElement menu = driver.findElement(By.xpath("//td[@class= 'z-menu-inner-m']"));
	   a.moveToElement(onglet_participant).build().perform();
	   driver.findElement(By.xpath("//a[@href = '/libreplan/resources/worker/worker.zul']")).click();
	   return PageFactory.initElements(driver, Page_participants.class);
	   
	   
	   
	   // Select select = new Select(menu);
	  // select.selectByVisibleText("Participant");
	   
   }

   
   
   public Page_profil acces_gestion_profil(WebDriver driver) {
		  
	   Actions a = new Actions(driver);
	   a.moveToElement(onglet_config).build().perform();
	   WebElement menu = driver.findElement(By.xpath("//td[@class= 'z-menu-inner-m']"));
	   a.moveToElement(onglet_profil).build().perform();
	   driver.findElement(By.xpath("//a[@href = '/libreplan/profiles/profiles.zul']")).click();
	   return PageFactory.initElements(driver, Page_profil.class);

	   
   }
   
   public Page_machine acces_machine(WebDriver driver) {
		  
	   Actions a = new Actions(driver);
	   a.moveToElement(onglet_ressources).build().perform();
	   a.moveToElement(onglet_machine).build().perform();
	   
	   driver.findElement(By.xpath("//a[@href = '/libreplan/resources/machine/machines.zul']")).click();
	 //  onglet_machine.click();
	   return PageFactory.initElements(driver, Page_machine.class);

	   
   }

	public Page_Categorie demarrer2(WebDriver driver) {
		Actions a = new Actions( driver);
		a.moveToElement(onglet_cout).build().perform();
		categorie_de_cout.click();
		return PageFactory.initElements(driver, Page_Categorie.class);

	}
}