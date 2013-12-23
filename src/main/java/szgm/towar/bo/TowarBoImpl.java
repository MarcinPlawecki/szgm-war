package szgm.towar.bo;
 
import java.io.Serializable;
import java.util.List;

import szgm.towar.dao.TowarDao;
import szgm.towar.model.Towar;
 
 
public class TowarBoImpl implements TowarBo, Serializable {
 
	private static final long serialVersionUID = 1L;
	
	private TowarDao towarDao;
 
	public void setTowarDao(TowarDao towarDao) {
		this.towarDao = towarDao;
	}
 
	public void addTowar(Towar towar){
		towarDao.addTowar(towar);
	}
 
	public List<Towar> findAllTowar(){
		return towarDao.findAllTowar();
	}
}