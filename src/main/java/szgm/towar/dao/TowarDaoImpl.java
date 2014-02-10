package szgm.towar.dao;
 
import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.util.Assert;

import szgm.core.BaseDaoImpl;
import szgm.towar.model.Towar;
import szgm.towar.dao.TowarDao;

 
public class TowarDaoImpl<Towar> extends BaseDaoImpl<Towar> implements Serializable {
    	   
    private static final long serialVersionUID = 1L;
	
}