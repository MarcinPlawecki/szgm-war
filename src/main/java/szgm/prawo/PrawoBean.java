package szgm.prawo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.InitializingBean;

import szgm.core.BaseFacesBean;
import szgm.prawo.model.Prawo;
import szgm.rola.model.Rola;

public class PrawoBean extends BaseFacesBean<Prawo> implements Serializable,
		InitializingBean {

	private static final long serialVersionUID = 1L;

	public List<Prawo> selectedItems;

	public List<Prawo> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(List<Prawo> selectedItems) {
		this.selectedItems = selectedItems;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	}

	@Override
	public void refreshList() {
		list = bo.findAllByNazwa(Prawo.class);
	}

	@Override
	protected void clearForm() {
		nazwa = "";
		opis = "";
		role = null;
	}

	public String nazwa;
	public String opis;
	public Set<Rola> role;

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

	public Set<Rola> getRole() {
		return role;
	}

	public void setRole(Set<Rola> role) {
		this.role = role;
	}

}
