package szgm.konfiguracja.bo;
 
import java.util.List;

import szgm.konfiguracja.model.Konfiguracja;
import szgm.towar.model.Towar;
 
 
public interface KonfiguracjaBo{

	List<Konfiguracja> findAllKonfiguracja();
	
	void addTowar(Towar towar);
}