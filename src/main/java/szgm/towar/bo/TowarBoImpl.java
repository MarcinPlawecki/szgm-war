package szgm.towar.bo;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import szgm.core.BaseBoImpl;
import szgm.towar.model.Towar;

@ManagedBean(name = "towarBo")
@SessionScoped
public class TowarBoImpl extends BaseBoImpl<Towar> implements TowarBo,
		Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public void drukuj(Map<Towar, Integer> doWydruku) {
		// TODO Auto-generated method stub
	}

}