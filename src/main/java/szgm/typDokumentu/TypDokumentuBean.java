package szgm.typDokumentu;

import java.io.Serializable;

import org.springframework.beans.factory.InitializingBean;

import szgm.core.BaseFacesBean;
import szgm.typDokumentu.model.TypDokumentu;


public class TypDokumentuBean extends BaseFacesBean<TypDokumentu> implements Serializable, InitializingBean {

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
		list = bo.findAllByNazwa(TypDokumentu.class);
	}
	
	@Override
	protected void clearForm() {
		// TODO Auto-generated method stub
	}
	
	
	
}
