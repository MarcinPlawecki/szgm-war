package szgm.dokw.nagl.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import szgm.core.BaseDaoImpl;
import szgm.dokw.nagl.model.DokWN;

public class DokWNDaoImpl extends BaseDaoImpl<DokWN> implements DokWNDao,
		Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public List<DokWN> getDokW(Date dataOd, Date dataDo) {
		DetachedCriteria criteria = DetachedCriteria.forClass(DokWN.class);

		criteria.add(Restrictions.between("dataWystawienia", dataOd, dataDo));

		List<DokWN> list = getHibernateTemplate().findByCriteria(criteria);

		return list;
	}
}