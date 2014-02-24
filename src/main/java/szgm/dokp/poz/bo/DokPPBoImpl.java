package szgm.dokp.poz.bo;

import java.io.Serializable;
import java.util.List;

import szgm.core.BaseBoImpl;
import szgm.dokp.nagl.model.DokPN;
import szgm.dokp.poz.dao.DokPPDao;
import szgm.dokp.poz.model.DokPP;

public class DokPPBoImpl extends BaseBoImpl<DokPP> implements DokPPBo,
		Serializable {

	private static final long serialVersionUID = 1L;

	private DokPPDao dokPPDao;

	public DokPPDao getDokPPDao() {
		return dokPPDao;
	}

	public void setDokPPDao(DokPPDao dokPPDao) {
		this.dokPPDao = dokPPDao;
	}

	@Override
	public List<DokPP> findAllForDocument(DokPN dok) {
		return dokPPDao.findAllForDocument(dok);
	}
}