package EX4_banque;

public class Compe_Bancaire {


		//attributes de la class
		Client porteur;
		float solde;
		String IBAN;
		public Compe_Bancaire() {
			// initialsation les attributs
			this.solde = 0.0f;
			this.porteur = null;
			IBAN = "";	
		}
		public Compe_Bancaire(Client porteur, float solde, String iBAN) {
			this.solde = solde;
			this.porteur = porteur;
			IBAN = iBAN;
				
		}
		public void affiche () {
			System.out.println("Nom du porteur du compte: " + this.porteur);
			System.out.println("numéro du compte: " + this.IBAN);
			System.out.println("Solde du compte: " + this.solde);
		}
		
		
			public void deposer(float montant) {
								this.solde = this.solde + montant;			
			} 
			public boolean retirer(float montant) {
				boolean res = true;
				
				if (montant < this.solde) {
					this.solde=this.solde-montant;
				}
				else {
					res=false;
				}
				
				return res;
			}
			
			public boolean virement (float montant,Compe_Bancaire autre) {
				boolean res = true;
				if (this.retirer(montant)) {
					autre.solde += montant;
				}
				else {System.out.println("Le virement est annul� !!!");}
				return res;
			}
			
	

}
