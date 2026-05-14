package tp6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ClassePrincipale {
	public static void main(String[] args) {
		ArrayList<etudiant> liste = new ArrayList<>();

        liste.add(new etudiant(1, "karim", 17.5));
        liste.add(new etudiant(2, "moujahid", 19.5));
        liste.add(new etudiant(3, "moha", 12));
        liste.add(new etudiant(4, "yassin", 14));
        liste.add(new etudiant(5, "mohssin", 13.5));

        for (etudiant e : liste) {
            System.out.println(e.Id + " " + e.Nom + " " + e.Moyenne);
        }

        String nomRecherche = "moujahid";
        for (etudiant e : liste) {
            if (e.Nom.equals(nomRecherche)) {
                System.out.println(e.Nom + " " + e.Moyenne);
            }
        }

        int idSupprimer = 3;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).Id == idSupprimer) {
                liste.remove(i);
                break;
            }
        }

        Collections.sort(liste, new Comparator<etudiant>() {
            public int compare(etudiant a, etudiant b) {
                return Double.compare(a.Moyenne, b.Moyenne);
            }
        });

        etudiant meilleur = liste.get(0);
        for (etudiant e : liste) {
            if (e.Moyenne > meilleur.Moyenne) {
                meilleur = e;
            }
        }

        System.out.println(meilleur.Nom + " " + meilleur.Moyenne);
    }


	}

