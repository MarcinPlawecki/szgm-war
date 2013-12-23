package szgm.jednostka.bo;
 
import java.util.List;

import szgm.jednostka.dao.JednostkaDao;
import szgm.jednostka.model.Jednostka;
 
 
public class JednostkaBoImpl implements JednostkaBo{
 
	JednostkaDao jednostkaDao;
 
	public void setJednostkaDao(JednostkaDao jednostkaDao) {
		this.jednostkaDao = jednostkaDao;
	}
 
	public List<Jednostka> findAllJednostka(){
 
		return jednostkaDao.findAllJednostka();
	}
}