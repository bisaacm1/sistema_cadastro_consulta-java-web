package br.com.isaac.sistema.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * @author imaciel
 * 
 * @version 1.0
 * @since /04/2020
 * 
 */
public class JSFUtil {

	public static void addInfoMessage(String msg) {

		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(msg, facesMessage);
	}

}
