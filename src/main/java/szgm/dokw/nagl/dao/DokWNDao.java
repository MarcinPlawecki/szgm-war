package szgm.dokw.nagl.dao;

import java.util.Date;
import java.util.List;

import szgm.core.BaseDao;
import szgm.dokw.nagl.model.DokWN;

public interface DokWNDao extends BaseDao<DokWN> {

	List<DokWN> getDokW(Date dataOd, Date dataDo);

}