package szgm.core;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class BaseBoImpl<T>  implements BaseBo<T>, InitializingBean {

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
	public T modify(T t) {
		return dao.modify(t);
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
		Assert.notNull(dao, "daoBean is not set!");
	}

}
