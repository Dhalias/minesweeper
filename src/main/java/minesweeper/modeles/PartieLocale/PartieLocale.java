package minesweeper.modeles.PartieLocale;

import java.util.ArrayList;

import commun.modeles.Modele;
import javafx.scene.control.Button;

public class PartieLocale extends Modele<PartieLocaleLectureSeule> implements PartieLocaleLectureSeule{

	ArrayList<int[]> listeBouton = new ArrayList<>();
	
	@Override
	public ArrayList<int[]> getBoutonsUtilise() {
		return this.listeBouton;
	}
	
	public void ajouterBouton(int indexColonne, int indexLigne) {
		int[] emplacement = {indexColonne,indexLigne};
		this.getBoutonsUtilise().add( emplacement );
	}

}
