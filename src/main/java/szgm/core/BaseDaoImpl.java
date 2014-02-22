package szgm.core;

import java.io.Serializable;
import java.util.List;

import org.hibernate.ReplicationMode;
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
	public T find(Class<T> clazz, Serializable id) {
		return getHibernateTemplate().get(clazz, id);
	}
	
	@Override
	public T update(T t) {
		getHibernateTemplate().merge(t);
		return t;
	}
	
	@Override
	public T update(T t, Object id) {
		getHibernateTemplate().update(t);
		return t;
	}

	@Override
	public void add(T t) {
		getHibernateTemplate().save(t);
		
	}

	@Override
	public void delete(T t) {
		getHibernateTemplate().delete(t);
	}

	@Override
	public void delete(List<T> ts) {
		getHibernateTemplate().deleteAll(ts);
	}

}
