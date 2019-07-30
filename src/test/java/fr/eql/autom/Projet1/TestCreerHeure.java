package fr.eql.autom.Projet1;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;

public class TestCreerHeure {

	WebDriver driver;

	public void ObjetWait() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	};

	@Test

	public void test() throws InterruptedException {

		driver = Outils.choisir_un_navigateur("Chrome");
		driver.get("http://localhost:8090/libreplan");
		PageObjectIndex index = PageFactory.initElements(driver, PageObjectIndex.class);
		PageAccueil accueil = index.se_connecter(driver, "admin", "admin");

		// verify first page
		accueil.Verifier_connexion();

		// mouse over to verify element in cout block

		accueil.demarrer(driver);
		Thread.sleep(1000);
		assertTrue(accueil.feuilleDeTemps());
		assertTrue(accueil.cavenasIsPresent());
		assertTrue(accueil.depenses());
		assertTrue(accueil.categorieDeCout());
		assertTrue(accueil.typeHeure());

		// cliquer sur type heure
		PageCreerHeure creerHeure = accueil.selectionnerTypeHeure(driver);

		// verification du tableau sur la page créer heure
		assertEquals("Types d'heures Liste", creerHeure.titre());
		assertTrue(creerHeure.code());
		assertTrue(creerHeure.nomDeType());
		assertTrue(creerHeure.prix());
		assertTrue(creerHeure.activation());
		
		//creer un nouveau type d'heure
		creerHeure.creer();
		creerHeure.decocher();
		assertTrue(creerHeure.code2());
		assertTrue(creerHeure.nom());
		assertTrue(creerHeure.prix2());
		assertTrue(creerHeure.checkbox_active());
		assertTrue(creerHeure.bouton_enregistrer());
		assertTrue(creerHeure.bouton_sauverEtContinuer());
		assertTrue(creerHeure.bouton_annuler());
		
		// remplir le formulaire de création d'un nouveau type d'heure
		creerHeure.decocher();
		creerHeure.remplir(driver);
		creerHeure.manipulationChampCode();
		assertEquals("FAIL : le message d'erreur n'apparait pas quand le champs prix est vide", "ne peut pas être vide",
				creerHeure.messageDErreurChampVide());
		creerHeure.changerChampCode();
		assertEquals("Type d'heures \"Prix 1\" enregistré", creerHeure.testErioc(driver));
		assertEquals(
				"FAIL : vous n'êtes pas sur la page Types d'heures ou le titre de la page de la page n'est pas affiché",
				"Types d'heures Liste", creerHeure.titre());
		Thread.sleep(1000);

		PageModifierHeure modifier_heure = creerHeure.trouver("J9", driver);
		assertTrue(
				"FAIL : vous n'êtes pas sur la page Modifier type d'heures ou le titre de la page de la page n'est pas affiché",
				modifier_heure.verifierTitre());
		
		
		//modifier un type d'heure déja enregistré 
		modifier_heure.annuler(driver);
		// assertEquals("Types d'heures Liste", creerHeure.titre());
		Thread.currentThread().sleep(5000);
		creerHeure.trouver2("Prix 1", driver);
		// assertEquals("FAIL : vous n'êtes pas sur la page Modifier type d'heures ou le titre de la page de la page n'est pas affiché","Modifier Type d'heures: Prix 1", modifier_heure.verifierTitreModifier());
		modifier_heure.cliquerSurCaseActivite();

		
		//afficher toutes les categories de coût
		Page_Categorie categorie = accueil.demarrer2(driver);
		categorie.titreCategorie2();
		
		
		//creer une nouvelle catégorie de coût
		PageCreerCategorie creer_categorie = categorie.creerUneCategorie(driver);
		Thread.currentThread().sleep(5000);
		assertTrue("FAIL : la case générer le code n'est pas cochée", creer_categorie.checkbox());
		creer_categorie.CreerCategorie();
		// assertTrue("FAIL : l'action n'a pas créé une nouvelle ligne",creer_categorie.nouvelleLigne());
		assertTrue("FAIL : le choix Prix 1 est absent du menu déroulant", creer_categorie.choixPrix1());
		creer_categorie.selected();
		creer_categorie.valider();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Cas non passant : affichage d'un message d'erreur si Prix1 copié collé dans le champs prix par défaut
		// assertTrue(creerHeure.messageDErreur());
		// assertEquals("Vous devez spécifier un nombre au lieu de Prix 1.",
		// creerHeure.erreur());
		// creerHeure.nettoyerChampPrix();

	}

}