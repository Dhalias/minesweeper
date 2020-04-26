package minesweeper_javafx.controleurs;

import commun.debogage.J;
import commun.systeme.Systeme;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.FaireDebutPartieRecue;
import minesweeper_client.commandes.OuvrirParametres;
import minesweeper_client.commandes.OuvrirParametresRecue;
import minesweeper_client.commandes.Quitter;
import minesweeper_client.commandes.QuitterRecue;
import minesweeper_client.controleurs.ControleurParametres;
import minesweeper_javafx.afficheurs.AfficheurParametresFX;
import minesweeper_javafx.vues.VueParametresFX;

public class ControleurParametresFX extends ControleurParametres<VueParametresFX, AfficheurParametresFX> {

	@Override
	public void demarrer() {
		J.appel( this );
		
	}
	
	@Override
	public void installerReceptionCommandes() {
	    J.appel(this);

	    installerRecepteurCommande(FaireDebutPartie.class, new RecepteurCommandeMVC<FaireDebutPartieRecue>() {

			@Override
			public void executerCommandeMVC( FaireDebutPartieRecue commande ) {
				J.appel( this );
				
			}
	    });
	      
	    
	}

}
