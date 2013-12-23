package szgm.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.vat.dao.VatDao;
import szgm.vat.model.Vat;

public class VatConverter implements Converter {


    private static VatDao vatDao;

    public static void setVatDao(VatDao vatDao) {
		VatConverter.vatDao = vatDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Vat v =  (Vat)vatDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((Vat)value).getId());
    }

}

