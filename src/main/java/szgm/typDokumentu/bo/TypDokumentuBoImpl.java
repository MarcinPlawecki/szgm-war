package szgm.typDokumentu.bo;
 
import java.util.List;

import szgm.typDokumentu.dao.TypDokumentuDao;
import szgm.typDokumentu.model.TypDokumentu;
 
 
public class TypDokumentuBoImpl implements TypDokumentuBo{
 
	TypDokumentuDao typDokumentuDao;
 
	public void setTypDokumentuDao(TypDokumentuDao typDokumentuDao) {
		this.typDokumentuDao = typDokumentuDao;
	}
 
	public List<TypDokumentu> findAllTypDokumentu(){
 
		return typDokumentuDao.findAllTypDokumentu();
	}
}