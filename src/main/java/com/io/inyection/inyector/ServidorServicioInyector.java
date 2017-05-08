package com.io.inyection.inyector;

import com.io.inyection.consumer.Consumer;
import com.io.inyection.consumer.Aplicacion;
import com.io.inyection.service.ServidorServicioImpl;

public class ServidorServicioInyector implements ConsultaServiceInyector {
	
	public Consumer getConsumer() {
		return new Aplicacion( new ServidorServicioImpl());
	}

}
