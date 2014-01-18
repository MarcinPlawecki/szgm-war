package szgm.jednostka.dao;
 
import java.util.List;

import szgm.jednostka.model.Jednostka;
 
 
public interface JednostkaDao{
	
	List<Jednostka> findAllJednostka();
 
	public Object find(String value);
}