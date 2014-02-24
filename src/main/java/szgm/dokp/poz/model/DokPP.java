package szgm.dokp.poz.model;

import java.io.Serializable;

import szgm.core.BaseModel;
import szgm.dokp.nagl.model.DokPN;
import szgm.towar.model.Towar;

public class DokPP extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public long id;
	public DokPN dokPN;
	public Towar towar;
	public double iloscCalosc;
	public double iloscPozostala;
	public double iloscDoSciagniecia;
	public double cenaZakupuNetto;
	public int aktywny;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DokPN getDokPN() {
		return dokPN;
	}

	public void setDokPN(DokPN dokPN) {
		this.dokPN = dokPN;
	}

	public Towar getTowar() {
		return towar;
	}

	public void setTowar(Towar towar) {
		this.towar = towar;
	}

	public double getIloscCalosc() {
		return iloscCalosc;
	}

	public void setIloscCalosc(double iloscCalosc) {
		this.iloscCalosc = iloscCalosc;
	}

	public double getIloscPozostala() {
		return iloscPozostala;
	}

	public void setIloscPozostala(double iloscPozostala) {
		this.iloscPozostala = iloscPozostala;
	}

	public double getIloscDoSciagniecia() {
		return iloscDoSciagniecia;
	}

	public void setIloscDoSciagniecia(double iloscDoSciagniecia) {
		this.iloscDoSciagniecia = iloscDoSciagniecia;
	}

	public double getCenaZakupuNetto() {
		return cenaZakupuNetto;
	}

	public void setCenaZakupuNetto(double cenaZakupuNetto) {
		this.cenaZakupuNetto = cenaZakupuNetto;
	}

	public int getAktywny() {
		return aktywny;
	}

	public void setAktywny(int aktywny) {
		this.aktywny = aktywny;
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