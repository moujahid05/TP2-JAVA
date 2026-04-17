package Heritage;

public class ComptePremium extends Compte {
	 private double plafondRetrait;
	 public ComptePremium(String numero, String titulaire, double solde,double  plafondRetrait) {
		 super(numero,titulaire,solde);
		 this. plafondRetrait= plafondRetrait;}
public void retirer(double montant) {
	if(montant>0 &&  montant > plafondRetrait) {
		System.out.print("Retrait refusé ");}
	if(montant>0 && solde>=montant) {
		solde-=montant;}
	else {
		System.out.println("Retrait impossible");}}

	
}
