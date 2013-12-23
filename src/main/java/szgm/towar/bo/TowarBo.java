package szgm.towar.bo;
 
import java.util.List;

import szgm.towar.model.Towar;
 
 
public interface TowarBo{
 
	void addTowar(Towar towar);
 
	List<Towar> findAllTowar();
 
}