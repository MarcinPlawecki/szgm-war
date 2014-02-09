package szgm.konfiguracja.dao;
 
import java.io.Serializable;
import java.util.List;
 


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.konfiguracja.model.Konfiguracja;
 
public class KonfiguracjaDaoImpl extends HibernateDaoSupport implements KonfiguracjaDao, Serializable {
	 
	private static final long serialVersionUID = 1L;
 
	public List<Konfiguracja> findAllKonfiguracja(){
		return getHibernateTemplate().find("from Konfiguracja order by nazwa asc");
	}
	
	public Object find(String value) {
		return getHibernateTemplate().find("from Konfiguracja where nazwa = " + value).get(0);
	}
	
}