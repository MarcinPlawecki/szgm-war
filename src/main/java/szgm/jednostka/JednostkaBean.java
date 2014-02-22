package szgm.jednostka;

import java.io.Serializable;

import org.springframework.beans.factory.InitializingBean;

import szgm.core.BaseFacesBean;
import szgm.jednostka.model.Jednostka;


public class JednostkaBean extends BaseFacesBean<Jednostka> implements Serializable, InitializingBean {

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
		list = bo.findAllByNazwa(Jednostka.class);
	}

	@Override
	protected void clearForm() {
		// TODO Auto-generated method stub
	}
	
}
