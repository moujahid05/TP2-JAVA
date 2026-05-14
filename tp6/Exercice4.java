package tp6;
import java.util.HashMap;
public class Exercice4 {
	
	    public static void main(String[] args) {

	        HashMap<String, Double> notes = new HashMap<>();

	        notes.put("mohamad", 19.0);
	        notes.put("mhnd", 15.5);
	        notes.put("tihssi", 13.0);
	        notes.put("mrim", 14.5);
	        notes.put("fatim", 16.0);

	        for (String nom : notes.keySet()) {
	            System.out.println(nom + " " + notes.get(nom));
	        }

	        String nomRecherche = "mhnd";
	        if (notes.containsKey(nomRecherche)) {
	            System.out.println(notes.get(nomRecherche));
	        }

	        notes.put("leila", 17.0);

	        notes.remove("mrim");

	        double somme = 0;
	        for (double n : notes.values()) {
	            somme += n;
	        }

	        double moyenne = somme / notes.size();
	        System.out.println(moyenne);
	    }
	

}
