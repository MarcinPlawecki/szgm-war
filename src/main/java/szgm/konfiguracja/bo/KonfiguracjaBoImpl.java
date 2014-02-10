package szgm.konfiguracja.bo;
 
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import szgm.konfiguracja.dao.KonfiguracjaDao;
import szgm.konfiguracja.model.Konfiguracja;
 
@ManagedBean(name="konfiguracjaBo")
@SessionScoped
public class KonfiguracjaBoImpl implements KonfiguracjaBo, Serializable {
 
	private static final long serialVersionUID = 1L;
	
	private KonfiguracjaDao konfiguracjaDao;
 
	public void setKonfiguracjaDao(KonfiguracjaDao konfiguracjaDao) {
		this.konfiguracjaDao = konfiguracjaDao;
	}
 
	public List<Konfiguracja> findAllKonfiguracja(){
 
		return konfiguracjaDao.findAllKonfiguracja();
	}
}