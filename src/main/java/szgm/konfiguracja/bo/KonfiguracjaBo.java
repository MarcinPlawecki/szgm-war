package szgm.konfiguracja.bo;

import szgm.core.BaseBo;
import szgm.konfiguracja.model.Konfiguracja;

public interface KonfiguracjaBo extends BaseBo<Konfiguracja> {

	public Konfiguracja getByNazwa(String nazwa);
}