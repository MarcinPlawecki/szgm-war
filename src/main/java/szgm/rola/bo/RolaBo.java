package szgm.rola.bo;

import java.util.List;

import szgm.core.BaseBo;
import szgm.prawo.model.Prawo;
import szgm.rola.model.Rola;

public interface RolaBo extends BaseBo<Rola> {

	List<Prawo> getGrantedRights(Rola selectedItem);

}