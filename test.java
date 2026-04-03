package partie;

public class test {

    public static void main(String[] args) {

        banque b = new banque("MarocBank", 1500);
        CompteBancaire c1 = new CompteBancaire("moujahid", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("youness", 2000, 300);
        CompteBancaire c3 = new CompteBancaire("hassan", 1500, 400);
    
        b.AjouterComptes(c1);
        b.AjouterComptes(c2);
        b.AjouterComptes(c3);
        c1.deposer(500);
        c1.retirer(1200);

        c2.virementVer(c3, 700);
        b.afficherTous();
        
        System.out.println("Solde c2 avec intérêt: " + c2.calculerSoldeAvecInterets());
        System.out.println("Solde c2 avec bonus: " + c2.calculerSoldeAvecInterets(0.015));
        System.out.println("Nombre total de comptes: " + CompteBancaire.getNbComptes());}}