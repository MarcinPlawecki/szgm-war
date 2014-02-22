package szgm.rola;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.rola.model.Rola;

public class RolaConverter implements Converter {


    private static BaseDao<Rola> rolaDao;

    public static void setRolaDao(BaseDao<Rola> rolaDao) {
		RolaConverter.rolaDao = rolaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Rola v =  (Rola)rolaDao.find(Rola.class, Long.parseLong(value));
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Rola)value).getId());
    }

}

