package szgm.grupa;

import java.io.Serializable;
import java.util.List;

import szgm.grupa.bo.GrupaBo;
import szgm.grupa.model.Grupa;


public class GrupaBean implements Serializable{

	GrupaBo grupaBo;
	
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

	public void setGrupaBo(GrupaBo grupaBo) {
		this.grupaBo = grupaBo;
	}
 
	public List<Grupa> getGrupaList(){
		return grupaBo.findAllGrupa();
	}
	
}
