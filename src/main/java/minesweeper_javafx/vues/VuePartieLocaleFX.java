package minesweeper_javafx.vues;

import java.net.URL;
import java.util.List;
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
import javafx.scene.text.*;
import javafx.scene.control.Button;
import minesweeper.modeles.PartieLocale.PartieLocale;
import minesweeper.vues.composants.GrilleDuJeu;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {

	@FXML
	private GrilleDuJeu grilleDuJeu;
	
	@FXML
	private Text finJeu;

	private JouerCoupPartieLocalePourEnvoi jouerCoupPartieLocalePourEnvoi;

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel( this );

		jouerCoupPartieLocalePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi( JouerCoupPartieLocale.class );
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel( this );

		Button[][] tableauBouton = this.grilleDuJeu.getTableauBouton();
		for ( int i = 0; i < tableauBouton.length; i++ ) {
			for ( int j = 0; j < tableauBouton[i].length; j++ ) {
				tableauBouton[i][j].setOnMouseClicked( new EventHandler<Event>() {
					@Override
					public void handle( Event event ) {
						J.appel( this );
						Button bouttonSource = (Button) event.getSource();
						jouerCoupPartieLocalePourEnvoi.setIdCase( bouttonSource.getId() );
						jouerCoupPartieLocalePourEnvoi.envoyerCommande();

					}
				} );
			}

		}

	}

	@Override
	public void initialize( URL location, ResourceBundle resources ) {
		J.appel( this );
		finJeu.setVisible(false);

	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel( this );

	}

	@Override
	public void afficherBoutons( List<int[]> boutons, int[][] tableauJeu ) {
		J.appel( this );

		boolean finDuJeu = grilleDuJeu.afficherBoutons( boutons, tableauJeu );
		
		if ( finDuJeu ) {
			finJeu.setVisible( true );
		}

	}

}
