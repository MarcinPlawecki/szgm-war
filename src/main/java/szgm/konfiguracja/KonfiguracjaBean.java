package szgm.konfiguracja;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import szgm.core.BaseFacesBean;
import szgm.konfiguracja.bo.KonfiguracjaBo;
import szgm.konfiguracja.model.Konfiguracja;

@ManagedBean(name = "konfiguracja")
@ViewScoped
public class KonfiguracjaBean extends BaseFacesBean<Konfiguracja> implements
		Serializable {

	private static final long serialVersionUID = 1L;

	private KonfiguracjaBo konfBo;

	@PostConstruct
	@Override
	public void refreshList() {
		list = bo.findAllByNazwa(Konfiguracja.class);
	}

	public String addKonfiguracja() {
		Konfiguracja k = new Konfiguracja();
		k.setNazwa(nazwa);
		k.setOpis(opis);
		k.setWartosc(wartosc);
		bo.add(k);

		refreshList();

		clearForm();

		return "success";
	}

	@Override
	protected void clearForm() {
		setNazwa("");
		setOpis("");
		setWartosc("");
		setNewName("");
	}

	public void cloneItem() {
		FacesMessage msg;
		if (null != selectedItem) {
			Konfiguracja newK = new Konfiguracja();
			newK.setNazwa(this.getNewName());
			newK.setOpis(selectedItem.getOpis());
			newK.setWartosc(selectedItem.getWartosc());

			bo.add(newK);
			refreshList();
			clearForm();

			msg = new FacesMessage("Zmiany zosta³y zapisane");
		} else {
			msg = new FacesMessage("Nie wybrano wiersza do sklonowania");

		}

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String getFieldRegex(String fieldName) {
		Konfiguracja k = konfBo.getByNazwa(fieldName);

		if (null == k) {
			return ".*";
		} else {
			return k.getWartosc();
		}
	}

	private String nazwa;
	private String opis;
	private String wartosc;

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

	public KonfiguracjaBo getKonfBo() {
		return konfBo;
	}

	public void setKonfBo(KonfiguracjaBo konfBo) {
		this.konfBo = konfBo;
	}

}
