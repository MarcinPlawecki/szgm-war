package szgm.jednostka.bo;
 
import java.io.Serializable;
import java.util.List;

import szgm.jednostka.dao.JednostkaDao;
import szgm.jednostka.model.Jednostka;
 
 
public class JednostkaBoImpl implements JednostkaBo, Serializable {
 
	private static final long serialVersionUID = 1L;
	
	JednostkaDao jednostkaDao;
 
	public void setJednostkaDao(JednostkaDao jednostkaDao) {
		this.jednostkaDao = jednostkaDao;
	}
 
	public List<Jednostka> findAllJednostka(){
 
		return jednostkaDao.findAllJednostka();
	}
}