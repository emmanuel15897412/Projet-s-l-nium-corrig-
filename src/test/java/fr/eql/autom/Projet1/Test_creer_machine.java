package fr.eql.autom.Projet1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;

public class Test_creer_machine {
	static WebDriver driver;
	String browser = "Chrome";

	String url = "http://localhost:8090/libreplan";
	public String tabProfil[] = { "Sociétés", "Dépenses", "Profils" };

	@Before
	public void setUp() {
		driver = Outils.choisir_un_navigateur(browser);
		// ACTION : Accéder à l’application libreplan et se connecter en tant que
		// admin/admin
		driver.get(url);
	}

	// @After
	public void tearDown() throws InterruptedException {
		synchronized (driver) {
			driver.wait(10000);
		}

		driver.close();
	}

	@Test
	public void creer_machine() {

		/**
		 * Connexion à l'application - Profil Admin
		 */
		PageObjectIndex index = PageFactory.initElements(driver, PageObjectIndex.class);
		PageAccueil accueil = index.se_connecter(driver, "admin", "admin");

		/**
		 * Accéder à la page de gestion des machines :
		 */
		Page_machine page_machine = accueil.acces_machine(driver);

		/**
		 * Créer une machine - Accès au formulaire de création :
		 */
		Page_creation_machine page_crea_machine = page_machine.clickCreerBtn(driver);
		/**
		 * Créer une machine - Conformité de l'onglet "Données de la machine" :
		 */
		assertTrue(page_crea_machine.verifTableauDonneMachine(driver));
		/**
		 * Créer une machine - Bouton [Sauver et continuer] :
		 */
		page_crea_machine.remplirTableauDonneMachine(driver);
		assertTrue(page_crea_machine.testerModifMachine(driver));
		/**
		 * 	Retour page de gestion des machines :
		 */
		page_crea_machine.clickAnnuler(driver);
	}
}
