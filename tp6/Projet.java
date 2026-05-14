package tp6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class Projet {

	public static void main(String[] args) {
		{

	        ArrayList<Livre> livres = new ArrayList<>();

	        livres.add(new Livre("001", "soleil", "younes", 2020));
	        livres.add(new Livre("002", "lune", "lunes", 2018));
	        livres.add(new Livre("003", "etoiles", "abdsamad", 2019));
	        livres.add(new Livre("004", "mer", "abdillah", 2021));

	        HashSet<String> categories = new HashSet<>();

	        categories.add("roman");
	        categories.add("science");
	        categories.add("histoire");
	        categories.add("roman");

	        HashMap<String, Livre> emprunts = new HashMap<>();

	        emprunts.put("kamil", livres.get(0));
	        emprunts.put("moka", livres.get(1));

	        String titreRecherche = "lune";
	        for (Livre l : livres) {
	            if (l.Titre.equals(titreRecherche)) {
	                System.out.println(l.Titre + " " + l.Auteur);
	            }
	        }

	        String isbnSupprimer = "003";
	        for (int i = 0; i < livres.size(); i++) {
	            if (livres.get(i).ISBN.equals(isbnSupprimer)) {
	                livres.remove(i);
	                break;
	            }
	        }

	        for (Livre l : livres) {
	            System.out.println(l.ISBN + " " + l.Titre + " " +
	        l.Auteur + " " + l.Annee);
	        }

	        System.out.println("Rapport final :");
	        System.out.println("Livres restants : " + livres.size());
	        System.out.println("Categories : " + categories.size());
	        System.out.println("Emprunts : " + emprunts.size());
	    }
	}

	}


