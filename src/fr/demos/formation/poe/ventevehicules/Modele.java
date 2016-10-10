package fr.demos.formation.poe.ventevehicules;

public class Modele {

	private String marque;
	private String reference;
	
	public Modele(String marque, String reference) {
		//super();
		this.marque = marque;
		this.reference = reference;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
		Modele other = (Modele) obj;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		return true;
	}

	public String getMarque() {
		return marque;
	}

	public String getReference() {
		return reference;
	}

	@Override
	public String toString() {
		return "Modele [marque=" + marque + ", reference=" + reference + "]";
	}
		
	

}
