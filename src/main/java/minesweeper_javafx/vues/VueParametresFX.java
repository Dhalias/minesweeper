package minesweeper_javafx.vues;

import minesweeper_client.commandes.FaireDebutPartie;
import minesweeper_client.commandes.FaireDebutPartiePourEnvoi;
import minesweeper_client.vues.VueParametres;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.*;
import javafx.scene.layout.*;
import minesweeper.modeles.Parametres.Parametres;
import minesweeper.vues.composants.GC_Radiobutton;

public class VueParametresFX implements VueParametres, Initializable {

	@FXML
	private GC_Radiobutton gcRadiobuttonSize;

	@FXML
	private GC_Radiobutton gcRadiobuttonDiff;

	@FXML
	private VBox root;

	@FXML
	private Button boutonDebuter;

	@Override
	public void initialize( URL arg0, ResourceBundle arg1 ) {
		J.appel( this );

		DoitEtre.nonNul( gcRadiobuttonDiff );
		DoitEtre.nonNul( gcRadiobuttonSize );

	}

	public void changerCouleurArrierrePlan() {
		J.appel( this );
		root.getStyleClass().add( calculerCouleur() );
	}

	private String calculerCouleur() {
		J.appel( this );
		String couleur = "grey";
		switch ( (int) ( Math.random() * 4 ) ) {
		case 0:
			couleur = "coral";
			break;
		case 1:
			couleur = "green";
			break;

		case 2:
			couleur = "darkRed";
			break;

		case 3:
			couleur = "blue";
			break;
		}
		return couleur;
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel( this );

	}

	public void obtenirFaireDebutPartiePourEnvoi() {

	}
	

	@Override
	public void installerCapteursEvenementsUsager() {

		this.boutonDebuter.setOnAction( new EventHandler<ActionEvent>() {

			@Override
			public void handle( ActionEvent event ) {
				J.appel( this );

				System.out.println( gcRadiobuttonDiff.getSelectedValue() );
				
				System.out.println( gcRadiobuttonSize.getSelectedValue() );
			}

		} );

	}

}
