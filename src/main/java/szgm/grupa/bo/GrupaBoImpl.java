package szgm.grupa.bo;
 
import java.util.List;

import szgm.grupa.dao.GrupaDao;
import szgm.grupa.model.Grupa;
 
 
public class GrupaBoImpl implements GrupaBo{
 
	GrupaDao grupaDao;
 
	public void setGrupaDao(GrupaDao grupaDao) {
		this.grupaDao = grupaDao;
	}
 
	public List<Grupa> findAllGrupa(){
 
		return grupaDao.findAllGrupa();
	}
}