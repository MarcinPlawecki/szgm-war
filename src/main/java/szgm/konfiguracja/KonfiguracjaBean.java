package szgm.konfiguracja;

import java.io.Serializable;
import java.util.List;

import szgm.konfiguracja.bo.KonfiguracjaBo;
import szgm.konfiguracja.model.Konfiguracja;


public class KonfiguracjaBean implements Serializable{

	private static final long serialVersionUID = 1L;

	KonfiguracjaBo konfiguracjaBo;
	
	public String nazwa;
	public String opis;
	public String wartosc;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getWartosc() {
		return wartosc;
	}

	public void setWartosc(String wartosc) {
		this.wartosc = wartosc;
	}

	public void setKonfiguracjaBo(KonfiguracjaBo konfiguracjaBo) {
		this.konfiguracjaBo = konfiguracjaBo;
	}

	public List<Konfiguracja> getKonfiguracjaList(){
		return konfiguracjaBo.findAllKonfiguracja();
	}
	
}
