package EX4_banque;

import java.util.Date;

public class Principale {
	public static void main (String[]args) {
		Client Bobby = new Client();
		Bobby.nom = "LaPointe";
		Bobby.prenom = "Bobby";
		Bobby.adresse = "43 rue des plates, Pezenas";
		//on utilise la constructeur da la classeDate
		// (Nombre d'année depuis 1900,numméro du mois, numéro du jour)
		Bobby.ddn = new Date(22,4,16);// 16 avril 1922
		Bobby.dda = new Date(); 
		Bobby.nbIncidents = 0;
		//créer et effecter descomptes bancaires à Bobby
		// Bobby.mesComptes = tableau de compte
		//créer des comptes bancaire puis un tableau 
		Compe_Bancaire cb1 = new Compe_Bancaire();
		cb1.porteur = Bobby; //association entre ce compte et ce client
		cb1.IBAN = "7456-567-5678-FR";
		cb1.solde = 1000.00f;
		Compe_Bancaire cb2 = new Compe_Bancaire();
		cb2.porteur = Bobby; //association entre ce compte et ce client
		cb2.IBAN = "746-567-578-FR";
		cb2.solde = 1000.00f;
		
		//créer du tableau de comptes
		Compe_Bancaire[] tabCB = new Compe_Bancaire[2];
		//insertion cb1 et cb2
		tabCB[0] = cb1;
		tabCB[1] = cb2;
		
		Bobby.mesComptes = tabCB;
		Bobby.affiche();
		
		Client biloo = new Client();
		biloo.nom = "LaPointe";
		biloo.prenom = "Bobby";
		biloo.adresse = "43 rue des plates, Pezenas";
		biloo.ddn = new Date(55,9,28);
		biloo.dda = new Date(); 
		biloo.nbIncidents = 0;
		
		//creation du compte rémunere
		
		CompteRemunere cr = new CompteRemunere (0.04f, 2000, new Date(),13000, biloo, 13000, "45484-545-US");
		cr.affiche();
		cr.retirer(1000);
	}
}
