package szgm.grupa.model;

public class Grupa{
	
	public long id;
	public Grupa rodzic;
	public String nazwa;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Grupa getRodzic() {
		return rodzic;
	}
	public void setRodzic(Grupa rodzic) {
		this.rodzic = rodzic;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public boolean equals(Object other) {
        return other instanceof Grupa ? id == (((Grupa) other).getId()) : (other == this);
    }

    public int hashCode() {
        return this.getClass().hashCode() + ((Long)id).hashCode();
    }
    
}