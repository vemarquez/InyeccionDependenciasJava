package com.io.inyection.consumer;

import com.io.inyection.service.ConsultaServicio;

public class Aplicacion implements Consumer {

	private ConsultaServicio service;

	public Aplicacion( ConsultaServicio svc ) {
		this.service = svc;
	}

	public void processMessages(String marca) {
		// posiblemente se puedan hacer aqui algunas validaciones para obtener la valor a consultar
		this.service.sendConsultaEquipo(marca);				
	}

}
