package szgm.dokw.poz.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import szgm.core.BaseDaoImpl;
import szgm.dokw.nagl.model.DokWN;
import szgm.dokw.poz.model.DokWP;

public class DokWPDaoImpl extends BaseDaoImpl<DokWP> implements Serializable,
		DokWPDao {

	private static final long serialVersionUID = 1L;

	@Override
	public List<DokWP> findAllForDocument(DokWN dok) {
		Criteria criteria = this.getSession().createCriteria(DokWP.class);

		criteria.add(Restrictions.eq("dokWN", dok));
		// criteria.addOrder(Order.asc("towar"));

		List<DokWP> ret = criteria.list();
		return ret;
	}
}