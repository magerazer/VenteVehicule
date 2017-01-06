package fr.demos.formation.poe.ventevehicules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Etat ex = Etat.CORRECT;

		VeloElectrique ve1 = new VeloElectrique(new Modele("solex", "500sx"), 1000, "noir", Etat.CORRECT, 2014);

		ve1.setAutonomie(300);
		Velo v1 = new Velo(new Modele("decathlon", "230"), 800, "noir", Etat.CORRECT, 2014);

		Voiture vo1 = new Voiture(new Modele("peugeot", "206"), 20000, "bleu", Etat.MAUVAIS, 2010, "01FR");
		Voiture vo2 = new Voiture(new Modele("bmw", "x3"), 70000, "gris", Etat.NEUF, 2009, "01PL");
		Voiture vo3 = new Voiture(new Modele("fiat", "500"), 12000, "vert", Etat.EPAVE, 2007, "47BL");

		HashMap<String, Voiture> listeVoitures = new HashMap<>();

		listeVoitures.put(vo1.getImmatriculation(), vo1);
		listeVoitures.put(vo2.getImmatriculation(), vo2);
		listeVoitures.put(vo3.getImmatriculation(), vo3);

		Voiture vo4 = listeVoitures.get("01PL");
		System.out.println(vo4);

		// je cr�e maintenant un garage de velos
		Garage<Velo> garage = new Garage<>("Vente v�los la D�fense");
		garage.ajouter(v1);
		garage.ajouter(ve1);

		for (Velo v : garage) {
			System.out.println(v);
		}

		// je cr�e maintenant un garage de velos
		Garage<Vehicule> garageVehicule = new Garage<>("Vente voitures la D�fense");
		garageVehicule.ajouter(vo1);
		garageVehicule.ajouter(vo2);
		garageVehicule.ajouter(vo3);
		// for(Voiture v : listeVoitures) {
		//
		// }
		garageVehicule.ajouter(v1);
		garageVehicule.ajouter(ve1);
		
		
		
		List<Vehicule> liste = garageVehicule.rechercherEnFonctionCritere(vo -> vo.getPrixHT() > 15000);
		System.out.println("\nexpr lambda 1 :");
		liste.forEach(System.out::println);
		
		liste = garageVehicule.rechercherEnFonctionCritere(v -> v.getModele().getMarque().equals("decathlon"));
		System.out.println("\nexpr lambda 2 :");
		liste.forEach(System.out::println);

		
	}

}
