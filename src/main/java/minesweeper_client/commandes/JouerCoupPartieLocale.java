package minesweeper_client.commandes;

import commun_client.commandes.Commande;

public class JouerCoupPartieLocale extends Commande<JouerCoupPartieLocalePourEnvoi, JouerCoupPartieLocaleRecue>
implements JouerCoupPartieLocalePourEnvoi, JouerCoupPartieLocaleRecue  {

	private String idCase;
	
	@Override
	public String getIdCase() {
		return this.idCase;
	}

	@Override
	public void setIdCase( String id ) {
		this.idCase = id;
		
	}

}
