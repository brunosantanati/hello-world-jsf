package com.capgemini.hello_world_jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "pc_helloWorld", eager = true)
@RequestScoped
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 1L;
	private String bio;
	
	public String getBio() {
		return bio;
	}
	
	public void setBio(String bio) {
		this.bio = bio;
	}
}
