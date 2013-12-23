package szgm.vat.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.vat.model.Vat;
 
public class VatDaoImpl extends HibernateDaoSupport implements VatDao{
 
	public List<Vat> findAllVat(){
		return getHibernateTemplate().find("from Vat order by stawka desc");
	}
	
	public Object find(String value) {
		return getHibernateTemplate().find("from Vat where id = " + value).get(0);
	}
}