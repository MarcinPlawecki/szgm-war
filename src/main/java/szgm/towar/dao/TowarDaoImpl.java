package szgm.towar.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.towar.model.Towar;
 
public class TowarDaoImpl extends 
       HibernateDaoSupport implements TowarDao{
 
	public void addTowar(Towar towar){
		getHibernateTemplate().save(towar);
	}
 
	public List<Towar> findAllTowar(){
		return getHibernateTemplate().find("from Towar order by nazwa");
	}
}