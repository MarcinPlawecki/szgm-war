package szgm.vat.dao;
 
import java.util.List;

import szgm.vat.model.Vat;
 
 
public interface VatDao{
	
	List<Vat> findAllVat();

	public Object find(String value);
 
}