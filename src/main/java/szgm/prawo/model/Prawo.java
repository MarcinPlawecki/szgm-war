package szgm.prawo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import szgm.core.BaseModel;
import szgm.rola.model.Rola;

public class Prawo extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	public long id;
	public String nazwa;
	public String opis;
	public Set<Rola> role = new HashSet<Rola>(0);

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

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Set<Rola> getRole() {
		return role;
	}

	public void setRole(Set<Rola> role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Prawo ? id == (((Prawo) other).getId())
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