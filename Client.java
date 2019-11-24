package EX4_banque;

import java.util.Date;

public class Client {
	String nom;
	String prenom;
	String adresse;
	java.util.Date ddn;
	java.util.Date dda; //date d'arrivée dans la banque
	int nbIncidents;
	//tableau de comptbancaire
	Compe_Bancaire[] mesComptes;
//constructeur pour un client qui n'a pas encore de omptes
	public Client(String nom, String prenom, String adresse, Date ddn, Date dda, int nbIncidents, Compe_Bancaire[] mesComptes) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ddn = ddn;
		this.dda = dda;
		this.nbIncidents = nbIncidents;
		this.mesComptes = null; //initalisation dans la cas où la variable ets une classe 
		//référence nulle
	}
	public Client() {
		this.nom = "";
		this.prenom = "";
		this.adresse = "";
		this.ddn = null; //date de naissance
		this.dda = null; //dare d'arrive dans ala banque
		this.nbIncidents = 0;
		this.mesComptes = null;
		
	}
	public void affiche() {
		System.out.println ("Le nom du client est:" + this.nom);
		System.out.println ("le prénom du client est:" + this.prenom);
		if (this.mesComptes != null) {
			for (int i = 0; i < mesComptes.length; i++) {
				mesComptes[i].affiche();
			}
		}
		else {
			System.out.println ("Pas encore de compte crées");
		}
	

		
	}
	
}
