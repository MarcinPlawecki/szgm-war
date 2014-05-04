package szgm.dokw.nagl;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.dokw.nagl.model.DokWN;

public class DokWNConverter implements Converter {

	private BaseDao<DokWN> dao;

	public void setDao(BaseDao<DokWN> dao) {
		this.dao = dao;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		DokWN v = dao.find(DokWN.class, Long.parseLong(value));
		return v;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return String.valueOf(((DokWN) value).getId());
	}

}
