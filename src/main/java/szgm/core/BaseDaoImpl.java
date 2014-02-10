package szgm.core;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>, Serializable, InitializingBean {
	   
private static final long serialVersionUID = 1L;

	@Override
	public List<T> findAll(Class<T> clazz) {
		return getHibernateTemplate().find("from "+ clazz.getName());
	}

	@Override
	public List<T> findAllByNazwa(Class<T> clazz) {
		return getHibernateTemplate().find("from "+ clazz.getName() + " order by nazwa");
	}
	
	@Override
	public T modify(T t) {
		getHibernateTemplate().update(t);
		return t;
	}

	@Override
	public void add(T t) {
		getHibernateTemplate().save(t);
	}

}
