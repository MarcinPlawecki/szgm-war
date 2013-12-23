package szgm;

import java.io.Serializable;
import java.util.List;

import szgm.rola.model.Rola;
import szgm.uzytkownik.bo.UzytkownikBo;
import szgm.uzytkownik.model.Uzytkownik;


public class UzytkownikBean implements Serializable{

	UzytkownikBo uzytkownikBo;
	
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
	
	public void setUzytkownikBo(UzytkownikBo uzytkownikBo) {
		this.uzytkownikBo = uzytkownikBo;
	}
 
	public List<Uzytkownik> getUzytkownikList(){
		return uzytkownikBo.findAllUzytkownik();
	}
	
}
