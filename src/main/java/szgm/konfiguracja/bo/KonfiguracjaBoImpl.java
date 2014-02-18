package szgm.konfiguracja.bo;
 

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import szgm.core.BaseBoImpl;
import szgm.konfiguracja.model.Konfiguracja;
 
@ManagedBean(name="konfiguracjaBo")
@SessionScoped
public class KonfiguracjaBoImpl extends BaseBoImpl<Konfiguracja> implements Serializable {

	private static final long serialVersionUID = 1L;
 
 }