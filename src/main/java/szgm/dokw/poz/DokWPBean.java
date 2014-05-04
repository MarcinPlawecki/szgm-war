package szgm.dokw.poz;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import szgm.core.BaseFacesBean;
import szgm.dokw.nagl.model.DokWN;
import szgm.dokw.poz.bo.DokWPBo;
import szgm.dokw.poz.model.DokWP;
import szgm.towar.model.Towar;

@ManagedBean(name = "dokWP")
@SessionScoped
public class DokWPBean extends BaseFacesBean<DokWP> implements Serializable,
		InitializingBean {

	private static final long serialVersionUID = 1L;

	private DokWPBo dokWPBo;

	private List<DokWP> listByDok;

	public DokWPBo getDokWPBo() {
		return dokWPBo;
	}

	public void setDokWPBo(DokWPBo dokWPBo) {
		this.dokWPBo = dokWPBo;
	}

	@PostConstruct
	@Override
	public void refreshList() {
		list = dokWPBo.findAll(DokWP.class);
	}

	public List<DokWP> listByDok(DokWN dok) {
		if (null == dok) {
			return Collections.EMPTY_LIST;
		}
		listByDok = dokWPBo.findAllForDocument(dok);
		return listByDok;
	}

	// public String addDokPP() {
	// DokWP d = new DokWP();
	//
	// d.setDokPN(dokPN);
	// d.setTowar(towar);
	// d.setIloscCalosc(iloscCalosc);
	// d.setIloscDoSciagniecia(iloscDoSciagniecia);
	// d.setIloscPozostala(iloscPozostala);
	// d.setCenaZakupuNetto(cenaZakupuNetto);
	// d.setAktywny(aktywny);
	//
	// bo.add(d);
	// refreshList();
	// clearForm();
	// return "success";
	// }

	@Override
	protected void clearForm() {
		setDokWN(null);
		setTowar(null);
		setIlosc(0);
		setCenaZakupuNetto(0);
		setCenaSprzedazyNetto(0);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(bo, "Bo can't be null");
	}

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

	public double getCenaZakupuNetto() {
		return cenaZakupuNetto;
	}

	public void setCenaZakupuNetto(double cenaZakupuNetto) {
		this.cenaZakupuNetto = cenaZakupuNetto;
	}

	public double getIlosc() {
		return ilosc;
	}

	public void setIlosc(double ilosc) {
		this.ilosc = ilosc;
	}

	public double getCenaSprzedazyNetto() {
		return cenaSprzedazyNetto;
	}

	public void setCenaSprzedazyNetto(double cenaSprzedazyNetto) {
		this.cenaSprzedazyNetto = cenaSprzedazyNetto;
	}

}
