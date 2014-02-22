package szgm.rola;

import java.io.Serializable;

import org.springframework.beans.factory.InitializingBean;

import szgm.core.BaseFacesBean;
import szgm.rola.model.Rola;

public class RolaBean extends BaseFacesBean<Rola> implements Serializable, InitializingBean {

	private static final long serialVersionUID = 1L;
	
	public String nazwa;


	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void refreshList() {
		list = bo.findAllByNazwa(Rola.class);
	}
	
	@Override
	protected void clearForm() {
		// TODO Auto-generated method stub
	}
	
}
