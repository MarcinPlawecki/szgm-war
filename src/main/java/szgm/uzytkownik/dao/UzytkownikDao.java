package szgm.uzytkownik.dao;
 
import java.util.List;

import szgm.uzytkownik.model.Uzytkownik;
 
 
public interface UzytkownikDao{
	
	List<Uzytkownik> findAllUzytkownik();
 
	public Object find(String value);
}