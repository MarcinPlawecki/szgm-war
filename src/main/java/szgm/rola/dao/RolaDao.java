package szgm.rola.dao;
 
import java.util.List;

import szgm.rola.model.Rola;
 
 
public interface RolaDao{
	
	List<Rola> findAllRola();
 
	public Object find(String value);
}