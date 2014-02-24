package szgm.rola;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import szgm.core.BaseFacesBean;
import szgm.prawo.model.Prawo;
import szgm.rola.bo.RolaBo;
import szgm.rola.model.Rola;

public class RolaBean extends BaseFacesBean<Rola> implements Serializable,
		InitializingBean {

	private static final long serialVersionUID = 1L;

	private RolaBo rolaBo;

	public RolaBo getRolaBo() {
		return rolaBo;
	}

	public void setRolaBo(RolaBo rolaBo) {
		this.rolaBo = rolaBo;
	}

	private List<Prawo> przyznanePrawa;

	public List<Prawo> getPrzyznanePrawa() {
		if (null == selectedItem) {
			return Collections.EMPTY_LIST;
		}
		przyznanePrawa = new ArrayList<Prawo>(selectedItem.getPrawa());
		return przyznanePrawa;
	}

	public void setPrzyznanePrawa(List<Prawo> przyznanePrawa) {
		this.przyznanePrawa = przyznanePrawa;
	}

	@PostConstruct
	@Override
	public void refreshList() {
		list = rolaBo.findAllByNazwa(Rola.class);
	}

	public String addRola(List<Prawo> selectedPrawa) {
		Rola t = new Rola();
		t.setNazwa(nazwa);
		this.prawa = new HashSet<Prawo>(selectedPrawa);
		t.setPrawa(prawa);

		rolaBo.add(t);
		refreshList();
		clearForm();
		return "success";
	}

	@Override
	protected void clearForm() {
		setNazwa("");
		setNewName("");
		setPrawa(null);
	}

	public void cloneItem() {
		FacesMessage msg;
		if (null != selectedItem) {
			Rola newT = new Rola();
			newT.setNazwa(this.getNewName());

			Set<Prawo> newSet = new HashSet<Prawo>(selectedItem.prawa);
			newT.setPrawa(newSet);

			rolaBo.add(newT);
			refreshList();
			clearForm();

			msg = new FacesMessage("Zmiany zosta³y zapisane");
		} else {
			msg = new FacesMessage("Nie wybrano wiersza do sklonowania");

		}

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void updatePrawa() {
		FacesMessage msg;
		if (null != selectedItem) {

			Set<Prawo> newSet = new HashSet<Prawo>(przyznanePrawa);
			selectedItem.setPrawa(newSet);

			rolaBo.update(selectedItem);
			refreshList();
			clearForm();

			msg = new FacesMessage("Zmiany zosta³y zapisane");
		} else {
			msg = new FacesMessage("Nie wybrano wiersza do sklonowania");

		}

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(bo, "bo can't be null");
	}

	public String nazwa;
	public Set<Prawo> prawa;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Set<Prawo> getPrawa() {
		return prawa;
	}

	public void setPrawa(Set<Prawo> prawa) {
		this.prawa = prawa;
	}

}
