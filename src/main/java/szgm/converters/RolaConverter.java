package szgm.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.rola.dao.RolaDao;
import szgm.rola.model.Rola;

public class RolaConverter implements Converter {


    private static RolaDao rolaDao;

    public static void setRolaDao(RolaDao rolaDao) {
		RolaConverter.rolaDao = rolaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Rola v =  (Rola)rolaDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Rola)value).getId());
    }

}

