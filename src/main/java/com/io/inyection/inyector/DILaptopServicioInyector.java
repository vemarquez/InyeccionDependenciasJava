package com.io.inyection.inyector;

import com.io.inyection.consumer.Consumer;
import com.io.inyection.consumer.DIApplication;
import com.io.inyection.service.LaptopServicioImpl;

public class DILaptopServicioInyector implements ConsultaServiceInyector {

	public Consumer getConsumer() {
		DIApplication app = new DIApplication();
		app.setService(new LaptopServicioImpl() );
		return app;
	}

}
