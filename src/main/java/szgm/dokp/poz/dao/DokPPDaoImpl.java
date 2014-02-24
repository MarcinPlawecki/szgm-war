package szgm.dokp.poz.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import szgm.core.BaseDaoImpl;
import szgm.dokp.nagl.model.DokPN;
import szgm.dokp.poz.model.DokPP;

public class DokPPDaoImpl extends BaseDaoImpl<DokPP> implements Serializable,
		DokPPDao {

	private static final long serialVersionUID = 1L;

	@Override
	public List<DokPP> findAllForDocument(DokPN dok) {
		Criteria criteria = this.getSession().createCriteria(DokPP.class);

		criteria.add(Restrictions.eq("dokPN", dok));
		// criteria.addOrder(Order.asc("towar"));

		List<DokPP> ret = criteria.list();
		return ret;
	}
}