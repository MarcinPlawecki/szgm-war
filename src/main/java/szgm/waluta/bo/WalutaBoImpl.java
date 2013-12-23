package szgm.waluta.bo;
 
import java.util.List;

import szgm.waluta.dao.WalutaDao;
import szgm.waluta.model.Waluta;
 
 
public class WalutaBoImpl implements WalutaBo{
 
	WalutaDao walutaDao;
 
	public void setWalutaDao(WalutaDao walutaDao) {
		this.walutaDao = walutaDao;
	}
 
	public List<Waluta> findAllWaluta(){
 
		return walutaDao.findAllWaluta();
	}
}