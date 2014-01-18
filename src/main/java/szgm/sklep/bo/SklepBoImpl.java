package szgm.sklep.bo;
 
import java.util.List;

import szgm.sklep.dao.SklepDao;
import szgm.sklep.model.Sklep;
 
 
public class SklepBoImpl implements SklepBo{
 
	SklepDao sklepDao;
 
	public void setSklepDao(SklepDao sklepDao) {
		this.sklepDao = sklepDao;
	}
 
	public List<Sklep> findAllSklep(){
 
		return sklepDao.findAllSklep();
	}
}