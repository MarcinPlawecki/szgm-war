package szgm.grupa;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.grupa.dao.GrupaDao;
import szgm.grupa.model.Grupa;

public class GrupaConverter implements Converter {


    private static GrupaDao grupaDao;

    public static void setGrupaDao(GrupaDao grupaDao) {
		GrupaConverter.grupaDao = grupaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Grupa v =  (Grupa)grupaDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Grupa)value).getId());
    }

}

