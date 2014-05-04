package szgm.towar.dao;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import szgm.core.BaseDaoImpl;
import szgm.core.BaseModel;
import szgm.towar.model.Towar;

public class TowarDaoImpl extends BaseDaoImpl<Towar> implements TowarDao,
		Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public ByteArrayOutputStream export(List<Towar> selectedItems) {
		Session session = getSessionFactory().openSession();
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		XMLEncoder encoder = new XMLEncoder(os);
		for (Towar t : selectedItems) {
			getHibernateTemplate().initialize(t.getGrupa());
			getHibernateTemplate().initialize(t.getJednostka());
			getHibernateTemplate().initialize(t.getVat());
			getHibernateTemplate().initialize(t.getWaluta());
			getHibernateTemplate().initialize(t);
		}

		encoder.writeObject(selectedItems);

		encoder.close();
		session.disconnect();
		session.close();

		return os;
	}

	@Override
	public Object importTowary(byte[] bs) {
		ByteArrayInputStream os = new ByteArrayInputStream(bs);
		XMLDecoder decoder = new XMLDecoder(os);
		Object deSerializedObject = decoder.readObject();
		decoder.close();

		List<BaseModel> list = (List<BaseModel>) deSerializedObject;
		for (Iterator<BaseModel> iter = list.iterator(); iter.hasNext();) {
			BaseModel t = iter.next();
			this.add(t);
		}

		return deSerializedObject;
	}

}