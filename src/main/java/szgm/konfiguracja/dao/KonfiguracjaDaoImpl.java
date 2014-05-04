package szgm.konfiguracja.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import szgm.core.BaseDaoImpl;
import szgm.konfiguracja.model.Konfiguracja;
import szgm.utils.collections.CollectionUtils;

public class KonfiguracjaDaoImpl extends BaseDaoImpl<Konfiguracja> implements
		KonfiguracjaDao, Serializable {

	private static final long serialVersionUID = 1L;

	public Konfiguracja getByNazwa(String nazwa) {

		DetachedCriteria criteria = DetachedCriteria
				.forClass(Konfiguracja.class);

		criteria.add(Restrictions.ilike("nazwa", nazwa));

		List<Konfiguracja> list = getHibernateTemplate().findByCriteria(
				criteria);

		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		}

		return null;
	}

}