package szgm.towar.bo;

import java.util.Map;

import szgm.core.BaseBo;
import szgm.towar.model.Towar;

public interface TowarBo extends BaseBo<Towar> {

	void drukuj(Map<Towar, Integer> doWydruku);

}