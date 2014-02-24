package szgm.dokp.poz;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import szgm.core.BaseDao;
import szgm.dokp.poz.model.DokPP;

public class DokPPConverter implements Converter {

	private BaseDao<DokPP> dao;

	public void setDao(BaseDao<DokPP> dao) {
		this.dao = dao;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		DokPP v = dao.find(DokPP.class, Long.parseLong(value));
		return v;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return String.valueOf(((DokPP) value).getId());
	}

}
