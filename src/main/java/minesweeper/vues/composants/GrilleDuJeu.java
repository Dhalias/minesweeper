package minesweeper.vues.composants;

import commun.debogage.J;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;

public class GrilleDuJeu extends VBox{

	public GrilleDuJeu () {
		super();
		J.appel( this );
		
		this.getChildren().add( new Text("Test") );
	}
}
