package szgm.uzytkownik.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.uzytkownik.model.Uzytkownik;
 
public class UzytkownikDaoImpl extends HibernateDaoSupport implements UzytkownikDao{
 
	public List<Uzytkownik> findAllUzytkownik(){
		return getHibernateTemplate().find("from Uzytkownik order by nazwa");
	}
	
	public Object find(String value) {
		return getHibernateTemplate().find("from Uzytkownik where id = " + value).get(0);
	}
}