package fr.eql.autom.Projet1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;

public class TestCreerProjet {

	String url = "http://localhost:8090/libreplan";
	WebDriver driver;

	@Before
	public void setUp() {
		driver = Outils.choisir_un_navigateur("Chrome");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test

	public void TestPROTA01() throws InterruptedException {
		// Connexion àl'application
		Outils.driver.get(url);

		// Saisir informations de connexion
		PageObjectIndex index = PageFactory.initElements(driver, PageObjectIndex.class);
		PageAccueil page_accueil = index.se_connecter(driver, "admin", "admin");
		page_accueil.Verifier_connexion();
		

		// Cliquer sur icone nouveau projet
		PageCreerNouveauProjet nouveau_projet = page_accueil.clickNewProject(driver);

		// Verifier presence des champs
		// assertEquals("Créer un nouveau
		// projet",driver.findElement(By.xpath("//div[@class=\"z-window-modal-icon
		// z-window-modal-close\"]")).getText() );

		// Remplir champs de la fenetre creation nouveau projet
		PageDetailProjet page_detail_projet = nouveau_projet.remplir_champ(driver);
		// changer les dates

		// 3-menu affiché:detail du projet
		assertTrue(page_detail_projet.PresenceMenuDetailProjet());
		assertTrue(page_detail_projet.PresenceOngletaches());

		// 6-Vérifier la présence des boutons d'enregistrement et d'annulation de
		// l'édition du projet.
		assertTrue(page_detail_projet.testPresenceSaveButon());
		assertTrue(page_detail_projet.testPresenceBackButon());
		assertTrue(page_detail_projet.testPresenceBubleSave());
		//assertTrue(page_detail_projet.testPresenceBubleBack());

		// 7-Cliquer sur le bouton d'annulation de l'édition du projet.
		PageConfirmationAnnulation page_confirmAnnulation = page_detail_projet.clickOnBackButon(driver);
		
		page_detail_projet.clickOnBackButon(driver);
		Thread.sleep(600);
		assertEquals("Confirmer la fenêtre de sortie", page_confirmAnnulation.message_titre());
		System.out.println(page_confirmAnnulation.message_titre());
		assertEquals("Les modifications non enregistrées seront perdues. Êtes-vous sûr ?",
				page_confirmAnnulation.message_confirmation());
		System.out.println(page_confirmAnnulation.message_confirmation());
		assertTrue(page_confirmAnnulation.PresenceButonOK());

		// 8-Dans la pop-up, cliquer sur le bouton [Annuler].
		
		page_confirmAnnulation.clickOnX(driver);
		Thread.sleep(600);
		assertTrue(page_detail_projet.PresenceMenuDetailProjet());
		assertTrue(page_detail_projet.PresenceOngletaches());

		// 9-Cliquer sur le bouton d'annulation de l'édition du projet.
		
		page_detail_projet.clickOnBackButon(driver);
		Thread.sleep(600);
		assertEquals("Confirmer la fenêtre de sortie", page_confirmAnnulation.message_titre());
		System.out.println(page_confirmAnnulation.message_titre());
		assertEquals("Les modifications non enregistrées seront perdues. Êtes-vous sûr ?",
				page_confirmAnnulation.message_confirmation());
		System.out.println(page_confirmAnnulation.message_confirmation());
		assertTrue(page_confirmAnnulation.PresenceButonOK());

		// 10-Dans la pop-up, cliquer sur le bouton [OK].
		
		page_confirmAnnulation.clickOnOK(driver);
		Thread.sleep(600);
		assertTrue(page_accueil.PresenceMenuPlanification());
		//assertTrue(page_accueil.PresenceMenuPlanification());
		
		//11-Passer la souris sur l'onglet "Calendrier" puis dans le sous-menu qui s'affiche, cliquer sur l'item "Projets".
		page_accueil.MouseHoverCalendrier(driver);


	
	}

}
