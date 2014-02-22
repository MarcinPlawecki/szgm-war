package szgm.waluta;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.waluta.model.Waluta;

public class WalutaConverter implements Converter {


    private static BaseDao<Waluta> walutaDao;

    public static void setWalutaDao(BaseDao<Waluta> walutaDao) {
		WalutaConverter.walutaDao = walutaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Waluta v =  (Waluta)walutaDao.find(Waluta.class, Long.parseLong(value));
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Waluta)value).getId());
    }

}

