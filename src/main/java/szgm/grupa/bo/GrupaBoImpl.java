package szgm.grupa.bo;
 
import java.io.Serializable;
import java.util.List;

import szgm.grupa.dao.GrupaDao;
import szgm.grupa.model.Grupa;
 
 
public class GrupaBoImpl implements GrupaBo, Serializable {
 
	private static final long serialVersionUID = 1L;
	
	private GrupaDao grupaDao;
 
	public void setGrupaDao(GrupaDao grupaDao) {
		this.grupaDao = grupaDao;
	}
 
	public List<Grupa> findAllGrupa(){
 
		return grupaDao.findAllGrupa();
	}
}