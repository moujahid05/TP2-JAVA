package Heritage;

public class CompteCourant extends Compte {
	 private double decouvertAutorise;
public CompteCourant (String numero, String titulaire, double solde, double decouvertAutorise) {
	super(numero,titulaire,solde);
	this.decouvertAutorise=decouvertAutorise;}
@Override
public void retirer(double montant) {
	if(montant>0 && solde + decouvertAutorise >= montant ) {
		solde -= montant;}
	else {
        System.out.println("Retrait refusé");}}
@Override
public void afficher() {
    super.afficher();
    System.out.println("Découvert autorisé : " + decouvertAutorise);}}




	
	
	

	
	


