package com.udemy.springboot.di.app.view.xml;

import java.util.List;

import com.udemy.springboot.di.app.models.entity.Cliente;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "clientes")
public class ClienteList {

	@XmlElement(name = "cliente")
	public List<Cliente> clientes;

	public ClienteList() {
	}

	public ClienteList(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

}
