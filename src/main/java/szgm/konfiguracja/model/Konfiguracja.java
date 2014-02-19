package szgm.konfiguracja.model;

import java.io.Serializable;

import szgm.core.BaseModel;

public class Konfiguracja extends BaseModel implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	public String nazwa;
	public String opis;
	public String wartosc;
	
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getWartosc() {
		return wartosc;
	}

	public void setWartosc(String wartosc) {
		this.wartosc = wartosc;
	}

	public boolean equals(Object other) {
        return other instanceof Konfiguracja ? nazwa == (((Konfiguracja) other).getNazwa()) : (other == this);
    }

    public int hashCode() {
        return this.getClass().hashCode() + ((String)nazwa).hashCode();
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