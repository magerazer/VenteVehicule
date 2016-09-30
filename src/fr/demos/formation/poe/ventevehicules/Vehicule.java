package fr.demos.formation.poe.ventevehicules;
import java.util.ArrayList;



public abstract class Vehicule {

	protected Modele modele;
	protected double prixHT;
	protected String couleur;
	protected String options;
	protected Etat etat;
	protected int annee;
	
	public Vehicule(Modele modele, double prixHT, String couleur, Etat etat, int annee) {
		super();
		this.modele = modele;
		this.prixHT = prixHT;
		this.couleur = couleur;
		this.etat = etat;
		this.annee = annee;
		
		
	}
	
	public String getOptions() {
		return options;
	}
	
	public void setOptions(String options) {
		this.options = options;
	}
	
	// possibilite d'entrer une option sans tout resaisir
	public void addOption(String autreOption) {
		// en supposant que le delemiteur est ;
		if(this.options!=null) {
			this.options = this.options+";" + autreOption;
		} else {
			this.options = autreOption;
		}
		
	}

	public Modele getModele() {
		return modele;
	}

	public void setModele(Modele modele) {
		this.modele = modele;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getEtat() {
		return etat.name();
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	
	
	
	
	
}
