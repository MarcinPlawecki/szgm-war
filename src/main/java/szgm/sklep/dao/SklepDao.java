package szgm.sklep.dao;
 
import java.util.List;

import szgm.sklep.model.Sklep;
 
 
public interface SklepDao{
	
	List<Sklep> findAllSklep();
 
	public Object find(String value);
}