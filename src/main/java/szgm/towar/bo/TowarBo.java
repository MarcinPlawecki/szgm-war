package szgm.towar.bo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import szgm.core.BaseBo;
import szgm.towar.model.Towar;

import com.lowagie.text.DocumentException;

public interface TowarBo extends BaseBo<Towar> {

	ByteArrayOutputStream drukuj(Map<Towar, Integer> doWydruku)
			throws DocumentException, IOException;

	ByteArrayOutputStream export(List<Towar> selectedItems);

	Object importTowary(byte[] bs) throws Exception;

}