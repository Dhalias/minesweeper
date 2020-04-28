package minesweeper_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.JouerCoupPartieLocale;
import minesweeper_client.commandes.JouerCoupPartieLocalePourEnvoi;
import minesweeper_client.vues.VuePartieLocale;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.*;
import javafx.scene.control.Button;
import minesweeper.modeles.PartieLocale.PartieLocale;
import minesweeper.vues.composants.GrilleDuJeu;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {

	@FXML
	private GrilleDuJeu grilleDuJeu;
	
	private JouerCoupPartieLocalePourEnvoi jouerCoupPartieLocalePourEnvoi;
		
	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel( this );
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel( this );
		
		Button[] tableauBouton = this.grilleDuJeu.getTableauBouton();
		for ( int i = 0; i < tableauBouton.length; i++ ) {
			tableauBouton[i].setOnMouseClicked( new EventHandler<Event>() {
				@Override
				public void handle( Event event) {
					J.appel( this );
					jouerCoupPartieLocalePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(JouerCoupPartieLocale.class);
					Button bouttonSource = (Button) event.getSource();
					jouerCoupPartieLocalePourEnvoi.setIdCase( Integer.parseInt( bouttonSource.getId() ));
					jouerCoupPartieLocalePourEnvoi.envoyerCommande();
					
				}
			} );
		}
		
	}

	@Override
	public void initialize( URL location, ResourceBundle resources ) {
		J.appel( this );
		
	}
		
	
}
