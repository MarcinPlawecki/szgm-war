package szgm.typDokumentu.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.typDokumentu.model.TypDokumentu;
 
public class TypDokumentuDaoImpl extends HibernateDaoSupport implements TypDokumentuDao{
 
	public List<TypDokumentu> findAllTypDokumentu(){
		return getHibernateTemplate().find("from TypDokumentu order by nazwa");
	}
	
	public Object find(String value) {
		return getHibernateTemplate().find("from TypDokumentu where id = " + value).get(0);
	}
}