package szgm.typDokumentu;

import java.io.Serializable;
import java.util.List;

import szgm.typDokumentu.bo.TypDokumentuBo;
import szgm.typDokumentu.model.TypDokumentu;


public class TypDokumentuBean implements Serializable{

	TypDokumentuBo typDokumentuBo;
	
	public String nazwa;


	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void setTypDokumentuBo(TypDokumentuBo typDokumentuBo) {
		this.typDokumentuBo = typDokumentuBo;
	}
 
	public List<TypDokumentu> getTypDokumentuList(){
		return typDokumentuBo.findAllTypDokumentu();
	}
	
}
