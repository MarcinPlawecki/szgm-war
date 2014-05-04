package szgm.dokw.poz.model;

import java.io.Serializable;

import szgm.core.BaseModel;
import szgm.dokw.nagl.model.DokWN;
import szgm.towar.model.Towar;

public class DokWP extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public long id;
	public DokWN dokWN;
	public Towar towar;
	public double ilosc;
	public double cenaZakupuNetto;
	public double cenaSprzedazyNetto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DokWN getDokWN() {
		return dokWN;
	}

	public void setDokWN(DokWN dokWN) {
		this.dokWN = dokWN;
	}

	public Towar getTowar() {
		return towar;
	}

	public void setTowar(Towar towar) {
		this.towar = towar;
	}

	public double getIlosc() {
		return ilosc;
	}

	public void setIlosc(double ilosc) {
		this.ilosc = ilosc;
	}

	public double getCenaZakupuNetto() {
		return cenaZakupuNetto;
	}

	public void setCenaZakupuNetto(double cenaZakupuNetto) {
		this.cenaZakupuNetto = cenaZakupuNetto;
	}

	public double getCenaSprzedazyNetto() {
		return cenaSprzedazyNetto;
	}

	public void setCenaSprzedazyNetto(double cenaSprzedazyNetto) {
		this.cenaSprzedazyNetto = cenaSprzedazyNetto;
	}

	@Override
	public Object getIdentifier() {
		return this.getId();
	}

	@Override
	public String getIdentifierAsString() {
		return String.valueOf(this.getId());
	}
}