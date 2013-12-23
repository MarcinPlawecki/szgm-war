package szgm.towar.dao;
 
import java.util.List;

import szgm.towar.model.Towar;
 
 
public interface TowarDao{
 
	void addTowar(Towar towar);
 
	List<Towar> findAllTowar();
 
}