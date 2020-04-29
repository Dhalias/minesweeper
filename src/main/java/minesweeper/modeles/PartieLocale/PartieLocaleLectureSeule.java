package minesweeper.modeles.PartieLocale;

import java.util.ArrayList;

import commun.modeles.ModeleLectureSeule;
import javafx.scene.control.Button;

public interface PartieLocaleLectureSeule extends ModeleLectureSeule{
	ArrayList<int[]> getBoutonsUtilise();
}
