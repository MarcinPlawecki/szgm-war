package szgm.towar;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.towar.model.Towar;

public class TowarConverter implements Converter {

	private static BaseDao<Towar> dao;

	public static BaseDao<Towar> getDao() {
		return dao;
	}

	public static void setDao(BaseDao<Towar> dao) {
		TowarConverter.dao = dao;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		Towar v = dao.find(Towar.class, Long.parseLong(value));
		return v;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return String.valueOf(((Towar) value).getId());
	}

}
