package szgm.rola.bo;

import java.io.Serializable;
import java.util.List;

import szgm.core.BaseBoImpl;
import szgm.prawo.model.Prawo;
import szgm.rola.dao.RolaDao;
import szgm.rola.model.Rola;

public class RolaBoImpl extends BaseBoImpl<Rola> implements RolaBo,
		Serializable {

	private static final long serialVersionUID = 1L;

	RolaDao rolaDao;

	public RolaDao getRolaDao() {
		return rolaDao;
	}

	public void setRolaDao(RolaDao rolaDao) {
		this.rolaDao = rolaDao;
	}

	@Override
	public List<Prawo> getGrantedRights(Rola selectedItem) {
		return rolaDao.getGrantedRights(selectedItem);
	}

}