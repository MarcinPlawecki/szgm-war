package szgm.sklep.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.sklep.model.Sklep;
 
public class SklepDaoImpl extends HibernateDaoSupport implements SklepDao{
 
	public List<Sklep> findAllSklep(){
		return getHibernateTemplate().find("from Sklep order by nazwa");
	}
	
	public Object find(String value) {
		return getHibernateTemplate().find("from Sklep where id = " + value).get(0);
	}
}