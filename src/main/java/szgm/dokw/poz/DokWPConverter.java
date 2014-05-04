package szgm.dokw.poz;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.dokw.poz.model.DokWP;

public class DokWPConverter implements Converter {

	private BaseDao<DokWP> dao;

	public void setDao(BaseDao<DokWP> dao) {
		this.dao = dao;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		DokWP v = dao.find(DokWP.class, Long.parseLong(value));
		return v;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return String.valueOf(((DokWP) value).getId());
	}

}
