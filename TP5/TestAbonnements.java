package TP5;

public class TestAbonnements {
    public static void main(String[] args) {
        Abonnement[] abonnements ={
        	new AbonnementVideo("instagramme", 444, 2, true, true),
        	new AbonnementMusique("goglemusique",672,1,22,true),
        	new AbonnementJeux("sabway",976,3,67,54),};
        
        for(Abonnement a :abonnements) {
        	a.afficherInfos();
        	System.out.print("le coût mensuel: "+a.calculerCoutMensuel());
        	System.out.print("score de satisfaction : "+ a.calculerScoreSatisfaction());}
        
        Reducible[] reducibles= {
        	(Reducible) abonnements[0],
        	(Reducible) abonnements[1],}; 
        System.out.println("\n Test Réduction ");
        
        for (Reducible r : reducibles) {
            System.out.println("20%: " + r.appliquerReduction(20));
            System.out.println("50%: " + r.appliquerReduction(50));}}
}