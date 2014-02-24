package szgm.dokp.nagl;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.dokp.nagl.model.DokPN;

public class DokPNConverter implements Converter {

	private BaseDao<DokPN> dao;

	public void setDao(BaseDao<DokPN> dao) {
		this.dao = dao;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		DokPN v = dao.find(DokPN.class, Long.parseLong(value));
		return v;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return String.valueOf(((DokPN) value).getId());
	}

}
