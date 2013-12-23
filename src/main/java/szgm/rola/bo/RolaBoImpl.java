package szgm.rola.bo;
 
import java.util.List;

import szgm.rola.dao.RolaDao;
import szgm.rola.model.Rola;
 
 
public class RolaBoImpl implements RolaBo{
 
	RolaDao rolaDao;
 
	public void setRolaDao(RolaDao rolaDao) {
		this.rolaDao = rolaDao;
	}
 
	public List<Rola> findAllRola(){
 
		return rolaDao.findAllRola();
	}
}