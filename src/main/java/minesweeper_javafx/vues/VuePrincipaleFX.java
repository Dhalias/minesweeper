package minesweeper_javafx.vues;


import minesweeper_client.commandes.OuvrirParametresPourEnvoi;
import minesweeper_client.commandes.QuitterPourEnvoi;
import minesweeper_client.vues.VuePrincipale;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.*;
import javafx.scene.control.Button;

public class VuePrincipaleFX implements VuePrincipale, Initializable {
	
	@FXML
	Button boutonStart;
	
	@FXML
	Button quitter;
	
	private OuvrirParametresPourEnvoi ouvrirParametresPourEnvoi;
	private QuitterPourEnvoi quitterPourEnvoi;

	@Override
	public void obtenirCommandesPourEnvoi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		
		boutonStart.setOnAction( new EventHandler<ActionEvent>() {
			
			@Override
			public void handle( ActionEvent event ) {
				J.appel( this );
				
				ouvrirParametresPourEnvoi.envoyerCommande();
				
			}
		} );
		
		quitter.setOnAction( new EventHandler<ActionEvent>() {
			
			@Override
			public void handle( ActionEvent event ) {
				J.appel( this );
				
				quitterPourEnvoi.envoyerCommande();
				
			}
		} );
		
		
	}

	@Override
	public void initialize( URL arg0, ResourceBundle arg1 ) {
		DoitEtre.nonNul( boutonStart );
		DoitEtre.nonNul( quitter );
	}

}