package minesweeper_client.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.ControleurModeleVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import minesweeper.modeles.Parametres.Parametres;
import minesweeper.modeles.Parametres.ParametresLectureSeule;
import minesweeper_client.afficheurs.AfficheurParametres;
import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.FaireDebutPartieRecue;
import minesweeper_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres, A extends AfficheurParametres<V>>
		extends ControleurModeleVue<ParametresLectureSeule, Parametres, V, A> {
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
