package szgm.dokw.nagl.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import szgm.core.BaseBoImpl;
import szgm.dokw.nagl.dao.DokWNDao;
import szgm.dokw.nagl.model.DokWN;

public class DokWNBoImpl extends BaseBoImpl<DokWN> implements DokWNBo,
		Serializable {

	private static final long serialVersionUID = 1L;

	private DokWNDao dokWNDao;

	@Override
	public List<DokWN> getDokW(Date dataOd, Date dataDo) {
		return dokWNDao.getDokW(dataOd, dataDo);
	}

	public void setDokWNDao(DokWNDao dokWNDao) {
		this.dokWNDao = dokWNDao;
	}

}