package minesweeper_javafx.controleurs;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import commun_javafx.ChargeurDeVue;
import commun_javafx.DialogueModal;
import javafx.scene.Scene;
import minesweeper.modeles.PartieLocale.PartieLocale;
import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.FaireDebutPartieRecue;
import minesweeper_client.controleurs.ControleurParametres;
import minesweeper_javafx.afficheurs.AfficheurParametresFX;
import minesweeper_javafx.afficheurs.AfficheurPartieLocaleFX;
import minesweeper_javafx.vues.VueParametresFX;
import minesweeper_javafx.vues.VuePartieLocaleFX;

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
				ouvrirPartie();
			}
	    });
	      
	    
	}

	private void ouvrirPartie() {
		J.appel( this );
		
		final String CHEMIN_PARTIELOCALE_FXML = "/fxml/partieLocale.xml";
	    final String CHEMIN_CHAINES = "traductions.chaines";
	    final String CHEMIN_PARTIE_CSS = "/css/partieLocale.css";

	    ChargeurDeVue<VuePartieLocaleFX> chargeur; 
		chargeur = new ChargeurDeVue<VuePartieLocaleFX>(CHEMIN_PARTIELOCALE_FXML,CHEMIN_CHAINES,CHEMIN_PARTIE_CSS);
		
		VuePartieLocaleFX vue = chargeur.getVue();
		
		DoitEtre.nonNul( vue );
		
		PartieLocale partieLocale = new PartieLocale();
		
		AfficheurPartieLocaleFX afficheur = new AfficheurPartieLocaleFX();
		
		FabriqueControleur.creerControleur( ControleurPartieLocaleFX.class, partieLocale, vue, afficheur );
		
		Scene scene = chargeur.nouvelleScene((float)25,(float)37.03,(float)1.50);
	    
	   DialogueModal.ouvrirDialogueModal(scene);
		
	}

}
