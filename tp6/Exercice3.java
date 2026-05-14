package tp6;
import java.util.HashSet;
import java.util.TreeSet;
public class Exercice3 {
	public static void main(String[] args) {
		{

	        HashSet<String> matieres = new HashSet<>();

	        matieres.add("francais");
	        matieres.add("histoire");
	        matieres.add("geographie");
	        matieres.add("philosophie");
	        matieres.add("anglais");
	        matieres.add("francais");

	        for (String m : matieres) {
	            System.out.println(m);
	        }

	        TreeSet<String> matieresTriees = new TreeSet<>
	        (matieres);

	        for (String m : matieresTriees) {
	            System.out.println(m);
	        }
	    }

	}

}
