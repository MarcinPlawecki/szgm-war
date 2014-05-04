package szgm.towar.bo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.transaction.annotation.Transactional;

import szgm.core.BaseBoImpl;
import szgm.pdf.etykiety.EtykietyPdfGenerator;
import szgm.towar.dao.TowarDao;
import szgm.towar.model.Towar;

import com.lowagie.text.DocumentException;

@ManagedBean(name = "towarBo")
@SessionScoped
public class TowarBoImpl extends BaseBoImpl<Towar> implements TowarBo,
		Serializable {

	private static final long serialVersionUID = 1L;

	EtykietyPdfGenerator etykietyPdfGenerator;

	TowarDao towarDao;

	public EtykietyPdfGenerator getEtykietyPdfGenerator() {
		return etykietyPdfGenerator;
	}

	public void setEtykietyPdfGenerator(
			EtykietyPdfGenerator etykietyPdfGenerator) {
		this.etykietyPdfGenerator = etykietyPdfGenerator;
	}

	@Override
	public ByteArrayOutputStream drukuj(Map<Towar, Integer> doWydruku)
			throws DocumentException, IOException {
		return etykietyPdfGenerator.generate(doWydruku);
	}

	@Override
	@Transactional
	public ByteArrayOutputStream export(List<Towar> selectedItems) {
		return towarDao.export(selectedItems);
	}

	@Override
	@Transactional
	public Object importTowary(byte[] bs) {
		return towarDao.importTowary(bs);
	}

	public void setTowarDao(TowarDao towarDao) {
		this.towarDao = towarDao;
	}

}