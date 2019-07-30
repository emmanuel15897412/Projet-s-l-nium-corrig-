package fr.eql.autom.Projet1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.OutilBDD;
import fr.eql.autom.Outils.Outils;

public class Test_Criteres {

	static WebDriver driver;
	String browser = "Chrome";

	String url = "http://localhost:8090/libreplan";
	public String tabProfil[] = { "Sociétés", "Dépenses", "Profils" };

	@Before
	public void setUp() {
		boolean resulat = false;
		try {
			resulat = OutilBDD.getProfilTableByProfileName("Role_test");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			System.out.println("resulat "+resulat);
		
		driver = Outils.choisir_un_navigateur(browser);
		// ACTION : Accéder à l’application libreplan et se connecter en tant que
		// admin/admin
		driver.get(url);

	}

	// @After
	public void tearDown() throws InterruptedException {
		boolean resulat = false;
		try {
			resulat = OutilBDD.getProfilTableByProfileName("Role_test");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		synchronized (driver) {
			driver.wait(10000);
		}

		driver.close();
	}

	@Test
	public void acces_admin_critere() {

		/**
		 * Connexion à l'application - Profil Admin :
		 */
		PageObjectIndex index = PageFactory.initElements(driver, PageObjectIndex.class);
		PageAccueil accueil = index.se_connecter(driver, "admin", "admin");
		Page_profil pageProfil = accueil.acces_gestion_profil(driver);

		/**
		 * Accéder à la page de gestion des profils :
		 */
		pageProfil.getTitreTableau(driver);
		assertEquals("Créer", pageProfil.getCreerBoutonTxt());
		PageCreerProfil pageCreerProfil = pageProfil.clickCreerBouton(driver);
		pageCreerProfil.getOngletProfilTxt();

		/**
		 * Créer un profil - Accès au formulaire de création :
		 */
		assertEquals("", pageCreerProfil.isNomVide(driver));
		assertTrue(pageCreerProfil.testPresenceFieldSet(driver));
		assertTrue(pageCreerProfil.testPresenceEnregisterSauver(driver));

		/**
		 * Créer un profil - Saisie des informations :
		 */
		pageCreerProfil.creerProfil(driver, "Profils", 28);
		assertTrue(pageCreerProfil.testPresenceProfilCree(driver, "tJyPq4"));

		/**
		 * Créer un profil - Conformité infobulle : --> contournement
		 */
		assertTrue(pageCreerProfil.testMouseHoverPoubelle(driver));

		/**
		 * Créer un profil - Ajout de plusieurs rôles :
		 */

		try {
			pageCreerProfil.creerProfil(driver, "Dépenses", 23);
			// assertEquals("Dépenses",pageCreerProfil.testListeRoleAssoc(driver,2));
			assertTrue(pageCreerProfil.testEnum(pageCreerProfil.testListeRoleAssoc(driver, 0), tabProfil));

		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			pageCreerProfil.creerProfil(driver, "Dépenses", 23);
			assertTrue(pageCreerProfil.testEnum(pageCreerProfil.testListeRoleAssoc(driver, 0), tabProfil));
		}

		try {
			pageCreerProfil.creerProfil(driver, "Sociétés", 30);
			// assertEquals("Sociétés",pageCreerProfil.testListeRoleAssoc(driver,1));
			assertTrue(pageCreerProfil.testEnum(pageCreerProfil.testListeRoleAssoc(driver, 1), tabProfil));

		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			pageCreerProfil.creerProfil(driver, "Sociétés", 30);
			// assertEquals("Sociétés",pageCreerProfil.testListeRoleAssoc(driver,1));
			assertTrue(pageCreerProfil.testEnum(pageCreerProfil.testListeRoleAssoc(driver, 1), tabProfil));

		}

		/**
		 * Créer un profil - Ajout d'un rôle déjà ajouté :
		 */

		try {
			pageCreerProfil.creerProfil(driver, "Profils", 28);
			// assertFalse(pageCreerProfil.testPresenceProfilCree(driver, "lF7Q17"));
			assertFalse(pageCreerProfil.testEnum(pageCreerProfil.testListeRoleAssoc(driver, 3), tabProfil));

		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			pageCreerProfil.creerProfil(driver, "Profils", 28);
			// assertFalse(pageCreerProfil.testPresenceProfilCree(driver, "lF7Q17"));
			assertFalse(pageCreerProfil.testEnum(pageCreerProfil.testListeRoleAssoc(driver, 3), tabProfil));
		}

		/**
		 * Créer un profil - Suppression d'un rôle ajouté :
		 */
		pageCreerProfil.clickPoubelle(driver);
		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pageCreerProfil.clickPoubelle(driver);
		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pageCreerProfil.clickPoubelle(driver);

		/**
		 * Créer un profil - enregistrement :
		 */

		Page_profil retour_profil = pageCreerProfil.clickEnregister(driver);

		assertEquals(pageCreerProfil.getNomTxt(), retour_profil.testTxtEncart(driver));
		assertEquals("#cceecc", retour_profil.testCouleurEncart(driver));
		// System.out.println("getNomTxt "+pageCreerProfil.getNomTxt());

		/**
		 * Modifier un profil - accès page de modification :
		 */
		PageCreerProfil retour_modification = retour_profil.modifierProfil(driver, pageCreerProfil.getNomTxt());
		assertEquals("WebElement non trouvé", retour_modification.testListeRoleAssoc(driver, 0));

		/**
		 * Modifier un profil - Ajout de plusieurs rôles :
		 */
		retour_modification.creerProfil(driver, "Profils", 28);
		assertTrue(retour_modification.testPresenceProfilCree2(driver));

		try {
			retour_modification.creerProfil(driver, "Dépenses", 23);
			// assertEquals("Dépenses",pageCreerProfil.testListeRoleAssoc(driver,2));
			assertTrue(retour_modification.testEnum(retour_modification.testListeRoleAssoc(driver, 0), tabProfil));

		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			retour_modification.creerProfil(driver, "Dépenses", 23);
			assertTrue(retour_modification.testEnum(retour_modification.testListeRoleAssoc(driver, 0), tabProfil));
		}

		try {
			retour_modification.creerProfil(driver, "Sociétés", 30);
			// assertEquals("Sociétés",pageCreerProfil.testListeRoleAssoc(driver,1));
			assertTrue(retour_modification.testEnum(retour_modification.testListeRoleAssoc(driver, 1), tabProfil));

		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			retour_modification.creerProfil(driver, "Sociétés", 30);
			// assertEquals("Sociétés",pageCreerProfil.testListeRoleAssoc(driver,1));
			assertTrue(retour_modification.testEnum(retour_modification.testListeRoleAssoc(driver, 1), tabProfil));

		}
		/**
		 * Modifier un profil - enregistrement :
		 */
		retour_modification.changementNomProfil(driver, "profil_modifie");
		Page_profil page_final = retour_modification.clickEnregister(driver);
		// assertEquals(retour_modification.getNomTxt(),
		// page_final.testTxtEncart(driver));
		assertEquals(2, page_final.testProfilModifie(driver, "profil_modifie"));
		assertEquals("#cceecc", page_final.testCouleurEncart2(driver));

	}

}
