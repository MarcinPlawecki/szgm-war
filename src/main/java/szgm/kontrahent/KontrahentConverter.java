package szgm.kontrahent;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.kontrahent.model.Kontrahent;

public class KontrahentConverter implements Converter {

    private static BaseDao<Kontrahent> dao;

    public static void setJednostkaDao(BaseDao<Kontrahent> dao) {
		KontrahentConverter.dao = dao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Kontrahent v =  (Kontrahent)dao.find(Kontrahent.class, Long.parseLong(value));
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Kontrahent)value).getId());
    }

}

