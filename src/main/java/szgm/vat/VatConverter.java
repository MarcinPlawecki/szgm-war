package szgm.vat;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.vat.model.Vat;

public class VatConverter implements Converter {

    private static BaseDao<Vat> vatDao;

    public static void setVatDao(BaseDao<Vat> vatDao) {
		VatConverter.vatDao = vatDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Vat v =  (Vat)vatDao.find(Vat.class, Long.parseLong(value));
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Vat)value).getId());
    }

}

