package szgm.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.waluta.dao.WalutaDao;
import szgm.waluta.model.Waluta;

public class WalutaConverter implements Converter {


    private static WalutaDao walutaDao;

    public static void setWalutaDao(WalutaDao walutaDao) {
		WalutaConverter.walutaDao = walutaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Waluta v =  (Waluta)walutaDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Waluta)value).getId());
    }

}

