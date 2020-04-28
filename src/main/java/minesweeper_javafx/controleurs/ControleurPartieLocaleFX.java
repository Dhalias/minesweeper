package minesweeper_javafx.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.FaireDebutPartieRecue;
import minesweeper_client.commandes.JouerCoupPartieLocale;
import minesweeper_client.commandes.JouerCoupPartieLocaleRecue;
import minesweeper_client.controleurs.ControleurPartieLocale;
import minesweeper_javafx.afficheurs.AfficheurPartieLocaleFX;
import minesweeper_javafx.vues.VuePartieLocaleFX;

public class ControleurPartieLocaleFX extends ControleurPartieLocale<VuePartieLocaleFX, AfficheurPartieLocaleFX>  {

	@Override
	protected void installerReceptionCommandes() {
		J.appel( this );
		
		installerRecepteurCommande(JouerCoupPartieLocale.class, new RecepteurCommandeMVC<JouerCoupPartieLocaleRecue>() {

			@Override
			public void executerCommandeMVC( JouerCoupPartieLocaleRecue commande ) {
				J.appel( this );
				System.out.println( "Id de la commande = "+commande.getIdCase() );
				
			}
	    });
		
	}

	@Override
	protected void demarrer() {
		J.appel( this );
		
	}

}
