package szgm.waluta;

import java.io.Serializable;

import org.springframework.beans.factory.InitializingBean;

import szgm.core.BaseFacesBean;
import szgm.waluta.model.Waluta;


public class WalutaBean extends BaseFacesBean<Waluta> implements Serializable, InitializingBean {

	private static final long serialVersionUID = 1L;
	
	public String nazwa;
	public String symbol;
	public double wartosc;
	public int glowna;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getWartosc() {
		return wartosc;
	}

	public void setWartosc(double wartosc) {
		this.wartosc = wartosc;
	}

	public int getGlowna() {
		return glowna;
	}

	public void setGlowna(int glowna) {
		this.glowna = glowna;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void refreshList() {
		list = bo.findAllByNazwa(Waluta.class);
	}

	@Override
	protected void clearForm() {
		// TODO Auto-generated method stub
	}
	
}
