package calendar;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;
import fr.eql.autom.Projet1.PageObjectIndex;

public class TestCreerCalendrier {

	String url = "http://localhost:8090/libreplan";
	WebDriver driver;

	public void objectWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Before
	public void setUp() {
		driver = Outils.choisir_un_navigateur("Chrome");
	}

	@Test

	// Connexion à l'application
	public void creerCalendrier() throws InterruptedException {
		Outils.driver.get(url);

		// PAS DE TEST
		// 1/12=======================================================================================
		// Saisie login
		PageConnexion page_connexion = PageFactory.initElements(driver, PageConnexion.class);
		PageAccueilCalendrier page_accueil = page_connexion.seConnecter(driver);

		// Vérification affichage "Calendrier"
		assertEquals("Ressources ", page_accueil.ongletRessources.getText());

		// PAS DE TEST
		// 2/12=======================================================================================
		// Clic sur l'item "Calendriers" dans l'onglet "Ressources"
		PageListeDeCalendriers page_ldc = page_accueil.accesCalendriers(driver);

		// Vérification affichage "Liste de calendrier"
		assertTrue(page_ldc.isVisibleTitrePageListeDeCalendriers(driver));
		assertTrue(page_ldc.texteTitreCalendrier(driver, "Liste de calendriers"));

		// Vérification présence colonne "Nom"
		assertTrue(page_ldc.isVisibleNom(driver));
		assertTrue(page_ldc.texteNom(driver));

		// Vérification présence colonne "Hérité de la date"
		assertTrue(page_ldc.isVisibleHeriteDeLaDate(driver));
		assertTrue(page_ldc.texteHeriteDeLaDate(driver));

		// Vérification présence colonne "Héritages à jour"
		assertTrue(page_ldc.isVisibleHeritagesAJour(driver));
		assertTrue(page_ldc.texteHeritagesAJour(driver));

		// Vérification présence colonne "Opérations"
		assertTrue(page_ldc.isVisibleOperations(driver));
		assertTrue(page_ldc.texteOperations(driver));

		// Vérification présence du bouton [Créer]
		assertTrue(page_ldc.isVisibleBoutonCreer(driver));
		assertTrue(page_ldc.texteCreer(driver));

		// PAS DE TEST
		// 3/12=======================================================================================
		// Clic sur le bouton [Créer]
		PageCreerCalendrier page_cc = page_ldc.cliquerBouton(driver);

		// Vérification affichage "Créer calendrier"
		Thread.sleep(1000);
		assertTrue(page_cc.isVisibleTitreCreerCalendrier(driver));
		assertTrue(page_cc.texteTitreCalendrier(driver, "Créer Calendrier"));

		// Vérification présence d'un formulaire de saisie
		assertTrue(page_cc.isVisibleNom(driver));
		assertTrue(page_cc.isVisiblechampNom(driver));
		assertTrue(page_cc.isVisibleType(driver));
		assertTrue(page_cc.isVisibleChampType(driver));
		assertTrue(page_cc.isVisibleInputCode(driver));
		assertTrue(page_cc.isVisibleCheckBox(driver));
		assertEquals("Générer le code", page_cc.textCheckBox(driver));

		// Vérification présence du bouton [Enregistrer]
		assertTrue(page_cc.isVisibleBoutonEnregistrer(driver));

		// Vérification présence du bouton [Enregistrer et continuer]
		assertTrue(page_cc.isVisibleBoutonEnregistrerEtContinuer(driver));

		// Vérification présence du bouton [Annuler]
		assertTrue(page_cc.isVisibleBoutonAnnuler(driver));

		// PAS DE TEST
		// 4/12=======================================================================================
		// Renseigner formulaire
		page_cc.remplirFormulaire(driver, "Calendrier - Test 1");

		// Clic sur le bouton "Enregistrer"
		page_cc.cliquerBoutonEnregistrer(driver);

		// Vérification affichage "Liste de calendriers"
		assertEquals("Générer le code", page_cc.textCheckBox(driver));

		// Vérification présence du calendrier "Calendrier - Test 1"
		assertTrue(page_ldc.textCalendrierTest1(driver, "Calendrier - Test 1"));

		// PAS DE TEST
		// 5/12=======================================================================================
		// Clic sur l'icône "Créer une dérive"
		page_ldc.cliquerIconeDerive(driver);

		// Vérification affichage "Créer calendrier"
		Thread.sleep(1000);
		assertTrue(page_cc.texteTitreCalendrier(driver, "Créer Calendrier"));

		// Vérification "Nom" champ vide
		assertTrue(page_cc.isVisiblechampNom(driver));
		assertTrue(page_cc.texteChampNom(driver, ""));

		// Vérification "Type" = "Dérivé du calendrier"
		assertTrue(page_cc.isVisibleChampType(driver));
		assertTrue(page_cc.texteChampType(driver, "Dérivé du calendrier Calendrier - Test 1"));

		// PAS DE TEST
		// 6/12=======================================================================================
		// Renseigner formulaire
		page_cc.remplirFormulaire(driver, "Calendrier - Test 1");

		// Clic sur le bouton [Enregistrer et continuer]
		page_cc.cliquerBoutonEnregistrerEtContinuer(driver);

		// Vérification du message "Calendrier - Test 1 existe déjà"
		assertTrue(page_cc.texteMessageInfo(driver, "Calendrier - Test 1 existe déjà"));

		// Vérification cadre orange
		assertEquals("#cc5013", page_cc.couleurMessageInfo(driver));

		// PAS DE TEST
		// 7/12=======================================================================================
		// Renseigner formulaire
		page_cc.remplirFormulaire(driver, "Calendrier - Test Calendrier Dérivé");

		// Clic sur [Enregistrer et continuer]
		page_cc.cliquerBoutonEnregistrerEtContinuer(driver);

		// Vérification affichage "Calendrier de base "Calendrier - Test Calendrier
		// Dérivé" enregistré"
		page_cc.texteMessageInfo(driver, "Calendrier de base \"Calendrier - Test Calendrier Dérivé\" enregistré");

		// Vérification affichage "Créer Calendrier: Calendrier - Test Calendrier
		// Dérivé"
		page_cc.texteMessageInfoCouleur(driver, "Créer Calendrier: Calendrier - Test Calendrier Dérivé");

		// PAS DE TEST
		// 8/12=======================================================================================
		// Clic sur le bouton [Annuler]
		page_ldc = page_cc.cliquerBoutonAnnuler(driver);

		// Vérification affichage "Liste de calendriers"
		Thread.sleep(1000);
		assertTrue(page_ldc.texteTitreCalendrier(driver, "Liste de calendriers"));

		// Vérification affichage "Calendrier - Test Calendrier Dérivé" sous-onglet
		// "Calendrier - Test 1"
		Thread.sleep(1000);
		assertTrue(page_ldc.texteCalendrierTestCalendrierDerive(driver, "Calendrier - Test Calendrier Dérivé"));

		// PAS DE TEST
		// 9/12=======================================================================================
		// Clic sur le bouton [-]
		// Thread.sleep(1000);
		page_ldc.deroulerOnglet(driver);

		// Vérification fermeture "Calendrier - Test 1"

		// Vérification "Calendrier - Dérivé" n'est plus affiché
		assertFalse(page_ldc.isVisibleCalendrierTest1(driver));

		// PAS DE TEST
		// 10/12=======================================================================================
		// Clic sur l'icône "Créer une copie" dans la colonne "Opération" pour le
		// calendrier "Calendrier - Test 1".
		Thread.sleep(1000);
		page_cc = page_ldc.clicCopie(driver);

		// // Vérification "Nom" = "Calendrier - Test 1"
		// Thread.sleep(1000);
		// assertTrue(page_cc.texteChampNom(driver, "Calendrier - Test 1"));
		//
		// // Vérification "Type" = "Calendrier source"
		// assertTrue(page_cc.texteChampType(driver, "Calendrier source"));

		// PAS DE TEST
		// 11/12=======================================================================================
		// Clic sur le bouton [Enregistrer et continuer]
		page_cc.cliquerBoutonEnregistrerEtContinuer(driver);

		// // Vérification "Calendrier - Test 1 existe déjà"
		// Thread.sleep(1000);
		//
		// assertTrue(page_cc.texteMessageInfo(driver, "Calendrier - Test 1 existe
		// déjà"));

		// PAS DE TEST
		// 12/12=======================================================================================
		// Remplissage formulaire
		page_ldc = page_cc.cliquerBoutonEnregistrer(driver);
		page_cc.remplirFormulaire(driver, "Calendrier - Test 2");

		// Clic bouton [Enregistrer]
		page_cc.cliquerBoutonEnregistrer(driver);

		// Vérification affichage "Liste de calendriers"

		// Vérification affichage "Calendrier de base "Calendrier - Test 2" enregistré

		// Vérification affichage "Calendrier - Test 2" hors sous-calendrier

	}
}
