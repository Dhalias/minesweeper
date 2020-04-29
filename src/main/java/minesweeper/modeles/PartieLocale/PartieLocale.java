package minesweeper.modeles.PartieLocale;

import java.util.ArrayList;

import commun.debogage.J;
import commun.modeles.Modele;
import javafx.scene.control.Button;

public class PartieLocale extends Modele<PartieLocaleLectureSeule> implements PartieLocaleLectureSeule{

	ArrayList<int[]> listeBouton = new ArrayList<>();
	int[][] tableauJeu;
	
	@Override
	public ArrayList<int[]> getBoutonsUtilise() {
		J.appel( this );
		return this.listeBouton;
	}
	
	public void ajouterBouton(int indexColonne, int indexLigne) {
		J.appel( this );
		int[] emplacement = {indexColonne,indexLigne};
		this.getBoutonsUtilise().add( emplacement );
	}
	
	public void setTableauJeu(int[][] tableauJeu) {
		J.appel( this );
		this.tableauJeu = tableauJeu;
	}
	
	public int[][] getTableauJeu() {
		J.appel( this );
		return this.tableauJeu;
	}

}
