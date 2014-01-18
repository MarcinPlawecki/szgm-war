package szgm.towar.model;

import java.io.Serializable;
import java.util.Date;

import szgm.grupa.model.Grupa;
import szgm.jednostka.model.Jednostka;
import szgm.vat.model.Vat;
import szgm.waluta.model.Waluta;

public class Towar implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	public long id;
	public String nazwa;
	public double cenaNetto;
	public Vat vat;
	public String pkwiu;
	public Jednostka jednostka;
	public Waluta waluta;
	public Double cenaZakupu;
	public Integer zmodyfikowany;
	public Integer pytajOCene;
	public Integer aktywny;
	public Integer promocja;
	public Date promocjaOd;
	public Date promocjaDo;
	public Double cenaPromocyjna;
	public Double cenaPrzedPromocja;
	public Grupa grupa;
	public String kodKreskowy;
	public Double stan;
	
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
	public double getCenaNetto() {
		return cenaNetto;
	}
	public void setCenaNetto(double cenaNetto) {
		this.cenaNetto = cenaNetto;
	}
	public Vat getVat() {
		return vat;
	}
	public void setVat(Vat vat) {
		this.vat = vat;
	}
	public String getPkwiu() {
		return pkwiu;
	}
	public void setPkwiu(String pkwiu) {
		this.pkwiu = pkwiu;
	}
	public Jednostka getJednostka() {
		return jednostka;
	}
	public void setJednostka(Jednostka jednostka) {
		this.jednostka = jednostka;
	}
	public Waluta getWaluta() {
		return waluta;
	}
	public void setWaluta(Waluta waluta) {
		this.waluta = waluta;
	}
	public Double getCenaZakupu() {
		return cenaZakupu;
	}
	public void setCenaZakupu(Double cenaZakupu) {
		this.cenaZakupu = cenaZakupu;
	}
	public Integer getZmodyfikowany() {
		return zmodyfikowany;
	}
	public void setZmodyfikowany(Integer zmodyfikowany) {
		this.zmodyfikowany = zmodyfikowany;
	}
	public Integer getPytajOCene() {
		return pytajOCene;
	}
	public void setPytajOCene(Integer pytajOCene) {
		this.pytajOCene = pytajOCene;
	}
	public Integer getAktywny() {
		return aktywny;
	}
	public void setAktywny(Integer aktywny) {
		this.aktywny = aktywny;
	}
	public Integer getPromocja() {
		return promocja;
	}
	public void setPromocja(Integer promocja) {
		this.promocja = promocja;
	}
	public Date getPromocjaOd() {
		return promocjaOd;
	}
	public void setPromocjaOd(Date promocjaOd) {
		this.promocjaOd = promocjaOd;
	}
	public Date getPromocjaDo() {
		return promocjaDo;
	}
	public void setPromocjaDo(Date promocjaDo) {
		this.promocjaDo = promocjaDo;
	}
	public Double getCenaPromocyjna() {
		return cenaPromocyjna;
	}
	public void setCenaPromocyjna(Double cenaPromocyjna) {
		this.cenaPromocyjna = cenaPromocyjna;
	}
	public Double getCenaPrzedPromocja() {
		return cenaPrzedPromocja;
	}
	public void setCenaPrzedPromocja(Double cenaPrzedPromocja) {
		this.cenaPrzedPromocja = cenaPrzedPromocja;
	}
	public Grupa getGrupa() {
		return grupa;
	}
	public void setGrupa(Grupa grupa) {
		this.grupa = grupa;
	}
	public String getKodKreskowy() {
		return kodKreskowy;
	}
	public void setKodKreskowy(String kodKreskowy) {
		this.kodKreskowy = kodKreskowy;
	}
	public Double getStan() {
		return stan;
	}
	public void setStan(Double stan) {
		this.stan = stan;
	}
	
}