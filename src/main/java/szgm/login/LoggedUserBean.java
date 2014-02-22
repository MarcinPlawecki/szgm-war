package szgm.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

import szgm.uzytkownik.model.Uzytkownik;

@ManagedBean(name="loggedUser")
@ApplicationScoped
public class LoggedUserBean {

	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


	
}
