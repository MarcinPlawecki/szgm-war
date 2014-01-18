package szgm.vat.model;

import java.io.Serializable;

public class Vat implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	public long id;
	public double stawka;
	public String tekst;
	public String nazwa;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	
	public boolean equals(Object other) {
        return other instanceof Vat ? id == (((Vat) other).getId()) : (other == this);
    }

    public int hashCode() {
        return this.getClass().hashCode() + ((Long)id).hashCode();
    }
    
}