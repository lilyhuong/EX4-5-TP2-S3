package EX4_banque;

import java.util.Date;

public class CompteRemunere extends Compe_Bancaire {
	//sans l'�crite on a tout les attribites  et tout les m�thode
	//de la classe compte Compte Bancaire
	float solde_mini;
	float taux;
	java.util.Date ddp;
	float solde_moyen; // solde moyen instant�n�
	// pour m�moire les attributs de la classe parent sont pr�sent
	//Client porteur;
	//float solde;
	// String IBAN;
	public CompteRemunere (float taux, float solde_mini, Date ddp, float solde_moyen, Client porteur, float le_solde, String I_IBAN) {
		super(porteur, le_solde, I_IBAN); //appel au constructeur pour la partie parente
		this.taux = taux;
		this.solde_mini = solde_mini;
		this.ddp = ddp;
		this.solde_moyen = solde_moyen;
	}
	
	public void affiche() {
		super.affiche();
		System.out.println("Nom du porteur du compte: " + this.porteur.nom);
		System.out.println("num�ro du compte: " + this.IBAN);
		System.out.println("Solde du compte: " + this.solde);
		System.out.println("le sode mini est: " + this.solde_mini);
		System.out.println("le taux de r�mun�ration ets: " + this.taux);
		System.out.println("la date au deput de la period est: " + this.ddp);
		System.out.println ("le solde mini est" + this.solde_moyen);
	}
	public void affiche2() {
		System.out.println("Nom du porteur du compte: " + super.porteur.nom);
		System.out.println("num�ro du compte: " + super.IBAN);
		System.out.println("Solde du compte: " + super.solde);
		System.out.println("le sode mini est: " + this.solde_mini);
		System.out.println("le taux de r�mun�ration ets: " + this.taux);
		System.out.println("la date au deput de la period est: " + this.ddp);
		System.out.println ("le solde mini est" + this.solde_moyen);
	
	}
	public void affiche3() {
		super.affiche(); //le mot cl� super d�digne l'objet parent qui est en moi
		//diff�rent entre this et super
		System.out.println("le sode mini est: " + this.solde_mini);
		System.out.println("le taux de r�mun�ration ets: " + this.taux);
		System.out.println("la date au deput de la period est: " + this.ddp);
		System.out.println ("le solde mini est" + this.solde_moyen);
	
	}
@Override 
	public boolean retirer(float montant) {
		boolean res = true; // ets ce que le retrait se faire ou non
		//si le solde reste sup�rieure au solde mini alors je peux faire les 
		if ((this.solde - montant > this.solde_mini) && (montant < 500) ) {
			this.solde = this.solde - montant;
			//recalculer le solde moyen
			this.solde_moyen = (this.solde + this.solde_moyen)/2;
		}
		else {
			res = false; super.porteur.nbIncidents++;
		}
		return res;
	}
}
