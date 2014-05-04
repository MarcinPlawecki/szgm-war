package szgm.dokw.nagl;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import szgm.core.BaseFacesBean;
import szgm.dokw.nagl.model.DokWN;
import szgm.kontrahent.model.Kontrahent;
import szgm.sklep.model.Sklep;
import szgm.typDokumentu.model.TypDokumentu;
import szgm.uzytkownik.model.Uzytkownik;

@ManagedBean(name = "dokWN")
@SessionScoped
public class DokWNBean extends BaseFacesBean<DokWN> implements Serializable,
		InitializingBean {

	private static final long serialVersionUID = 1L;

	@PostConstruct
	@Override
	public void refreshList() {
		list = bo.findAll(DokWN.class);
	}

	public String addDokPN() {
		DokWN d = new DokWN();

		d.setDataModyfikacji(dataModyfikacji);
		d.setDataUtworzenia(dataUtworzenia);
		d.setDataWystawienia(dataWystwienia);
		d.setKomentarz(komentarz);
		d.setKontrahent(kontrahent);
		d.setNumer(numer);
		d.setSklep(sklep);
		d.setTypDokumentu(typDokumentu);
		d.setUzytkownik(uzytkownik);

		bo.add(d);
		refreshList();
		clearForm();
		return "success";
	}

	@Override
	protected void clearForm() {
		setDataModyfikacji(null);
		setDataUtworzenia(null);
		setDataWystwienia(null);
		setKomentarz("");
		setKontrahent(null);
		setNewName("");
		setNumer("");
		setSklep(null);
		setTypDokumentu(null);
		setUzytkownik(null);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(bo, "towarBo can't be null");
	}

	public long id;
	public String numer;
	public Date dataWystwienia;
	public Sklep sklep;
	public Uzytkownik uzytkownik;
	public TypDokumentu typDokumentu;
	public String komentarz;
	public Date dataUtworzenia;
	public Date dataModyfikacji;
	// public FZN fzn;
	public Kontrahent kontrahent;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumer() {
		return numer;
	}

	public void setNumer(String numer) {
		this.numer = numer;
	}

	public Date getDataWystwienia() {
		return dataWystwienia;
	}

	public void setDataWystwienia(Date dataWystwienia) {
		this.dataWystwienia = dataWystwienia;
	}

	public Sklep getSklep() {
		return sklep;
	}

	public void setSklep(Sklep sklep) {
		this.sklep = sklep;
	}

	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}

	public void setUzytkownik(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}

	public TypDokumentu getTypDokumentu() {
		return typDokumentu;
	}

	public void setTypDokumentu(TypDokumentu typDokumentu) {
		this.typDokumentu = typDokumentu;
	}

	public String getKomentarz() {
		return komentarz;
	}

	public void setKomentarz(String komentarz) {
		this.komentarz = komentarz;
	}

	public Date getDataUtworzenia() {
		return dataUtworzenia;
	}

	public void setDataUtworzenia(Date dataUtworzenia) {
		this.dataUtworzenia = dataUtworzenia;
	}

	public Date getDataModyfikacji() {
		return dataModyfikacji;
	}

	public void setDataModyfikacji(Date dataModyfikacji) {
		this.dataModyfikacji = dataModyfikacji;
	}

	public Kontrahent getKontrahent() {
		return kontrahent;
	}

	public void setKontrahent(Kontrahent kontrahent) {
		this.kontrahent = kontrahent;
	}

}
