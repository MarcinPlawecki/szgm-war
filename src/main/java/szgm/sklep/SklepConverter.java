package szgm.sklep;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.sklep.model.Sklep;

public class SklepConverter implements Converter {


    private static BaseDao<Sklep> sklepDao;

    public static void setSklepDao(BaseDao<Sklep> sklepDao) {
		SklepConverter.sklepDao = sklepDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Sklep v =  (Sklep)sklepDao.find(Sklep.class, Long.parseLong(value));
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Sklep)value).getId());
    }

}

