package szgm.dokp.poz.dao;

import java.util.List;

import szgm.core.BaseDao;
import szgm.dokp.nagl.model.DokPN;
import szgm.dokp.poz.model.DokPP;

public interface DokPPDao extends BaseDao<DokPP> {

	List<DokPP> findAllForDocument(DokPN dok);

}