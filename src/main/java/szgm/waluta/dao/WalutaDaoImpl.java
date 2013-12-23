package szgm.waluta.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.waluta.model.Waluta;
 
public class WalutaDaoImpl extends HibernateDaoSupport implements WalutaDao{
 
	public List<Waluta> findAllWaluta(){
		return getHibernateTemplate().find("from Waluta order by glowna desc, nazwa asc");
	}

	public Object find(String value) {
		return getHibernateTemplate().find("from Waluta where id = " + value).get(0);
	}
}