package szgm.sklep;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.sklep.dao.SklepDao;
import szgm.sklep.model.Sklep;

public class SklepConverter implements Converter {


    private static SklepDao sklepDao;

    public static void setSklepDao(SklepDao sklepDao) {
		SklepConverter.sklepDao = sklepDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Sklep v =  (Sklep)sklepDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Sklep)value).getId());
    }

}

