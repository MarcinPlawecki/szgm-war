package szgm.rola.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import szgm.core.BaseDaoImpl;
import szgm.prawo.model.Prawo;
import szgm.rola.model.Rola;

public class RolaDaoImpl extends BaseDaoImpl<Rola> implements RolaDao,
		Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public List<Prawo> getGrantedRights(Rola selectedItem) {
		Criteria criteria = this.getSession().createCriteria(Prawo.class);

		criteria.add(Restrictions.eq("rola", selectedItem));

		List<Prawo> ret = criteria.list();
		return ret;
	}

}