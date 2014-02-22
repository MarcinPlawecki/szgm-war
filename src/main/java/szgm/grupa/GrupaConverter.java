package szgm.grupa;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.grupa.model.Grupa;

public class GrupaConverter implements Converter {


    private static BaseDao<Grupa> grupaDao;

    public static void setGrupaDao(BaseDao<Grupa> grupaDao) {
		GrupaConverter.grupaDao = grupaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Grupa v =  (Grupa)grupaDao.find(Grupa.class, Long.parseLong(value));
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Grupa)value).getId());
    }

}

