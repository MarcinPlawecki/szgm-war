package szgm.core;

import java.util.List;

public interface BaseDao<T> {

	public List<T> findAll(Class<T> clazz);
	
	public List<T> findAllByNazwa(Class<T> clazz);
	
	public T update(T t);
	
	public void add (T t);
	
	public void delete(T t);
	
	public void delete(List<T> ts);
	
	public T update(T t, Object id);
}
