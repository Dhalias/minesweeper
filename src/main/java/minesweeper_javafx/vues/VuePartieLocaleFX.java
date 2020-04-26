package minesweeper_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import minesweeper_client.vues.VuePartieLocale;
import javafx.fxml.*;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel( this );
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel( this );
		
	}

	@Override
	public void initialize( URL location, ResourceBundle resources ) {
		J.appel( this );
		
	}
	
	
}
