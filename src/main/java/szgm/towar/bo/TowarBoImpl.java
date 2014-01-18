package szgm.towar.bo;
 
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import szgm.towar.dao.TowarDao;
import szgm.towar.model.Towar;
 
@ManagedBean(name="towarBo")
@SessionScoped
public class TowarBoImpl implements TowarBo, Serializable, InitializingBean {
 
	private static final long serialVersionUID = 1L;
	
	private TowarDao towarDao;
 
	public void setTowarDao(TowarDao towarDao) {
		this.towarDao = towarDao;
	}
 
	public void addTowar(Towar towar){
		towarDao.addTowar(towar);
	}
 
	public List<Towar> findAllTowar(){
		return towarDao.findAllTowar();
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(towarDao, "towarDao can't be null");
	}
}