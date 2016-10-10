package fr.demos.formation.poe.ventevehicules;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Etat ex = Etat.CORRECT;
		
		VeloElectrique ve1 = new VeloElectrique
		(new Modele("solex", "500sx"), 1000, "noir", Etat.CORRECT, 2014);
		
		ve1.setAutonomie(300);
		Velo v1 = new Velo
				(new Modele("decathlon", "230"), 800, "noir", Etat.CORRECT, 2014);

		
		
		Voiture vo1 = new Voiture(new Modele("peugeot", "206"), 20000, "bleu", Etat.MAUVAIS, 2010, "01FR");
		Voiture vo2 = new Voiture(new Modele("bmw", "x3"), 70000, "gris", Etat.NEUF, 2009, "01PL");
		Voiture vo3 = new Voiture(new Modele("fiat", "500"), 12000, "vert", Etat.EPAVE, 2007, "47BL");
		
		HashMap<String, Voiture> listeVoitures = new HashMap<>();		
		
		listeVoitures.put(vo1.getImmatriculation(), vo1);
		listeVoitures.put(vo2.getImmatriculation(), vo2);
		listeVoitures.put(vo3.getImmatriculation(), vo3);
	
		Voiture vo4 = listeVoitures.get("01PL");
		System.out.println(vo4);
		
		// je crée maintenant un garage de velos
		Garage<Velo> garage = new Garage<>("Vente vélos la Défense");
		garage.ajouter(v1);
		garage.ajouter(ve1);
		
		for(Velo v:garage) {
			System.out.println(v);
		}
		
		
//		for(Voiture v : listeVoitures) {
//			
//		}
		
		
		
		
		
		
	}

}
