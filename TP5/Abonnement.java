package TP5;

public abstract class Abonnement {
	private String nom;
	private double prixBase;
	private int nbProfils;

	public Abonnement(String nom,double prixBase, int nbProfils) {
		this.nom=nom;
		this.prixBase= prixBase;
		this.nbProfils=nbProfils;
		if(prixBase<=0) {
			prixBase=2;}
		if(nbProfils<=0) {
			nbProfils=1;}}
	
	
	public String getNom() {
		return nom;}
	public double getPrixBase() {
		return prixBase;}
	public double getNbProfilse() {
		return nbProfils;}
	
	
	public void setNom(String nom) {
		this.nom=nom;}
	
	public void setPrixBase(double prixBase) {
		this.prixBase= prixBase;}
	
	public void nbProfils(int nbProfils) {
		this.nbProfils=nbProfils;}
	
	public boolean estPartageFamilial() {
		if(nbProfils>=3) {
			return true;}
		else {
			return false;}}
	public void afficherInfos(){
		System.out.println("nom :"+ nom);
		System.out.println("prixBase: "+prixBase);
		System.out.println("nbProfils: "+nbProfils);
		System.out.println("estPartageFamilial: "+ estPartageFamilial());}
	
	
   public abstract double calculerCoutMensuel();
   public abstract int calculerScoreSatisfaction();}	

	
	
	
		
		
		
		
		
	
	


