/**
 * 
 */
package minesweeper.vues.composants;

import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;

import javafx.util.Duration;

import javafx.event.*;

import commun.debogage.J;
import javafx.beans.NamedArg;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.animation.*;

public class GC_Radiobutton extends VBox {

	private Timeline animationSurvol = new Timeline();

	public GC_Radiobutton( @NamedArg("rb1") String rb1_Name, @NamedArg("rb2") String rb2_Name,
			@NamedArg("rb3") String rb3_Name, @NamedArg("title") String title ) {

		super();
		J.appel( this );
		ToggleGroup tg = new ToggleGroup();

		this.getChildren().add( AjouterVBoxTitre( title ) );
		this.getChildren().add( AjouterBouton( rb1_Name, tg ) );
		this.getChildren().add( AjouterVBoxVide() );
		this.getChildren().add( AjouterBouton( rb2_Name, tg ) );
		this.getChildren().add( AjouterVBoxVide() );
		this.getChildren().add( AjouterBouton( rb3_Name, tg ) );
		this.getChildren().add( AjouterVBoxVide() );

		creerAnimation();
		animationSurvol.setCycleCount( -1 );

		installerListeners();

	}

	private void installerListeners() {
		J.appel( this );

		this.setOnMouseEntered( new EventHandler<Event>() {
			@Override
			public void handle( Event event ) {
				J.appel( this );
				animationSurvol.playFromStart();
			}
		} );
		
		this.setOnMouseExited( new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				J.appel( this );
				animationSurvol.stop();
				GC_Radiobutton.this.setOpacity( 1 );
			}
		} );

	}

	private void creerAnimation() {
		J.appel( this );

		double delaiMilisecondes = 450;
		double opaciteNormale = 1.0;
		double opaciteBasse = 0.6;

		animationSurvol.getKeyFrames()
				.add( new KeyFrame( Duration.ZERO, new KeyValue( opacityProperty(), opaciteNormale ) ) );

		animationSurvol.getKeyFrames().add(
				new KeyFrame( new Duration( delaiMilisecondes ), new KeyValue( opacityProperty(), opaciteBasse ) ) );

		animationSurvol.getKeyFrames().add( new KeyFrame( new Duration( delaiMilisecondes * 2 ),
				new KeyValue( opacityProperty(), opaciteNormale ) ) );
	}

	private RadioButton AjouterBouton( String texte, ToggleGroup tg ) {
		J.appel( this );

		RadioButton rb = new RadioButton( texte );
		rb.setToggleGroup( tg );
		rb.setMaxHeight( Double.MAX_VALUE );
		VBox.setVgrow( rb, Priority.ALWAYS );

		return rb;
	}

	private VBox AjouterVBoxVide() {
		J.appel( this );

		VBox vb = new VBox();

		vb.setMaxHeight( Double.MAX_VALUE );
		VBox.setVgrow( vb, Priority.ALWAYS );

		return vb;
	}

	private VBox AjouterVBoxTitre( String texte ) {
		J.appel( this );

		VBox vb = new VBox();

		vb.setMaxHeight( Double.MAX_VALUE );
		VBox.setVgrow( vb, Priority.ALWAYS );

		Text text = new Text( texte );
		text.getStyleClass().add( "titreToggleGroup" );

		vb.getChildren().add( text );

		return vb;

	}

}
