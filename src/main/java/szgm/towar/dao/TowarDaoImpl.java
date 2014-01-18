package szgm.towar.dao;
 
import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.util.Assert;

import szgm.towar.model.Towar;
import szgm.towar.dao.TowarDao;

 
public class TowarDaoImpl extends HibernateDaoSupport implements TowarDao, Serializable, InitializingBean {
    	   
    private static final long serialVersionUID = 1L;
    
	public void addTowar(Towar towar){
		getHibernateTemplate().save(towar);
	}
 
	public List<Towar> findAllTowar(){
		return getHibernateTemplate().find("from Towar order by nazwa");
	}
	
}