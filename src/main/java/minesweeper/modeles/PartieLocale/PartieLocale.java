package minesweeper.modeles.PartieLocale;

import java.util.ArrayList;

import commun.modeles.Modele;
import javafx.scene.control.Button;

public class PartieLocale extends Modele<PartieLocaleLectureSeule> implements PartieLocaleLectureSeule{

	ArrayList<Integer> listeBouton = new ArrayList<>();
	
	@Override
	public ArrayList<Integer> getBoutonsUtilise() {
		return this.listeBouton;
	}
	
	public void ajouterBouton(int idBtn) {
		this.getBoutonsUtilise().add( idBtn );
	}

}
