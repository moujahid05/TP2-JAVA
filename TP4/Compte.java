package Heritage;

public class Compte {
    protected String numero;
    protected String titulaire;
    protected double solde;
public Compte(String numero, String titulaire, double solde) {
	this.numero = numero;
    this.titulaire = titulaire;
    this.solde = solde;}
public void deposer(double montant) {
	if(montant>0) {
		solde+=montant;}}
public void retirer(double montant) {
	if(montant>0 && solde>=montant) {
		solde-=montant;}
		else {
			System.out.print("Retrait refusé : solde insuffisant");}}

public void afficher() {
    System.out.println("Numéro : " + numero);
    System.out.println("Titulaire : " + titulaire);
    System.out.println("Solde : " + solde);
}
}







