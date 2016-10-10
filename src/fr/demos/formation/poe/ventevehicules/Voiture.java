package fr.demos.formation.poe.ventevehicules;

public class Voiture extends Vehicule {

	private int kilometrage;
	private String immatriculation;
	private String puissance;
	
	public Voiture(Modele modele, double prixHT, String couleur, Etat etat, int annee, String immatriculation) {
		super(modele, prixHT, couleur, etat, annee);
		this.immatriculation = immatriculation;
		
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Voiture [kilometrage=" + kilometrage + ", immatriculation=" + immatriculation + ", modele=" + modele
				+ ", prixHT=" + prixHT + ", couleur=" + couleur + ", etat=" + etat + ", annee=" + annee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((immatriculation == null) ? 0 : immatriculation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		if (immatriculation == null) {
			if (other.immatriculation != null)
				return false;
		} else if (!immatriculation.equals(other.immatriculation))
			return false;
		return true;
	}

	

}
