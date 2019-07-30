package fr.eql.autom.Projet1;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import fr.eql.autom.Outils.Outils;

public class Test_ligneplan_AdministrationCriteres {
static WebDriver driver ;
	
	
	String browser="Chrome";
	
	String url = "http://localhost:8090/libreplan";
	@Test
	public void test_ligneplan_criteres() throws InterruptedException {	
		driver = Outils.choisir_un_navigateur("Chrome");
		// ACTION : Accéder à l’application libreplan et se connecter en tant que admin/admin
		driver.get("http://localhost:8090/libreplan/");
		
		PageObjectIndex index = PageFactory.initElements(driver, PageObjectIndex.class); 
		PageAccueil accueil =  index.se_connecter(driver, "admin", "admin");
		accueil.Verifier_connexion();
		assertEquals("utilisateur: admin", PageAccueil.texte_connexion_administrateur.getText());
		
		Page_participants   page_participants = accueil.acces_gestion_participants(driver);
		//Vérifier le titre de la page
		assertEquals("Liste des participants", page_participants.verifier_titre_participant());
		//Vérifier le nombre de colonnes
		assertTrue(page_participants.colonnes_tableau(driver));
		
		//Vérification des titres des colonnes
		assertEquals("Surnom", page_participants.verifier_titre_1(driver));
		System.out.println("c1 a pour titre "+page_participants.verifier_titre_1(driver));
		
		assertEquals("Prénom", page_participants.verifier_titre_2(driver));
		System.out.println("c2 a pour titre "+page_participants.verifier_titre_2(driver));
		
		assertEquals("ID", page_participants.verifier_titre_3(driver));
		System.out.println("c3 a pour titre "+page_participants.verifier_titre_3(driver));
		
		assertEquals("Code", page_participants.verifier_titre_4(driver));
		System.out.println("c4 a pour titre "+page_participants.verifier_titre_4(driver));
		
		assertEquals("En file", page_participants.verifier_titre_5(driver));
		System.out.println("c5 a pour titre "+page_participants.verifier_titre_5(driver));
		
		assertEquals("Opérations", page_participants.verifier_titre_6(driver));
		System.out.println("c6 a pour titre "+page_participants.verifier_titre_6(driver));
		
		assertEquals("Filtré par", page_participants.verifier_titre_champ_recherche());
		assertTrue(page_participants.verifier_presence_champ(driver));
		System.out.println("Le champ "+ page_participants.verifier_titre_champ_recherche()+" est présent");
		
		assertTrue(page_participants.verifier_loupe(driver));
		System.out.println("L'icône de la loupe est présente");
		
		assertEquals("Détails personnels", page_participants.verifier_titre_champ_detail_personnel());
		assertTrue(page_participants.verifier_champ_details_personnels(driver));
		System.out.println("Le champ "+page_participants.verifier_titre_champ_detail_personnel()+" est présent");
		
		assertEquals("Plus d'options", page_participants.verifier_nom_bouton_options());
		assertTrue(page_participants.verifier_bouton_options());
		System.out.println("Le bouton "+page_participants.verifier_nom_bouton_options()+" est présent");
		
		assertEquals("Filtre", page_participants.verifier_nom_bouton_filtre());
		assertTrue(page_participants.verifier_bouton_filtre());
		System.out.println("Le bouton "+page_participants.verifier_nom_bouton_filtre()+" est présent");
		
		assertEquals("Créer", page_participants.verifier_nom_bouton_creer());
		assertTrue(page_participants.verifier_bouton_creer());
		System.out.println("Le bouton"+page_participants.verifier_nom_bouton_creer()+"est présent");
		
		Page_creation_participant page_creation_participant = page_participants.cliquer_sur_créer(driver);
			
		//assertTrue(page_creation_participant.Verification_titre_page(driver));
		//System.out.println("La page s'intitule"+page_creation_participant.Verification_titre_page(driver));
		
		page_creation_participant.selection_onglet_par_default();
		assertTrue(page_creation_participant.titre_onglet_par_default());
		System.out.println("L'onglet"+page_creation_participant.titre_onglet_par_default()+" est sélectionné");
		
		assertEquals("Données de base", page_creation_participant.données_de_base(driver));
		System.out.println("Le premier bloc s'intitule"+page_creation_participant.données_de_base(driver));
		
		//page_creation_participant.intitulés_elements(driver);
		//System.out.println("Le premier bloc contient les intitulés 'Code', 'Prénom', 'Nom', 'ID', 'Type'.");
		
		page_creation_participant.intitules_elements_donnees_de_base(driver);
		
		page_creation_participant.champ_code(driver);
		
		//page_creation_participant.verifier_intitulé_case_coche(driver);
		
		page_creation_participant.verifier_case_code_coche(driver);
		
		assertTrue(page_creation_participant.champs_vide(driver));
		
		page_creation_participant.champ_type(driver);
		
		page_creation_participant.bouton(driver);
		
		page_creation_participant.verifier_boutons(driver);
		
		page_creation_participant.renseigner_champs(driver);
		page_creation_participant.cliquerSurBoutonRadio();
		page_creation_participant.renseigner_bloc_utilisateur(driver);
		
		
		page_creation_participant.cliquer_sur_Enregistrer(driver);
		
		page_participants.verifier_message();
		
		page_participants.verifier_utilisateur(driver);
		
		page_participants.remplir_champ_details_personnels();
		
		page_participants.cliquer_sur_filtre(driver);
		
		page_participants.verifier_utilisateur_filtre(driver);
		
		page_participants.cliquer_sur_plus_d_options(driver);
		
		accueil.acces_gestion_participants(driver);
		
		page_participants.cliquer_sur_plus_d_options(driver);
		
		page_participants.cliquer_sur_icone_suivante_tableau(driver);
		
		page_participants.cliquer_sur_icone_precedente_tableau(driver);
		
		page_participants.cliquer_sur_icone_retourFinal_tableau(driver);
		
		page_participants.cliquer_sur_icone_retourInitial_tableau(driver);
		
		
		
	}
	
	 
	
}
