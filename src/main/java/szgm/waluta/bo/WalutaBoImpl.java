package szgm.waluta.bo;
 
import java.io.Serializable;
import java.util.List;

import szgm.waluta.dao.WalutaDao;
import szgm.waluta.model.Waluta;
 
 
public class WalutaBoImpl implements WalutaBo, Serializable {
	 
	private static final long serialVersionUID = 1L;
 
	WalutaDao walutaDao;
 
	public void setWalutaDao(WalutaDao walutaDao) {
		this.walutaDao = walutaDao;
	}
 
	public List<Waluta> findAllWaluta(){
 
		return walutaDao.findAllWaluta();
	}
}