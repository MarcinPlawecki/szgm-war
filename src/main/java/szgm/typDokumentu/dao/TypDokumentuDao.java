package szgm.typDokumentu.dao;
 
import java.util.List;

import szgm.typDokumentu.model.TypDokumentu;
 
 
public interface TypDokumentuDao{
	
	List<TypDokumentu> findAllTypDokumentu();
 
	public Object find(String value);
}