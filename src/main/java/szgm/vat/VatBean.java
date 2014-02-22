package szgm.vat;

import java.io.Serializable;

import org.springframework.beans.factory.InitializingBean;

import szgm.core.BaseFacesBean;
import szgm.vat.model.Vat;

public class VatBean extends BaseFacesBean<Vat> implements Serializable, InitializingBean {

	private static final long serialVersionUID = 1L;
	
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

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void refreshList() {
		list = bo.findAllByNazwa(Vat.class);
	}

	@Override
	protected void clearForm() {
		// TODO Auto-generated method stub
	}
	
}
