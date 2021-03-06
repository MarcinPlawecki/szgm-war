package szgm.core;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends BaseModel> {

	public List<T> findAll(Class<T> clazz);

	public List<T> findAllByNazwa(Class<T> clazz);

	public T find(Class<T> clazz, Serializable id);

	public T update(T t);

	public void delete(T t);

	public void delete(List<T> ts);

	public T update(T t, Object id);

	public void add(BaseModel bm);
}
