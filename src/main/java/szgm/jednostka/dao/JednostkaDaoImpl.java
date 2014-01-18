package szgm.jednostka.dao;
 
import java.io.Serializable;
import java.util.List;
 

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.jednostka.model.Jednostka;
 
public class JednostkaDaoImpl extends HibernateDaoSupport implements JednostkaDao, Serializable {
	 
	private static final long serialVersionUID = 1L;
 
	public List<Jednostka> findAllJednostka(){
		return getHibernateTemplate().find("from Jednostka order by nazwa");
	}
	
	public Object find(String value) {
		return getHibernateTemplate().find("from Jednostka where id = " + value).get(0);
	}
}