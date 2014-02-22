package szgm.uzytkownik;

import java.io.Serializable;

import org.springframework.beans.factory.InitializingBean;

import szgm.core.BaseFacesBean;
import szgm.rola.model.Rola;
import szgm.uzytkownik.model.Uzytkownik;


public class UzytkownikBean extends BaseFacesBean<Uzytkownik> implements Serializable, InitializingBean {

	private static final long serialVersionUID = 1L;
	
	public String login;
	public String haslo;
	public String imie;
	public String nazwisko;
	public Rola rola;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Rola getRola() {
		return rola;
	}

	public void setRola(Rola rola) {
		this.rola = rola;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void refreshList() {
		list = bo.findAllByNazwa(Uzytkownik.class);
	}

	@Override
	protected void clearForm() {
		// TODO Auto-generated method stub
	}
	
}
