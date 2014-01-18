package szgm.sklep;

import java.io.Serializable;
import java.util.List;

import szgm.sklep.bo.SklepBo;
import szgm.sklep.model.Sklep;


public class SklepBean implements Serializable{

	SklepBo sklepBo;
	
	public String nazwa;
	public String kraj;
	public String miasto;
	public String ulica;
	public String kodPocztowy;
	public String email;
	public String symbol;

	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getKraj() {
		return kraj;
	}
	public void setKraj(String kraj) {
		this.kraj = kraj;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getKodPocztowy() {
		return kodPocztowy;
	}
	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public void setSklepBo(SklepBo sklepBo) {
		this.sklepBo = sklepBo;
	}
 
	public List<Sklep> getSklepList(){
		return sklepBo.findAllSklep();
	}
	
}
