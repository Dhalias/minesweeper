/**
 * 
 */
package minesweeper.vues.composants;

import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.util.Duration;
import javafx.event.*;
import java.util.ArrayList;
import commun.debogage.J;
import javafx.beans.NamedArg;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.animation.*;

public class GC_Radiobutton extends VBox {

	private Timeline animationSurvol = new Timeline();
	private ToggleGroup tg = new ToggleGroup();
	private ArrayList<RadioButton> rbList = new ArrayList<>();

	public GC_Radiobutton( @NamedArg("rb1") String rb1_Name, @NamedArg("rb2") String rb2_Name,
			@NamedArg("rb3") String rb3_Name, @NamedArg("title") String title, @NamedArg("id") String idGeneral ) {

		super();
		J.appel( this );
		

		this.getChildren().add( AjouterVBoxTitre( title ) );
		this.getChildren().add( AjouterBouton( rb1_Name, tg, (idGeneral+"1") ));
		this.getChildren().add( AjouterVBoxVide() );
		this.getChildren().add( AjouterBouton( rb2_Name, tg, (idGeneral+"2") ) );
		this.getChildren().add( AjouterVBoxVide() );
		this.getChildren().add( AjouterBouton( rb3_Name, tg, (idGeneral+"3") ) );
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

	private RadioButton AjouterBouton( String texte, ToggleGroup tg, String id ) {
		J.appel( this );

		RadioButton rb = new RadioButton( texte );
		rb.setToggleGroup( tg );
		rb.setMaxHeight( Double.MAX_VALUE );
		VBox.setVgrow( rb, Priority.ALWAYS );
		rb.setId( id );
		rbList.add( rb );

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
	
	public ArrayList<RadioButton> getRbList(){
		J.appel( this );
		return this.rbList;
	}
	
	private RadioButton getSelectedRb() {
		J.appel( this );
		RadioButton rb = null;
		
		for ( RadioButton radioButton : this.getRbList() ) {
			if ( radioButton.isSelected() ) {
				rb = radioButton;
				break;
			}
		}
		
		return rb;
	}
	
	public int getSelectedValue() {
		J.appel( this );
		RadioButton rb = this.getSelectedRb();
		String rbId = rb.getId();
		int value = Integer.parseInt( String.valueOf(rbId.charAt( rbId.length() - 1 )));

		
		switch ( value ) {
		case 1:
			value = 1;
			break;
		case 2:
			value = 2;
			break;
		case 3:
			value = 3;
			break;
		}
		
		return value;
	}
	

}
