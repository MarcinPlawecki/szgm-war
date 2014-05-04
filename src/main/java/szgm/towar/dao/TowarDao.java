package szgm.towar.dao;

import java.io.ByteArrayOutputStream;
import java.util.List;

import szgm.core.BaseDao;
import szgm.towar.model.Towar;

public interface TowarDao extends BaseDao<Towar> {

	ByteArrayOutputStream export(List<Towar> selectedItems);

	Object importTowary(byte[] bs);

}