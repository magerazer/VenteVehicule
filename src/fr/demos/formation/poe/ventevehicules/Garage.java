package fr.demos.formation.poe.ventevehicules;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


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
	
	// exemple d'appel : g.rechercherEnFonctionCritere(v -> v.getPrixHT()>1000)
	public List<T> rechercherEnFonctionCritere(Predicate<T> expressionCritere) {
		List<T> liste = new ArrayList<>();
		for(T t:contenu) {
			if(expressionCritere.test(t)) {
				liste.add(t);
			}
		}
		return liste;
	}
	
	
}
