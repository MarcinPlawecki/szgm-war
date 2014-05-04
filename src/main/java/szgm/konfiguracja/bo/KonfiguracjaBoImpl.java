package szgm.konfiguracja.bo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import szgm.core.BaseBoImpl;
import szgm.konfiguracja.dao.KonfiguracjaDao;
import szgm.konfiguracja.model.Konfiguracja;

@ManagedBean(name = "konfiguracjaBo")
@SessionScoped
public class KonfiguracjaBoImpl extends BaseBoImpl<Konfiguracja> implements
		KonfiguracjaBo, Serializable {

	private static final long serialVersionUID = 1L;

	KonfiguracjaDao konfDao;

	@Override
	public Konfiguracja getByNazwa(String nazwa) {
		return konfDao.getByNazwa(nazwa);
	}

	public KonfiguracjaDao getKonfDao() {
		return konfDao;
	}

	public void setKonfDao(KonfiguracjaDao konfDao) {
		this.konfDao = konfDao;
	}

}