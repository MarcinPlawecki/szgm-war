package szgm.typDokumentu;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.typDokumentu.dao.TypDokumentuDao;
import szgm.typDokumentu.model.TypDokumentu;

public class TypDokumentuConverter implements Converter {


    private static TypDokumentuDao typDokumentuDao;

    public static void setTypDokumentuDao(TypDokumentuDao typDokumentuDao) {
		TypDokumentuConverter.typDokumentuDao = typDokumentuDao;
	}

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		TypDokumentu v =  (TypDokumentu)typDokumentuDao.find(value);
        return v;
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return String.valueOf(((TypDokumentu)value).getId());
    }

}

