package EX4_banque;

public class CompteCredit extends Compe_Bancaire {
	float[] les_retraits; //tout les retraits
	int nbRetraits;
	public CompteCredit (float[] les_retraits,int nbRetraits ) {
		super();
		this.les_retraits = les_retraits;
		this.nbRetraits = nbRetraits;
		
	}
	//constructeur 2/ on affecte les attributes par la suite
	public CompteCredit() {
		super();
		this.les_retraits = null;
		this.nbRetraits = 0;
		
	}
	//constructeur 3: le plus complet
	public CompteCredit(Client porteur, float solde, String iBAN, float[] les_retraits) {
		super(porteur, solde, iBAN);
		this.les_retraits = les_retraits;
		this.nbRetraits = nbRetraits;
	}
	//retirer ? est ce qu'on garde de la classe mère ou non
	@Override
	public boolean retirer(float montant){
		this.les_retraits[nbRetraits] = montant;
		this.nbRetraits = this.nbRetraits + 1;
		return true;
	
	}
}