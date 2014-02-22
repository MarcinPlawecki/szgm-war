package szgm.waluta.model;

import java.io.Serializable;

import szgm.core.BaseModel;

public class Waluta extends BaseModel implements Serializable {
	 
	private static final long serialVersionUID = 1L;
		
	public long id;
	public String nazwa;
	public String symbol;
	public double wartosc;
	public int glowna;
	
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

	public boolean equals(Object other) {
        return other instanceof Waluta ? id == (((Waluta) other).getId()) : (other == this);
    }

    public int hashCode() {
        return this.getClass().hashCode() + ((Long)id).hashCode();
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