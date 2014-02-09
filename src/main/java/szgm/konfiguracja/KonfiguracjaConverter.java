package szgm.konfiguracja;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.grupa.dao.GrupaDao;
import szgm.grupa.model.Grupa;
import szgm.konfiguracja.dao.KonfiguracjaDao;
import szgm.konfiguracja.model.Konfiguracja;

public class KonfiguracjaConverter implements Converter {

    private static KonfiguracjaDao konfiguracjaDao;

    public static void setKonfiguracjaDao(KonfiguracjaDao konfiguracjaDao) {
		KonfiguracjaConverter.konfiguracjaDao = konfiguracjaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Konfiguracja v =  (Konfiguracja) konfiguracjaDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Konfiguracja)value).getNazwa();
    }

}

