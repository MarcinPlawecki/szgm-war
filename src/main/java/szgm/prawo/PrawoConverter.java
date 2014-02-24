package szgm.prawo;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.prawo.model.Prawo;

public class PrawoConverter implements Converter {

	private BaseDao<Prawo> dao;

	public void setDao(BaseDao<Prawo> dao) {
		this.dao = dao;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		Prawo v = dao.find(Prawo.class, Long.parseLong(value));
		return v;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return String.valueOf(((Prawo) value).getId());
	}

}
