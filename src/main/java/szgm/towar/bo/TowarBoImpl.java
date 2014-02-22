package szgm.towar.bo;
 
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import szgm.core.BaseBoImpl;
import szgm.towar.model.Towar;
 
@ManagedBean(name="towarBo")
@SessionScoped
public class TowarBoImpl<Towar> extends BaseBoImpl<Towar> implements Serializable {

	private static final long serialVersionUID = 1L;
	
}