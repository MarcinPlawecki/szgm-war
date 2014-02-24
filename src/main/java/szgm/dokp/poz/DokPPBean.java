package szgm.dokp.poz;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import szgm.core.BaseFacesBean;
import szgm.dokp.nagl.model.DokPN;
import szgm.dokp.poz.bo.DokPPBo;
import szgm.dokp.poz.model.DokPP;
import szgm.towar.model.Towar;

@ManagedBean(name = "dokPP")
@SessionScoped
public class DokPPBean extends BaseFacesBean<DokPP> implements Serializable,
		InitializingBean {

	private static final long serialVersionUID = 1L;

	private DokPPBo dokPPBo;

	private List<DokPP> listByDok;

	public DokPPBo getDokPPBo() {
		return dokPPBo;
	}

	public void setDokPPBo(DokPPBo dokPPBo) {
		this.dokPPBo = dokPPBo;
	}

	@PostConstruct
	@Override
	public void refreshList() {
		list = dokPPBo.findAll(DokPP.class);
	}

	public List<DokPP> listByDok(DokPN dok) {
		if (null == dok) {
			return Collections.EMPTY_LIST;
		}
		listByDok = dokPPBo.findAllForDocument(dok);
		return listByDok;
	}

	public String addDokPP() {
		DokPP d = new DokPP();

		d.setDokPN(dokPN);
		d.setTowar(towar);
		d.setIloscCalosc(iloscCalosc);
		d.setIloscDoSciagniecia(iloscDoSciagniecia);
		d.setIloscPozostala(iloscPozostala);
		d.setCenaZakupuNetto(cenaZakupuNetto);
		d.setAktywny(aktywny);

		bo.add(d);
		refreshList();
		clearForm();
		return "success";
	}

	@Override
	protected void clearForm() {
		setDokPN(null);
		setTowar(null);
		setIloscCalosc(0);
		setIloscDoSciagniecia(0);
		setIloscPozostala(0);
		setCenaZakupuNetto(0);
		setAktywny(0);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(bo, "Bo can't be null");
	}

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

}
