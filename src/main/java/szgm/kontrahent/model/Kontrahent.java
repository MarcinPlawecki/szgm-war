package szgm.kontrahent.model;

import java.io.Serializable;

import szgm.core.BaseModel;

public class Kontrahent extends BaseModel implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	 
	public long id;
	public String nazwa;
	public String nip;
	public String kontoBankowe;
	public String email;
	public String kraj;
	public String miasto;
	public String ulica;
	public String numerMieszkania;
	public String kodPocztowy;
	public String regon;
	public String telefon;
	public String nazwaSkrocona;
	public Integer liczbaDni;
	public Integer aktywny;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getKontoBankowe() {
		return kontoBankowe;
	}

	public void setKontoBankowe(String kontoBankowe) {
		this.kontoBankowe = kontoBankowe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNumerMieszkania() {
		return numerMieszkania;
	}

	public void setNumerMieszkania(String numerMieszkania) {
		this.numerMieszkania = numerMieszkania;
	}

	public String getKodPocztowy() {
		return kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getRegon() {
		return regon;
	}

	public void setRegon(String regon) {
		this.regon = regon;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getNazwaSkrocona() {
		return nazwaSkrocona;
	}

	public void setNazwaSkrocona(String nazwaSkrocona) {
		this.nazwaSkrocona = nazwaSkrocona;
	}

	public Integer getLiczbaDni() {
		return liczbaDni;
	}

	public void setLiczbaDni(Integer liczbaDni) {
		this.liczbaDni = liczbaDni;
	}

	public Integer getAktywny() {
		return aktywny;
	}

	public void setAktywny(Integer aktywny) {
		this.aktywny = aktywny;
	}

	@Override
	public Object getIdentifier() {
		return this.getNazwa();
	}
	
	@Override
	public String getIdentifierAsString() {
		return this.getNazwa();
	}
}