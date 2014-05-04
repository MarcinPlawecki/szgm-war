package szgm.dokw.poz.dao;

import java.util.List;

import szgm.core.BaseDao;
import szgm.dokw.nagl.model.DokWN;
import szgm.dokw.poz.model.DokWP;

public interface DokWPDao extends BaseDao<DokWP> {

	List<DokWP> findAllForDocument(DokWN dok);

}