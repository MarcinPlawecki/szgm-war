package szgm.uzytkownik.model;

import szgm.rola.model.Rola;

public class Uzytkownik{
	
	public long id;
	public String login;
	public String haslo;
	public String imie;
	public String nazwisko;
	public Rola rola;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public boolean equals(Object other) {
        return other instanceof Uzytkownik ? id == (((Uzytkownik) other).getId()) : (other == this);
    }

    public int hashCode() {
        return this.getClass().hashCode() + ((Long)id).hashCode();
    }
}