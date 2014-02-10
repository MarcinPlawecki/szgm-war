package szgm.konfiguracja;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import szgm.core.BaseBo;
import szgm.konfiguracja.model.Konfiguracja;

@ManagedBean(name="konfiguracja")
@SessionScoped
public class KonfiguracjaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{konfiguracjaBo}")
	BaseBo<Konfiguracja> konfiguracjaBo;
	
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

	public void setKonfiguracjaBo(BaseBo<Konfiguracja> konfiguracjaBo) {
		this.konfiguracjaBo = konfiguracjaBo;
	}

	public List<Konfiguracja> getKonfiguracjaList(){
		return konfiguracjaBo.findAllByNazwa(Konfiguracja.class);
	}
	
	public String addKonfiguracja(){
		Konfiguracja k = new Konfiguracja();
		k.setNazwa(nazwa);
		k.setOpis(opis);
		k.setWartosc(wartosc);		
		konfiguracjaBo.add(k);
		
		clearForm();
		
		return "success";
	}

	private void clearForm(){
		setNazwa("");
		setOpis("");
		setWartosc("");
	}
}
