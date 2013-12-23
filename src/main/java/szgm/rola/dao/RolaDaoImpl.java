package szgm.rola.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.rola.model.Rola;
 
public class RolaDaoImpl extends HibernateDaoSupport implements RolaDao{
 
	public List<Rola> findAllRola(){
		return getHibernateTemplate().find("from Rola order by nazwa");
	}
	
	public Object find(String value) {
		return getHibernateTemplate().find("from Rola where id = " + value).get(0);
	}
}