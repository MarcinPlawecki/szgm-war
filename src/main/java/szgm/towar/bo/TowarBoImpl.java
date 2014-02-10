package szgm.towar.bo;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import szgm.core.BaseBoImpl;
import szgm.towar.model.Towar;
 
@ManagedBean(name="towarBo")
@SessionScoped
public class TowarBoImpl<Towar> extends BaseBoImpl<Towar> {
	
}