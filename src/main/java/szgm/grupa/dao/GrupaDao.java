package szgm.grupa.dao;
 
import java.util.List;

import szgm.grupa.model.Grupa;
 
 
public interface GrupaDao{
	
	List<Grupa> findAllGrupa();
 
	public Object find(String value);
	
}