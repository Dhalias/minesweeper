package minesweeper_client.controleurs;

import commun_client.mvc.controleurs.ControleurModeleVue;
import minesweeper.modeles.PartieLocale.PartieLocale;
import minesweeper.modeles.PartieLocale.PartieLocaleLectureSeule;
import minesweeper_client.afficheurs.AfficheurPartieLocale;
import minesweeper_client.vues.VuePartieLocale;

public abstract class ControleurPartieLocale<V extends VuePartieLocale, A extends AfficheurPartieLocale<V>>
extends ControleurModeleVue<PartieLocaleLectureSeule, PartieLocale, V, A> {

}
