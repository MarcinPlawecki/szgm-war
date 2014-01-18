package szgm.grupa.dao;
 
import java.io.Serializable;
import java.util.List;
 

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.grupa.model.Grupa;
 
public class GrupaDaoImpl extends HibernateDaoSupport implements GrupaDao, Serializable {
	 
	private static final long serialVersionUID = 1L;
 
	public List<Grupa> findAllGrupa(){
		return getHibernateTemplate().find("from Grupa order by nazwa asc");
	}
	
	public Object find(String value) {
		return getHibernateTemplate().find("from Grupa where id = " + value).get(0);
	}
	
}