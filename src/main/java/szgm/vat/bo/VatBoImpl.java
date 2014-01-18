package szgm.vat.bo;
 
import java.io.Serializable;
import java.util.List;

import szgm.vat.dao.VatDao;
import szgm.vat.model.Vat;
 
 
public class VatBoImpl implements VatBo, Serializable {
	 
	private static final long serialVersionUID = 1L;
		
	VatDao vatDao;
 
	public void setVatDao(VatDao vatDao) {
		this.vatDao = vatDao;
	}
 
	public List<Vat> findAllVat(){
 
		return vatDao.findAllVat();
	}
}