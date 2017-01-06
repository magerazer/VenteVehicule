package fr.demos.formation.poe.ventevehicules;

public class Velo extends Vehicule {
		
	public Velo(Modele modele, double prixHT, String couleur, Etat etat, int annee) {
		super(modele, prixHT, couleur, etat, annee);
			
	}

	@Override
	public String toString() {
		return "Velo [modele=" + modele + ", prixHT=" + prixHT + ", couleur=" + couleur + ", options=" + options
				+ ", etat=" + etat + ", annee=" + annee + "]";
	}

	
	
	

}
