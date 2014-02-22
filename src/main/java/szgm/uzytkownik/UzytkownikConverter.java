package szgm.uzytkownik;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.uzytkownik.model.Uzytkownik;

public class UzytkownikConverter implements Converter {


    private static BaseDao<Uzytkownik> uzytkownikDao;

    public static void setUzytkownikDao(BaseDao<Uzytkownik> uzytkownikDao) {
		UzytkownikConverter.uzytkownikDao = uzytkownikDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Uzytkownik v =  (Uzytkownik)uzytkownikDao.find(Uzytkownik.class, Long.parseLong(value));
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Uzytkownik)value).getId());
    }

}

