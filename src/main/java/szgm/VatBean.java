package szgm;

import java.io.Serializable;
import java.util.List;

import szgm.vat.bo.VatBo;
import szgm.vat.model.Vat;


public class VatBean implements Serializable{

	VatBo vatBo;
	
	public double stawka;
	public String tekst;
	public String nazwa;

	public double getStawka() {
		return stawka;
	}

	public void setStawka(double stawka) {
		this.stawka = stawka;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public void setVatBo(VatBo vatBo) {
		this.vatBo = vatBo;
	}
 
	public List<Vat> getVatList(){
		return vatBo.findAllVat();
	}
	
}
