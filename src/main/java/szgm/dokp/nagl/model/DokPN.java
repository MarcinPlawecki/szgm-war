package szgm.dokp.nagl.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import szgm.core.BaseModel;
import szgm.dokp.poz.model.DokPP;
import szgm.kontrahent.model.Kontrahent;
import szgm.sklep.model.Sklep;
import szgm.typDokumentu.model.TypDokumentu;
import szgm.uzytkownik.model.Uzytkownik;

public class DokPN extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public long id;
	public String numer;
	public Date dataWystawienia;
	public Sklep sklep;
	public Uzytkownik uzytkownik;
	public TypDokumentu typDokumentu;
	public String komentarz;
	public Date dataUtworzenia;
	public Date dataModyfikacji;
	public Kontrahent kontrahent;
	public Set<DokPP> pozycje;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumer() {
		return numer;
	}

	public void setNumer(String numer) {
		this.numer = numer;
	}

	public Date getDataWystawienia() {
		return dataWystawienia;
	}

	public void setDataWystawienia(Date dataWystawienia) {
		this.dataWystawienia = dataWystawienia;
	}

	public Sklep getSklep() {
		return sklep;
	}

	public void setSklep(Sklep sklep) {
		this.sklep = sklep;
	}

	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}

	public void setUzytkownik(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}

	public TypDokumentu getTypDokumentu() {
		return typDokumentu;
	}

	public void setTypDokumentu(TypDokumentu typDokumentu) {
		this.typDokumentu = typDokumentu;
	}

	public String getKomentarz() {
		return komentarz;
	}

	public void setKomentarz(String komentarz) {
		this.komentarz = komentarz;
	}

	public Date getDataUtworzenia() {
		return dataUtworzenia;
	}

	public void setDataUtworzenia(Date dataUtworzenia) {
		this.dataUtworzenia = dataUtworzenia;
	}

	public Date getDataModyfikacji() {
		return dataModyfikacji;
	}

	public void setDataModyfikacji(Date dataModyfikacji) {
		this.dataModyfikacji = dataModyfikacji;
	}

	public Kontrahent getKontrahent() {
		return kontrahent;
	}

	public void setKontrahent(Kontrahent kontrahent) {
		this.kontrahent = kontrahent;
	}

	public Set<DokPP> getPozycje() {
		return pozycje;
	}

	public void setPozycje(Set<DokPP> pozycje) {
		this.pozycje = pozycje;
	}

	@Override
	public Object getIdentifier() {
		return this.getNumer();
	}

	@Override
	public String getIdentifierAsString() {
		return this.getNumer();
	}

}