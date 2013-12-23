package szgm.uzytkownik.bo;
 
import java.util.List;

import szgm.uzytkownik.dao.UzytkownikDao;
import szgm.uzytkownik.model.Uzytkownik;
 
 
public class UzytkownikBoImpl implements UzytkownikBo{
 
	UzytkownikDao uzytkownikDao;
 
	public void setUzytkownikDao(UzytkownikDao uzytkownikDao) {
		this.uzytkownikDao = uzytkownikDao;
	}
 
	public List<Uzytkownik> findAllUzytkownik(){
 
		return uzytkownikDao.findAllUzytkownik();
	}
}