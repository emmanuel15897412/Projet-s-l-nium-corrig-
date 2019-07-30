package fr.eql.autom.Projet1;

import org.junit.Test;

import fr.eql.autom.Outils.OutilBDD;

public class Test_Bdd {

	public static final String PATH= "src/main/java/ressources/bdd/workerINSERT.xml";

	@Test
	public void insertBDD() {
		try {
			//OutilBDD.insertData(PATH);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
