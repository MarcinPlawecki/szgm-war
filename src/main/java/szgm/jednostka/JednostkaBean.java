package szgm.jednostka;

import java.io.Serializable;
import java.util.List;

import szgm.jednostka.bo.JednostkaBo;
import szgm.jednostka.model.Jednostka;


public class JednostkaBean implements Serializable{

	JednostkaBo jednostkaBo;
	
	public String nazwa;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public void setJednostkaBo(JednostkaBo jednostkaBo) {
		this.jednostkaBo = jednostkaBo;
	}
 
	public List<Jednostka> getJednostkaList(){
		return jednostkaBo.findAllJednostka();
	}
	
}
