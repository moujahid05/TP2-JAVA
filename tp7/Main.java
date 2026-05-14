package tp7;
public class Main {
	public static double effectuerPaiement(double montant, 
			double solde) throws Exception {

        if (montant <= 0) {
            throw new IllegalArgumentException("montant invalide");
        }

        if (montant > solde) {
            throw new Exception("solde insuffisant");
        }

        return solde - montant;
    }
	public static double lireMontant2(String valeur) 
			throws Exception {

	    double m = Double.parseDouble(valeur);

	    if (m < 0) {
	        throw new IllegalArgumentException("montant negatif");
	    }

	    return m;
	}
	public static double lireTransaction(double[] tab,
			int index) {
	    return tab[index];
	}



    public static void main(String[] args) {

        double solde = 500;
        double montant = -20;

        try {
            double nouveau = effectuerPaiement(montant, solde);
            System.out.println("paiement ok : " + nouveau);

        } catch (IllegalArgumentException e) {
            System.out.println("erreur saisie : " 
        + e.getMessage());

        } catch (Exception e) {
            System.out.println("erreur paiement : "
        + e.getMessage());

        } finally {
            System.out.println("Fin de la transaction");
        }
        try {
            double x = lireMontant2("abc");
            System.out.println(x);

        } catch (Exception e) {
            System.out.println("erreur : " + e.getMessage());
        }
        double[] t = {10, 20, 30};

        try {
            double v = lireTransaction(t, 5);
            System.out.println(v);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("indice invalide");

        } catch (NullPointerException e) {
            System.out.println("tableau non initialise");

        } catch (Exception e) {
            System.out.println("autre erreur");
        }


    }
}

	