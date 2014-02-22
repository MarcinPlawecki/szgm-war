package szgm.typDokumentu.model;

import java.io.Serializable;

import szgm.core.BaseModel;

public class TypDokumentu extends BaseModel implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	public long id;
	public String nazwa;
	
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
	
	public boolean equals(Object other) {
        return other instanceof TypDokumentu ? id == (((TypDokumentu) other).getId()) : (other == this);
    }

    public int hashCode() {
        return this.getClass().hashCode() + ((Long)id).hashCode();
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