package szgm.dokw.poz.bo;

import java.io.Serializable;
import java.util.List;

import szgm.core.BaseBoImpl;
import szgm.dokw.nagl.model.DokWN;
import szgm.dokw.poz.dao.DokWPDao;
import szgm.dokw.poz.model.DokWP;

public class DokWPBoImpl extends BaseBoImpl<DokWP> implements DokWPBo,
		Serializable {

	private static final long serialVersionUID = 1L;

	private DokWPDao dokWPDao;

	public DokWPDao getDokWPDao() {
		return dokWPDao;
	}

	public void setDokWPDao(DokWPDao dokWPDao) {
		this.dokWPDao = dokWPDao;
	}

	@Override
	public List<DokWP> findAllForDocument(DokWN dok) {
		return dokWPDao.findAllForDocument(dok);
	}
}