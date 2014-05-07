package szgm.towar.bo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import szgm.grupa.model.Grupa;
import szgm.jednostka.model.Jednostka;
import szgm.towar.model.Towar;

public class TowarBoTest {

	@Autowired
	TowarBo towarBo;

	@Test
	public void testAddTowar() {
		Towar t = createNew();
		towarBo.add(t);

		List<Towar> list = towarBo.findAll(Towar.class);

		Assert.assertTrue(list.contains(t));
	}

	@Test
	public void testRemoveTowar() {
		Towar t = createNew();
		towarBo.add(t);
		towarBo.delete(t);

		List<Towar> list = towarBo.findAll(Towar.class);

		boolean result = false;
		for (Towar x : list) {
			if (x.equals(t)) {
				result = true;
			}
		}

		Assert.assertFalse(result);
	}

	private Towar createNew() {
		Towar t = new Towar();
		t.setNazwa("towar1");
		t.setCenaNetto(12.34);
		t.setGrupa(new Grupa());
		t.setKodKreskowy("0734567359245");
		t.setJednostka(new Jednostka());

		return t;
	}

	public TowarBo getTowarBo() {
		return towarBo;
	}

	public void setTowarBo(TowarBo towarBo) {
		this.towarBo = towarBo;
	}

}