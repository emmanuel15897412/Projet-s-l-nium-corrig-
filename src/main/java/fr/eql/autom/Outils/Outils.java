package fr.eql.autom.Outils;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Outils {

	public static WebDriver driver ;
	
	
	String browser="Chrome";
	//waiter
	String url = "http://localhost:8090/libreplan";
	

	public static WebDriver choisir_un_navigateur(String browser) {
		if (browser == "Chrome") {
			System.setProperty("webdriver.chrome.driver","src/main/java/ressources/drivers/chromedriver.exe");
			driver = new ChromeDriver();	
			
		}
		else if (browser == "InternetExplorer") {
			System.setProperty("webdriver.ie.driver","src/main/java/ressources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}
		else if (browser == "Firefox") {
			System.setProperty("webdriver.gecko.driver","src/main/java/ressources/drivers/geckodriver.exe");
		    driver = new FirefoxDriver();	
		}
		else {
			 System.out.println("browser mal renseigné");
		}	
		
		//wait implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		return driver;
	}


	public static void deplacer_un_element(WebElement e1, WebElement e2) {
		try {
		Actions a = new Actions(driver);
		a.clickAndHold(e1).moveToElement(e2).release(e2).build().perform();
	
	
		} catch(Exception e) {
		System.out.println("L'élément n'a pas été déplacé");
		}
	}
	
	public static void remplir_un_champ(WebElement e1, String s) {
		e1.clear();
		e1.sendKeys(s);
		e1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	}
	
	public static WebElement itererTableau(WebElement webElem, String xpath, int celluleRecherchee) {
		
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		List<WebElement> listeWebelement = new LinkedList<WebElement>();
		//wait.until(ExpectedConditions.visibilityOfAllElements(webElem.findElements(By.xpath(xpath))));

		listeWebelement = webElem.findElements(By.xpath(xpath));
//		for (WebElement webElement : listeWebelement) {
//			System.out.println(listeWebelement.size()+" ici : "+celluleRecherchee+" " +webElement.getText());
//		}
		if (!listeWebelement.isEmpty()) {
			try {
		return listeWebelement.get(celluleRecherchee);
			} catch (IndexOutOfBoundsException ie) {
				return null;
			}
		} else {
			return null;
		}
	}
	
	 
	 public static void faireCtrlADansChamp(WebElement e1) {
			Actions a = new Actions(driver);
			
		 //e1.sendKeys(Keys.CONTROL+ "a");
			
			e1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	 }
	 
	 public static void faireCtrlVDansChamp(WebElement e1) {
			Actions a = new Actions(driver);
		e1.clear();
		 e1.sendKeys(Keys.CONTROL+ "v");
	 }
	 
	 

}
