package minesweeper_client.afficheurs;

import commun_client.mvc.Afficheur;
import minesweeper.modeles.PartieLocale.PartieLocaleLectureSeule;
import minesweeper_client.vues.VuePartieLocale;

public abstract class  AfficheurPartieLocale <V extends VuePartieLocale> extends Afficheur<PartieLocaleLectureSeule, V>  {

}
