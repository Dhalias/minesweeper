package minesweeper_javafx.vues;

import minesweeper_client.vues.VueParametres;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import javafx.fxml.*;

public class VueParametresFX implements VueParametres, Initializable {

	@Override
	public void initialize( URL arg0, ResourceBundle arg1 ) {
		J.appel( this );
		
	}

}
