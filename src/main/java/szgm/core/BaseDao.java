package szgm.core;

import java.util.List;

public interface BaseDao<T> {

	public List<T> findAll(Class<T> clazz);
	
	public List<T> findAllByNazwa(Class<T> clazz);
	
	public T modify(T t);
	
	public void add (T t);
	
}
