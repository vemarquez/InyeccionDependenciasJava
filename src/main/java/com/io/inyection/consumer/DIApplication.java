package com.io.inyection.consumer;

import com.io.inyection.consumer.Consumer;
import com.io.inyection.service.ConsultaServicio;

public class DIApplication implements Consumer{
	
	private ConsultaServicio service;

	public DIApplication()  {}

	public void setService(ConsultaServicio service) {
		this.service = service;
	}
	
    public void processMessages(String marca){
    	// posiblemente se puedan hacer aqui algunas validacione para obtener la valor a consultar
        this.service.sendConsultaEquipo(marca);
    }

}
