package szgm.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.jednostka.dao.JednostkaDao;
import szgm.jednostka.model.Jednostka;

public class JednostkaConverter implements Converter {


    private static JednostkaDao jednostkaDao;

    public static void setJednostkaDao(JednostkaDao jednostkaDao) {
		JednostkaConverter.jednostkaDao = jednostkaDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Jednostka v =  (Jednostka)jednostkaDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Jednostka)value).getId());
    }

}

