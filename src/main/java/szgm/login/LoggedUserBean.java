package szgm.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

import szgm.uzytkownik.model.Uzytkownik;

@ManagedBean(name="loggedUser")
@ApplicationScoped
public class LoggedUserBean {

	private Uzytkownik user;

	public Uzytkownik getUser() {
		return user;
	}

	public void setUser(Uzytkownik user) {
		this.user = user;
	}
	
}
