package szgm.waluta.dao;
 
import java.util.List;

import szgm.waluta.model.Waluta;
 
 
public interface WalutaDao{
	
	List<Waluta> findAllWaluta();
 
	public Object find(String value);
}