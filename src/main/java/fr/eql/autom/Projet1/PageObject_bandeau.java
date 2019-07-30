package fr.eql.autom.Projet1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject_bandeau {

	
	@FindBy(xpath = "//div/button[contains(text(),'Calendrier' )]")
	private WebElement sessionVariable;
	
	/**
	 * ID = ID de session + id fixe de l'élément
	 * @param idComplet
	 * @return l'ID avec la bonne session
	 */
	public String findElementByIdDynamique(String idComplet) {
		String idPartieFixe = idComplet.substring(4,idComplet.length());
		String id = sessionVariable.getAttribute("id");
		System.out.println("partie fixe = "+id.substring(0, 4));
		return id.substring(0, 4).concat(idPartieFixe);
	}
	

//	public String findRessourceTest(WebDriver driver) {
//		String id = ressources.getAttribute("id");
//		System.out.println(id);
//		ressources = prepareWebElementWithDynamicId(ressources.getAttribute("id"),findElementByIdDynamique(), driver);
//		 id = ressources.getAttribute("id");
//		System.out.println(id);
//		return id;
//	}
//	
//	private WebElement prepareWebElementWithDynamicId (String idvalue, String substitutionValue, WebDriver driver ) {
//
//        return driver.findElement(By.id(idvalue.replace(id, substitutionValue)));
//}	
	
	
	
	
}
