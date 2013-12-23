package szgm;

import java.io.Serializable;
import java.util.List;

import szgm.waluta.bo.WalutaBo;
import szgm.waluta.model.Waluta;


public class WalutaBean implements Serializable{

	WalutaBo walutaBo;
	
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

	public void setWalutaBo(WalutaBo walutaBo) {
		this.walutaBo = walutaBo;
	}
 
	public List<Waluta> getWalutaList(){
		return walutaBo.findAllWaluta();
	}
	
}
