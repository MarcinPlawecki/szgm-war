package szgm.towar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import szgm.core.BaseFacesBean;
import szgm.grupa.model.Grupa;
import szgm.jednostka.model.Jednostka;
import szgm.towar.bo.TowarBo;
import szgm.towar.model.Towar;
import szgm.vat.model.Vat;
import szgm.waluta.model.Waluta;

import com.lowagie.text.DocumentException;

@ManagedBean(name = "towar")
@RequestScoped
public class TowarBean extends BaseFacesBean<Towar> implements Serializable,
		InitializingBean {

	private static final long serialVersionUID = 1L;

	private TowarBo towarBo;

	public TowarBo getTowarBo() {
		return towarBo;
	}

	public void setTowarBo(TowarBo towarBo) {
		this.towarBo = towarBo;
	}

	private int liczbaEtykiet = 1;
	private Map<Towar, Integer> doWydruku = new HashMap<Towar, Integer>();

	private List<Towar> selectedItems = new ArrayList<Towar>();

	public List<Towar> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(List<Towar> selectedItems) {
		this.selectedItems = selectedItems;
	}

	public StreamedContent export() {
		StreamedContent file = null;
		ByteArrayOutputStream oStream = towarBo.export(selectedItems);

		InputStream stream = new ByteArrayInputStream(oStream.toByteArray());
		file = new DefaultStreamedContent(stream, "application/xml",
				"towary.xml");
		refreshList();
		clearForm();

		return file;
	}

	public void handleFileUpload(FileUploadEvent event) {
		FacesMessage msg;
		try {
			towarBo.importTowary(event.getFile().getContents());

			msg = new FacesMessage("Sukces", event.getFile().getFileName()
					+ " zosta³ wys³any.");
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage("B³¹d", event.getFile().getFileName()
					+ " nie zosta³ wys³any.");
		}

		refreshList();

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Map.Entry<Towar, Integer>> getDoWydruku() {
		Set<Map.Entry<Towar, Integer>> productSet = doWydruku.entrySet();
		return new ArrayList<Map.Entry<Towar, Integer>>(productSet);
	}

	public void setDoWydruku(Map<Towar, Integer> doWydruku) {
		this.doWydruku = doWydruku;
	}

	public int getLiczbaEtykiet() {
		return liczbaEtykiet;
	}

	public void setLiczbaEtykiet(int liczbaEtykiet) {
		this.liczbaEtykiet = liczbaEtykiet;
	}

	public void dodajEtykiete() {
		if (doWydruku == null) {
			doWydruku = new HashMap<Towar, Integer>();
		}
		// if (selectedItem != null) {
		doWydruku.put(selectedItem, liczbaEtykiet);
		// }
	}

	public StreamedContent drukujEtykiety() {
		StreamedContent file = null;
		try {
			ByteArrayOutputStream oStream = towarBo.drukuj(doWydruku);

			InputStream stream = new ByteArrayInputStream(oStream.toByteArray());
			file = new DefaultStreamedContent(stream, "application/pdf",
					"etykiety.pdf");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		refreshList();
		clearForm();

		return file;
	}

	@PostConstruct
	@Override
	public void refreshList() {
		list = towarBo.findAllByNazwa(Towar.class);
	}

	public String addTowar() {
		Towar t = new Towar();
		t.setNazwa(nazwa);
		t.setAktywny(aktywny);
		t.setCenaNetto(cenaNetto);
		t.setCenaPromocyjna(cenaPromocyjna);
		t.setCenaPrzedPromocja(cenaPrzedPromocja);
		t.setCenaZakupu(cenaZakupu);
		t.setGrupa(grupa);
		t.setJednostka(jednostka);
		t.setKodKreskowy(kodKreskowy);
		t.setNazwa(nazwa);
		t.setPkwiu(pkwiu);
		t.setPromocja(promocja);
		t.setPromocjaDo(promocjaDo);
		t.setPromocjaOd(promocjaOd);
		t.setPytajOCene(pytajOCene);
		t.setVat(vat);
		t.setWaluta(waluta);
		t.setZmodyfikowany(1);

		towarBo.add(t);
		refreshList();
		clearForm();
		return "success";
	}

	@Override
	protected void clearForm() {
		setNazwa("");
		setAktywny(0);
		setCenaNetto(0);
		setCenaPromocyjna(0);
		setCenaPrzedPromocja(0);
		setCenaZakupu(0);
		setGrupa(null);
		setJednostka(null);
		setKodKreskowy("");
		setNazwa("");
		setPkwiu("");
		setPromocja(0);
		setPromocjaDo(null);
		setPromocjaOd(null);
		setPytajOCene(0);
		setVat(null);
		setWaluta(null);
		setZmodyfikowany(1);
		setNewName("");
	}

	public void cloneItem() {
		FacesMessage msg;
		if (null != selectedItem) {
			Towar newT = new Towar();
			newT.setNazwa(this.getNewName());
			newT.setAktywny(selectedItem.getAktywny());
			newT.setCenaNetto(selectedItem.getCenaNetto());
			newT.setCenaPromocyjna(selectedItem.getCenaPromocyjna());
			newT.setCenaPrzedPromocja(selectedItem.getCenaPrzedPromocja());
			newT.setCenaZakupu(selectedItem.getCenaZakupu());
			newT.setGrupa(selectedItem.getGrupa());
			newT.setJednostka(selectedItem.getJednostka());
			newT.setKodKreskowy(selectedItem.getKodKreskowy());
			newT.setPkwiu(selectedItem.getPkwiu());
			newT.setPromocja(selectedItem.getPromocja());
			newT.setPromocjaDo(selectedItem.getPromocjaDo());
			newT.setPromocjaOd(selectedItem.getPromocjaOd());
			newT.setPytajOCene(selectedItem.getPytajOCene());
			newT.setVat(selectedItem.getVat());
			newT.setWaluta(selectedItem.getWaluta());
			newT.setZmodyfikowany(selectedItem.getZmodyfikowany());

			towarBo.add(newT);
			refreshList();
			clearForm();

			msg = new FacesMessage("Zmiany zosta³y zapisane");
		} else {
			msg = new FacesMessage("Nie wybrano wiersza do sklonowania");

		}

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(bo, "towarBo can't be null");
	}

	public String nazwa;
	public double cenaNetto;
	public Vat vat;
	public String pkwiu;
	public Jednostka jednostka;
	public Waluta waluta;
	public double cenaZakupu;
	public Integer zmodyfikowany;
	public Integer pytajOCene;
	public Integer aktywny;
	public Integer promocja;
	public Date promocjaOd;
	public Date promocjaDo;
	public double cenaPromocyjna;
	public double cenaPrzedPromocja;
	public Grupa grupa;
	public String kodKreskowy;
	public double stan;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getCenaNetto() {
		return cenaNetto;
	}

	public void setCenaNetto(double cenaNetto) {
		this.cenaNetto = cenaNetto;
	}

	public Vat getVat() {
		return vat;
	}

	public void setVat(Vat vat) {
		this.vat = vat;
	}

	public String getPkwiu() {
		return pkwiu;
	}

	public void setPkwiu(String pkwiu) {
		this.pkwiu = pkwiu;
	}

	public Jednostka getJednostka() {
		return jednostka;
	}

	public void setJednostka(Jednostka jednostka) {
		this.jednostka = jednostka;
	}

	public Waluta getWaluta() {
		return waluta;
	}

	public void setWaluta(Waluta waluta) {
		this.waluta = waluta;
	}

	public double getCenaZakupu() {
		return cenaZakupu;
	}

	public void setCenaZakupu(double cenaZakupu) {
		this.cenaZakupu = cenaZakupu;
	}

	public Integer getZmodyfikowany() {
		return zmodyfikowany;
	}

	public void setZmodyfikowany(Integer zmodyfikowany) {
		this.zmodyfikowany = zmodyfikowany;
	}

	public Integer getPytajOCene() {
		return pytajOCene;
	}

	public void setPytajOCene(Integer pytajOCene) {
		this.pytajOCene = pytajOCene;
	}

	public void setPytajOCene(boolean pytajOCene) {
		this.pytajOCene = pytajOCene ? 1 : 0;
	}

	public Integer getAktywny() {
		return aktywny;
	}

	public void setAktywny(Integer aktywny) {
		this.aktywny = aktywny;
	}

	public void setAktywny(boolean aktywny) {
		this.aktywny = aktywny ? 1 : 0;
	}

	public Integer getPromocja() {
		return promocja;
	}

	public void setPromocja(Integer promocja) {
		this.promocja = promocja;
	}

	public Date getPromocjaOd() {
		return promocjaOd;
	}

	public void setPromocjaOd(Date promocjaOd) {
		this.promocjaOd = promocjaOd;
	}

	public Date getPromocjaDo() {
		return promocjaDo;
	}

	public void setPromocjaDo(Date promocjaDo) {
		this.promocjaDo = promocjaDo;
	}

	public double getCenaPromocyjna() {
		return cenaPromocyjna;
	}

	public void setCenaPromocyjna(double cenaPromocyjna) {
		this.cenaPromocyjna = cenaPromocyjna;
	}

	public double getCenaPrzedPromocja() {
		return cenaPrzedPromocja;
	}

	public void setCenaPrzedPromocja(double cenaPrzedPromocja) {
		this.cenaPrzedPromocja = cenaPrzedPromocja;
	}

	public Grupa getGrupa() {
		return grupa;
	}

	public void setGrupa(Grupa grupa) {
		this.grupa = grupa;
	}

	public String getKodKreskowy() {
		return kodKreskowy;
	}

	public void setKodKreskowy(String kodKreskowy) {
		this.kodKreskowy = kodKreskowy;
	}

	public double getStan() {
		return stan;
	}

	public void setStan(double stan) {
		this.stan = stan;
	}

}
