package szgm.uzytkownik.bo;
 
import java.util.List;

import szgm.uzytkownik.model.Uzytkownik;
 
 
public interface UzytkownikBo{

	List<Uzytkownik> findAllUzytkownik();
 
}