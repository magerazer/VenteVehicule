package fr.demos.formation.poe.ventevehicules;
import java.util.ArrayList;
import java.util.Iterator;


// le garage est iterable
public class Garage<T> implements Iterable<T> {
	private String nom;
	private ArrayList<T> contenu = new ArrayList<>();
	
	public Garage(String nom) {
		super();
		this.nom = nom;
	}
	
	public void ajouter(T t) {
		contenu.add(t);
	}
	
	public Iterator<T> iterator() {
		return contenu.iterator();
	}
	
	
	
	
}
