package szgm.core;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;

public class BaseBoImpl<T> implements BaseBo<T>, InitializingBean {

	protected BaseDao<T> dao;

	@Override
	public List<T> findAll(Class<T> clazz) {
		return dao.findAll(clazz);
	}

	@Override
	public List<T> findAllByNazwa(Class<T> clazz) {
		return dao.findAll(clazz);
	}

	@Override
	public T update(T t) {
		return dao.update(t);
	}

	@Override
	public T update(T t, Object id) {
		return dao.update(t, id);
	}

	@Override
	public void add(T t) {
		dao.add(t);
	}

	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	}

	@Override
	public void delete(T t) {
		dao.delete(t);
	}

	@Override
	public void delete(List<T> ts) {
		dao.delete(ts);
	}

}
