package szgm.core;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

public abstract class BaseFacesBean<T extends BaseModel> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected BaseBo<T> bo;
	
	protected List<T> list;
	protected List<T> filteredList;
	protected T selectedItem;
	protected String newName;
	
	@PostConstruct
	public abstract void refreshList();
	
	protected abstract void clearForm();
	
    public void delete() { 
    	bo.delete(selectedItem); 
    	refreshList();
    	clearForm();
    }
    
    public void onEdit(RowEditEvent event) {
    	bo.update(((T) event.getObject()));
    	
        FacesMessage msg = new FacesMessage("Zmiany zosta³y zapisane", ((T) event.getObject()).getIdentifierAsString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Zmiany zosta³y anulowane", ((T) event.getObject()).getIdentifierAsString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public BaseBo<T> getBo() {
		return bo;
	}

	public void setBo(BaseBo<T> bo) {
		this.bo = bo;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public List<T> getFilteredList() {
		return filteredList;
	}

	public void setFilteredList(List<T> filteredList) {
		this.filteredList = filteredList;
	}

	public T getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(T selectedItem) {
		this.selectedItem = selectedItem;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}
    
}
