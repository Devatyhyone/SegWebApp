package br.com.segdash.ui.beans;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
//@RequestScoped cria um bean pra cada request
@ViewScoped // cria um objeto e mantém ele
//@ApplicationScoped cria um para a aplicação inteira
//@SessionScoped cria um objeto e guarda em um cookie
public class HelloBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String message;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void say() {
		this.message = "Hello " + this.name + ", welcome to java enterprise world";
		FacesContext.getCurrentInstance().
        addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Seu nome foi compilado pelo JSF"));
	}
}
