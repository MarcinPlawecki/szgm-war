package szgm.konfiguracja.dao;
 
import java.util.List;

import szgm.konfiguracja.model.Konfiguracja;
 
 
public interface KonfiguracjaDao{
	
	List<Konfiguracja> findAllKonfiguracja();
 
	public Object find(String value);
	
}