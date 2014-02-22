package szgm.jednostka;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.jednostka.model.Jednostka;

public class JednostkaConverter implements Converter {


    private static BaseDao<Jednostka> jednostkaDao;

    public static void setJednostkaDao(BaseDao<Jednostka> jednostkaDao) {
		JednostkaConverter.jednostkaDao = jednostkaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Jednostka v =  (Jednostka)jednostkaDao.find(Jednostka.class, Long.parseLong(value));
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Jednostka)value).getId());
    }

}

