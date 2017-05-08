package com.io.inyection.inyector;

import com.io.inyection.consumer.Aplicacion;
import com.io.inyection.consumer.Consumer;
import com.io.inyection.service.LaptopServicioImpl;

public class LaptopServicioInyector implements ConsultaServiceInyector {

	public Consumer getConsumer() {
		return new Aplicacion( new LaptopServicioImpl());
	}

}
