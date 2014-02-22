package szgm.konfiguracja;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.konfiguracja.model.Konfiguracja;

public class KonfiguracjaConverter implements Converter {

    private static BaseDao<Konfiguracja> konfiguracjaDao;

    public static void setKonfiguracjaDao(BaseDao<Konfiguracja> konfiguracjaDao) {
		KonfiguracjaConverter.konfiguracjaDao = konfiguracjaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Konfiguracja v =  (Konfiguracja) konfiguracjaDao.find(Konfiguracja.class, value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Konfiguracja)value).getNazwa();
    }

}

