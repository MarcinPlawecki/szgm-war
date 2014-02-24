package szgm.rola.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import szgm.core.BaseModel;
import szgm.prawo.model.Prawo;

public class Rola extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public long id;
	public String nazwa;
	public Set<Prawo> prawa = new HashSet<Prawo>(0);

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Set<Prawo> getPrawa() {
		return prawa;
	}

	public void setPrawa(Set<Prawo> prawa) {
		this.prawa = prawa;
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Rola ? id == (((Rola) other).getId())
				: (other == this);
	}

	@Override
	public int hashCode() {
		return this.getClass().hashCode() + ((Long) id).hashCode();
	}

	@Override
	public Object getIdentifier() {
		return this.getNazwa();
	}

	@Override
	public String getIdentifierAsString() {
		return this.getNazwa();
	}
}