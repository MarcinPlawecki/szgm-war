package szgm.kontrahent;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import szgm.core.BaseFacesBean;
import szgm.kontrahent.model.Kontrahent;

@ManagedBean(name = "kontrahent")
@SessionScoped
public class KontrahentBean extends BaseFacesBean<Kontrahent> implements Serializable, InitializingBean {

	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	@Override
	public void refreshList() {
			list = bo.findAllByNazwa(Kontrahent.class);
	}
	
	public String addTowar() {
		Kontrahent t = new Kontrahent();
		t.setNazwa(nazwa);
		t.setAktywny(aktywny);
		t.setNip(nip);
		t.setKontoBankowe(kontoBankowe);
		t.setEmail(email);
		t.setKraj(kraj);
		t.setMiasto(miasto);
		t.setUlica(ulica);
		t.setNumerMieszkania(numerMieszkania);
		t.setKodPocztowy(kodPocztowy);
		t.setRegon(regon);
		t.setTelefon(telefon);
		t.setNazwaSkrocona(nazwaSkrocona);
		t.setLiczbaDni(liczbaDni);

		bo.add(t);
		refreshList();
		clearForm();
		return "success";
	}
	
	@Override
	protected void clearForm() {
		setNazwa("");
		setNip("");
		setKontoBankowe("");
		setEmail("");
		setKraj("");
		setMiasto("");
		setUlica("");
		setNumerMieszkania("");
		setKodPocztowy("");
		setRegon("");
		setTelefon("");
		setNazwaSkrocona("");
		setLiczbaDni(0);
		setAktywny(0);
		setNewName("");
	}
	
    public void cloneItem() {
    	FacesMessage msg;
    	if(null != selectedItem) {
    		Kontrahent newT = new Kontrahent();
    		newT.setNazwa(this.getNewName());
    		newT.setAktywny(selectedItem.getAktywny());
    		newT.setNip(selectedItem.getNip());
    		newT.setKontoBankowe(selectedItem.getKontoBankowe());
    		newT.setEmail(selectedItem.getEmail());
    		newT.setKraj(selectedItem.getKraj());
    		newT.setMiasto(selectedItem.getMiasto());
    		newT.setUlica(selectedItem.getUlica());
    		newT.setNumerMieszkania(selectedItem.getNumerMieszkania());
    		newT.setKodPocztowy(selectedItem.getKodPocztowy());
    		newT.setRegon(selectedItem.getRegon());
    		newT.setTelefon(selectedItem.getTelefon());
    		newT.setNazwaSkrocona(selectedItem.getNazwaSkrocona());
    		newT.setLiczbaDni(selectedItem.getLiczbaDni());
    		
    		bo.add(newT);
    		refreshList();
    		clearForm();
    		
    		msg = new FacesMessage("Zmiany zosta³y anulowane");
    	} else {
    		msg = new FacesMessage("Nie wybrano wiersza do sklonowania");
    		
    	}
    	
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
    
	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(bo, "towarBo can't be null");
	}
	
	public long id;
	public String nazwa;
	public String nip;
	public String kontoBankowe;
	public String email;
	public String kraj;
	public String miasto;
	public String ulica;
	public String numerMieszkania;
	public String kodPocztowy;
	public String regon;
	public String telefon;
	public String nazwaSkrocona;
	public Integer liczbaDni;
	public Integer aktywny;

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

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getKontoBankowe() {
		return kontoBankowe;
	}

	public void setKontoBankowe(String kontoBankowe) {
		this.kontoBankowe = kontoBankowe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getNumerMieszkania() {
		return numerMieszkania;
	}

	public void setNumerMieszkania(String numerMieszkania) {
		this.numerMieszkania = numerMieszkania;
	}

	public String getKodPocztowy() {
		return kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getRegon() {
		return regon;
	}

	public void setRegon(String regon) {
		this.regon = regon;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getNazwaSkrocona() {
		return nazwaSkrocona;
	}

	public void setNazwaSkrocona(String nazwaSkrocona) {
		this.nazwaSkrocona = nazwaSkrocona;
	}

	public Integer getLiczbaDni() {
		return liczbaDni;
	}

	public void setLiczbaDni(Integer liczbaDni) {
		this.liczbaDni = liczbaDni;
	}

	public Integer getAktywny() {
		return aktywny;
	}

	public void setAktywny(Integer aktywny) {
		this.aktywny = aktywny;
	}
	
}
