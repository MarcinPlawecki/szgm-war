package szgm.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.uzytkownik.dao.UzytkownikDao;
import szgm.uzytkownik.model.Uzytkownik;

public class UzytkownikConverter implements Converter {


    private static UzytkownikDao uzytkownikDao;

    public static void setUzytkownikDao(UzytkownikDao uzytkownikDao) {
		UzytkownikConverter.uzytkownikDao = uzytkownikDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Uzytkownik v =  (Uzytkownik)uzytkownikDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Uzytkownik)value).getId());
    }

}

