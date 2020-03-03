package minesweeper_javafx.controleurs;

import commun.debogage.J;
import commun.systeme.Systeme;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import javafx.scene.Scene;
import minesweeper_client.commandes.OuvrirParametres;
import minesweeper_client.commandes.OuvrirParametresRecue;
import minesweeper_client.commandes.Quitter;
import minesweeper_client.commandes.QuitterRecue;
import minesweeper_client.controleurs.ControleurParametres;
import minesweeper_client.controleurs.ControleurPrincipal;
import minesweeper_javafx.afficheurs.AfficheurParametresFX;
import minesweeper_javafx.afficheurs.AfficheurPrincipalFX;
import minesweeper_javafx.vues.VuePrincipaleFX;

public class ControleurPrincipalFX extends ControleurPrincipal<VuePrincipaleFX, AfficheurPrincipalFX> {

	@Override
	public void demarrer() {
		J.appel( this );
		
	}
	
	@Override
	public void installerReceptionCommandes() {
	    J.appel(this);

	 /*   installerRecepteurCommande(NouvellePartie.class, new RecepteurCommandeMVC<NouvellePartieRecue>() {
	        @Override
	        public void executerCommandeMVC(NouvellePartieRecue commande) {
	            J.appel(this);
	            
	           nouvellePartieLocale();
	        }
	    });
	*/
	    installerRecepteurCommande(OuvrirParametres.class, new RecepteurCommandeMVC<OuvrirParametresRecue>() {
	        @Override
	        public void executerCommandeMVC(OuvrirParametresRecue commande) {
	            J.appel(this);
	            
	           ouvrirParametres();
	        }
	    });
	    
	    
	    installerRecepteurCommande(Quitter.class, new RecepteurCommandeMVC<QuitterRecue>() {
	        @Override
	        public void executerCommandeMVC(QuitterRecue commande) {
	            J.appel(this);
	            
	           Systeme.quitter();
	        }
	    });
	    
	    
	}
	
	private void ouvrirParametres() {
	    J.appel(this);
	    
	    final String CHEMIN_PARAMETRES_FXML = "/fxml/parametres.xml";
	    final String CHEMIN_CHAINES = "traductions.chaines";
	    final String CHEMIN_PARAMETRES_CSS = "/css/principal.css";

	    ChargeurDeVue chargeur = new ChargeurDeVue(CHEMIN_PARAMETRES_FXML,
	                    CHEMIN_CHAINES,
	                    CHEMIN_PARAMETRES_CSS);
	    
	   Scene scene = chargeur.nouvelleScene(400, 300);
	    
	   DialogueModal.ouvrirDialogueModal(scene);
	}

}
