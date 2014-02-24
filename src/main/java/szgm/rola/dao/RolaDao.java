package szgm.rola.dao;

import java.util.List;

import szgm.core.BaseDao;
import szgm.prawo.model.Prawo;
import szgm.rola.model.Rola;

public interface RolaDao extends BaseDao<Rola> {

	List<Prawo> getGrantedRights(Rola selectedItem);
}