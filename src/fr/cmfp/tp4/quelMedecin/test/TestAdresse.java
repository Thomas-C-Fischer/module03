package fr.cmfp.tp4.quelMedecin.test;

import fr.cmfp.tp4.quelMedecin.bo.Adresse;

public class TestAdresse {
	public static void main(String[] args) {
		System.out.println("__________________________ Adresses ______________________________");
		Adresse sh  = new Adresse(221, "B", "baker street", 00000, "Londres");

		sh.afficher();
		System.out.println("------------------------------------------------------------------");
	}

}
