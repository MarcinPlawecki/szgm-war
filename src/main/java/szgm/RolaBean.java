package szgm;

import java.io.Serializable;
import java.util.List;

import szgm.rola.bo.RolaBo;
import szgm.rola.model.Rola;


public class RolaBean implements Serializable{

	RolaBo rolaBo;
	
	public String nazwa;


	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void setRolaBo(RolaBo rolaBo) {
		this.rolaBo = rolaBo;
	}
 
	public List<Rola> getRolaList(){
		return rolaBo.findAllRola();
	}
	
}
