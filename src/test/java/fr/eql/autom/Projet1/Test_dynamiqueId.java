package fr.eql.autom.Projet1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import fr.eql.autom.Outils.Outils;

public class Test_dynamiqueId{

static WebDriver driver ;
	
	
	String browser="Chrome";
	
	String url = "http://localhost:8090/libreplan";
	
	
	@Before
	public void setUp() {
		driver = Outils.choisir_un_navigateur(browser);
		// ACTION : Accéder à l’application libreplan et se connecter en tant que admin/admin
		driver.get(url);
	}
	
	//@After
	public void tearDown() throws InterruptedException {
		synchronized (driver) {
			driver.wait(10000);
		}
		
		driver.close();
	}

	
	
	@Test
	public void test_id_dynamique() {	

		
		PageObjectIndex index = PageFactory.initElements(driver, PageObjectIndex.class); 
		PageAccueil accueil = index.se_connecter(driver, "admin", "admin");
		String testRessources = index.findRessourceTest(driver);
		System.out.println("testRessources "+testRessources);
		//accueil.findElementByIdDynamique();
		
	}
	
}
