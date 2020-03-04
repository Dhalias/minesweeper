package minesweeper_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import minesweeper_client.afficheurs.AfficheurPrincipal;
import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.FaireDebutPartieRecue;
import minesweeper_client.vues.VuePrincipale;

public abstract class ControleurPrincipal<V extends VuePrincipale, A extends AfficheurPrincipal<V>>
		extends ControleurVue<V> {
	@Override
	public void installerReceptionCommandes() {
		J.appel( this );
		installerRecepteurCommande(FaireDebutPartie.class, new RecepteurCommandeMVC<FaireDebutPartieRecue>() {
			@Override
			public void executerCommandeMVC(FaireDebutPartieRecue commande) {
				J.appel( this );
				
			} 
		});
	}
}
