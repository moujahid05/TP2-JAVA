package partie;

public class banque {
	private String nom;
	private CompteBancaire[] comptes;
	private int nbActuels;
	
	public  banque(String nom,int capacite) {
		this.nom=nom;
		this.comptes = new CompteBancaire[capacite];
		this.nbActuels=0;}
	
public void AjouterComptes(CompteBancaire c) {
	if(comptes.length>nbActuels) {
		comptes[nbActuels]=c;
		nbActuels++;}
	else {
		System.out.print("la banque est plien");}}
	
	public void afficherTous() {
		for (int i = 0; i < comptes.length; i++) {
		    if (comptes[i] != null) {
		        comptes[i].afficher();
		    }
		}}}