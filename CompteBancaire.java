package partie;

public class CompteBancaire {
	private int numero;
	private String titulaire;
	private double solde;
	private double decouvertAutorise;
	
	private static int nbcomptes=0;
	private static double tauxInteretAnnuel=0.03;
	
	public CompteBancaire() {
		this.numero=++nbcomptes;
		this. titulaire=null;
		this. solde=0;
		this.decouvertAutorise=0;}
	
	public CompteBancaire(String titulaire,double solde,double decouvertAutorise) {
		this.numero=++nbcomptes;
		this .titulaire=titulaire;
		this.solde=solde;
		this.decouvertAutorise=decouvertAutorise;}
	
	public String getTitulaire(){
		return titulaire;}
	
	public void  setTitulaire(String titulaire) {
		if(titulaire!=null && !titulaire.isEmpty()) {
			this.titulaire=titulaire;}}
	
	 public double getDecouvertAutorise() {
	        return decouvertAutorise;}
	   

	    public void setDecouvertAutorise(double decouvertAutorise) {
	        if (decouvertAutorise >= 0) {
	            this.decouvertAutorise = decouvertAutorise; } }
	
	public void afficher() {
		System.out.println("numero:"+numero);
		System.out.println("titulaire:"+titulaire);
		System.out.println("solde:"+solde);
		System.out.println("decouvertAutorise:"+decouvertAutorise);}
	
	public void deposer(double montant) {
		if(montant>0) {
			solde+=montant;}
		else {
			System.out.print("montant de depot invalide");}}
	
	public void retirer(double montant) {
		if(montant>0 && solde - montant >= -decouvertAutorise) {
			solde-=montant;}
		else {
			System.out.print("Retrait refuse");}}
	public void virementVer(CompteBancaire autre,double montant) {
		if(montant>0 && solde-montant>=-decouvertAutorise) {
			this.retirer(montant);
			autre.deposer(montant);}
		else {
			System.out.print("virement impossible: monatnt ou solde est insuffisant");}}
	
	public double calculerSoldeAvecInterets() {
	    return solde + (solde * tauxInteretAnnuel);}
	public double  calculerSoldeAvecInterets(double bonus) {
		return solde + (solde * (tauxInteretAnnuel+bonus));}
	
	public static int getNbComptes() {
        return nbcomptes;}

    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;}

    public static void setTauxInteretAnnuel(double taux) {
        if (taux >= 0) {
            tauxInteretAnnuel = taux;}}}
	