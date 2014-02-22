package szgm.grupa;

import java.io.Serializable;

import org.springframework.beans.factory.InitializingBean;

import szgm.core.BaseFacesBean;
import szgm.grupa.model.Grupa;


public class GrupaBean extends BaseFacesBean<Grupa> implements Serializable, InitializingBean {

	private static final long serialVersionUID = 1L;
	
	public String nazwa;
	public Grupa rodzic;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Grupa getRodzic() {
		return rodzic;
	}

	public void setRodzic(Grupa rodzic) {
		this.rodzic = rodzic;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void refreshList() {
		list = bo.findAllByNazwa(Grupa.class);
	}

	@Override
	protected void clearForm() {
		// TODO Auto-generated method stub
	}
	
}
