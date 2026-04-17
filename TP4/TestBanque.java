package Heritage;

public class TestBanque {
	public static void main(String[] args) {
		Compte[] comptes=new Compte[4];
		comptes[0]=new CompteCourant("b1","khadija",1200,300);
		comptes[1]=new CompteEpargne("b2","assiya",3000,100);
		comptes[2]=new ComptePremium("b3","ayoub",1400,200);
		comptes[3]=new CompteCourant("b4","ali",1500,400);
	 for (Compte c : comptes) {
		 c.deposer(200);
		 c.retirer(300);
		 c.afficher();}
	 System.out.print("Comptes Epargne");
     for (Compte c : comptes) {
         if (c instanceof CompteEpargne) {
             c.afficher();}
         }}}

