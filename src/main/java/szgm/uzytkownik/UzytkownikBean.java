package szgm.uzytkownik;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.authentication.encoding.PasswordEncoder;

import szgm.core.BaseFacesBean;
import szgm.rola.model.Rola;
import szgm.uzytkownik.model.Uzytkownik;

public class UzytkownikBean extends BaseFacesBean<Uzytkownik> implements
		Serializable, InitializingBean {

	private static final long serialVersionUID = 1L;

	private PasswordEncoder passwordEncoder;

	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}

	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	public String addUzytkownik() {
		Uzytkownik k = new Uzytkownik();

		k.setZaszyfrowany(0);
		k.setLogin(login);
		final String encryptedPassword = passwordEncoder.encodePassword(haslo,
				null);
		k.setHaslo(encryptedPassword);
		k.setImie(imie);
		k.setNazwisko(nazwisko);
		k.setRola(rola);

		bo.add(k);
		refreshList();
		clearForm();

		return "success";
	}

	@Override
	protected void clearForm() {
		setLogin("");
		setHaslo("");
		setImie("");
		setNazwisko("");
		setRola(null);
		setZaszyfrowany(0);
		setNewName("");
	}

	public void cloneItem() {
		FacesMessage msg;
		if (null != selectedItem) {
			Uzytkownik newK = new Uzytkownik();
			newK.setLogin(newName);
			newK.setZaszyfrowany(0);
			newK.setHaslo(selectedItem.haslo);
			newK.setImie(selectedItem.imie);
			newK.setNazwisko(selectedItem.nazwisko);
			newK.setRola(selectedItem.rola);

			bo.add(newK);
			refreshList();
			clearForm();

			msg = new FacesMessage("Zmiany zosta³y zapisane");
		} else {
			msg = new FacesMessage("Nie wybrano wiersza do sklonowania");

		}

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	}

	@Override
	public void refreshList() {
		list = bo.findAll(Uzytkownik.class);
	}

	@Override
	public void onEdit(RowEditEvent event) {
		((Uzytkownik) event.getObject()).setZaszyfrowany(0);
		final String encryptedPassword = passwordEncoder.encodePassword(
				((Uzytkownik) event.getObject()).getHaslo(), null);
		((Uzytkownik) event.getObject()).setHaslo(encryptedPassword);
		super.onEdit(event);
	}

	public String login;
	public String haslo;
	public String imie;
	public String nazwisko;
	public Rola rola;
	public int zaszyfrowany;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Rola getRola() {
		return rola;
	}

	public void setRola(Rola rola) {
		this.rola = rola;
	}

	public int getZaszyfrowany() {
		return zaszyfrowany;
	}

	public void setZaszyfrowany(int zaszyfrowany) {
		this.zaszyfrowany = zaszyfrowany;
	}

}
