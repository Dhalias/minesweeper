package minesweeper_javafx.vues;

import minesweeper_client.vues.VueParametres;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import javafx.fxml.*;
import minesweeper.vues.composants.GC_Radiobutton;

public class VueParametresFX implements VueParametres, Initializable {

	@FXML
	private GC_Radiobutton gcRadiobutton;
	
	@Override
	public void initialize( URL arg0, ResourceBundle arg1 ) {
		J.appel( this );
		
		DoitEtre.nonNul( gcRadiobutton );
		
	}

}
