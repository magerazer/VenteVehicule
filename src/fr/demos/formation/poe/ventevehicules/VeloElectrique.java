package fr.demos.formation.poe.ventevehicules;

public class VeloElectrique extends Velo implements Electrique {

	private int autonomie;
	private int tempsCharge;
	private String typeBatterie;
	private double bonusEcologique;
	
	public VeloElectrique(Modele modele, double prixHT, String couleur, Etat etat, int annee) {
		super(modele, prixHT, couleur, etat, annee);
		// TODO Auto-generated constructor stub
		
	}

	
	
	@Override
	public String toString() {
		return "VeloElectrique [modele=" + modele + ", prixHT=" + prixHT + ", couleur=" + couleur + ", options="
				+ options + ", etat=" + etat + ", annee=" + annee + ", autonomie=" + autonomie + ", tempsCharge="
				+ tempsCharge + ", typeBatterie=" + typeBatterie + ", bonusEcologique=" + bonusEcologique + "]";
	}



	@Override
	public int getAutonomie() {
		// TODO Auto-generated method stub
		
		return this.autonomie;
	}

	@Override
	public int getTempsCharge() {
		// TODO Auto-generated method stub
		return this.tempsCharge;
	}

	@Override
	public String getTypeBatterie() {
		// TODO Auto-generated method stub
		return this.typeBatterie;
	}

	@Override
	public double getBonusEcologique() {
		// TODO Auto-generated method stub
		return this.bonusEcologique;
	}



	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}



	public void setTempsCharge(int tempsCharge) {
		this.tempsCharge = tempsCharge;
	}



	public void setTypeBatterie(String typeBatterie) {
		this.typeBatterie = typeBatterie;
	}



	public void setBonusEcologique(double bonusEcologique) {
		this.bonusEcologique = bonusEcologique;
	}

	

}
