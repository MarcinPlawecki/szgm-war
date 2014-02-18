package szgm.konfiguracja;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import szgm.core.BaseBo;
import szgm.konfiguracja.model.Konfiguracja;

@ManagedBean(name = "konfiguracja")
@ViewScoped
public class KonfiguracjaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{konfiguracjaBo}")
	BaseBo<Konfiguracja> konfiguracjaBo;

	private String nazwa;
	private String opis;
	private String wartosc;
	private String newName;

	private List<Konfiguracja> list;
	private List<Konfiguracja> filteredList;
	private Konfiguracja selectedItem;

	public KonfiguracjaBean() {
	}

	@PostConstruct
	public void refreshList() {
			list = konfiguracjaBo.findAllByNazwa(Konfiguracja.class);
	}

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

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public void setKonfiguracjaBo(BaseBo<Konfiguracja> konfiguracjaBo) {
		this.konfiguracjaBo = konfiguracjaBo;
	}

	public List<Konfiguracja> getList() {
		return list;
	}

	public void setList(List<Konfiguracja> list) {
		this.list = list;
	}

	public List<Konfiguracja> getFilteredList() {
		return filteredList;
	}

	public void setFilteredList(List<Konfiguracja> filteredList) {
		this.filteredList = filteredList;
	}

	public Konfiguracja getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(Konfiguracja selectedItem) {
		this.selectedItem = selectedItem;
	}

	public String addKonfiguracja() {
		Konfiguracja k = new Konfiguracja();
		k.setNazwa(nazwa);
		k.setOpis(opis);
		k.setWartosc(wartosc);
		konfiguracjaBo.add(k);

		refreshList();

		clearForm();

		return "success";
	}

	private void clearForm() {
		setNazwa("");
		setOpis("");
		setWartosc("");
		setNewName("");
	}
	
    public void onEdit(RowEditEvent event) {
    	konfiguracjaBo.update(((Konfiguracja) event.getObject()));
    	
        FacesMessage msg = new FacesMessage("Zmiany zosta³y zapisane", ((Konfiguracja) event.getObject()).getNazwa());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Zmiany zosta³y anulowane", ((Konfiguracja) event.getObject()).getNazwa());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void delete() { 
    	konfiguracjaBo.delete(selectedItem); 
    	refreshList();
    	clearForm();
    }
    
    public void cloneItem() {
    	FacesMessage msg;
    	if(null != selectedItem) {
    		Konfiguracja newK = new Konfiguracja();
    		newK.setNazwa(this.getNewName());
    		newK.setOpis(selectedItem.getOpis());
    		newK.setWartosc(selectedItem.getWartosc());
    		
    		konfiguracjaBo.add(newK);
    		refreshList();
    		clearForm();
    		
    		msg = new FacesMessage("Zmiany zosta³y anulowane");
    	} else {
    		msg = new FacesMessage("Nie wybrano wiersza do sklonowania");
    		
    	}
    	
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
    
}
