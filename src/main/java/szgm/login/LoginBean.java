package szgm.login;

import java.lang.ProcessBuilder.Redirect;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
 




import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.util.RedirectUrlBuilder;
import org.springframework.web.servlet.view.RedirectView;
 
@ManagedBean(name="loginMgmtBean")
@RequestScoped
public class LoginBean {
     
    private String userName = null;
     
    private String password = null;
    
    private String error = null;
 
    @ManagedProperty(value="#{authenticationManager}")
    private AuthenticationManager authenticationManager = null;

    public String login() {
        try {
            Authentication request = new UsernamePasswordAuthenticationToken(this.getUserName(), this.getPassword());
            Authentication result = authenticationManager.authenticate(request);
            SecurityContextHolder.getContext().setAuthentication(result);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            this.setUserName(null);
            this.setPassword(null);
            this.setError("Username and/or password invalid");
            return "error";
        }
        return "success";
    }
    
    public String logout() {
        SecurityContextHolder.clearContext();
        return "loggedout";
    }
    
    public String cancel() {
        return null;
    }
 
    public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }
 
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
    
}