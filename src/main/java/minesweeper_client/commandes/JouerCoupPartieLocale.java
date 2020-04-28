package minesweeper_client.commandes;

import commun_client.commandes.Commande;

public class JouerCoupPartieLocale extends Commande<JouerCoupPartieLocalePourEnvoi, JouerCoupPartieLocaleRecue>
implements JouerCoupPartieLocalePourEnvoi, JouerCoupPartieLocaleRecue  {

	private int idCase;
	
	@Override
	public int getIdCase() {
		return this.idCase;
	}

	@Override
	public void setIdCase( int id ) {
		this.idCase = id;
		
	}

}
