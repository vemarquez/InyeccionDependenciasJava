package com.io.inyection.inyector;

import com.io.inyection.consumer.Aplicacion;
import com.io.inyection.consumer.Consumer;
import com.io.inyection.service.TelInteligenteServicioImpl;

public class TelInteligenteServicioInyector implements ConsultaServiceInyector {
	
	public Consumer getConsumer() {
		return new Aplicacion( new TelInteligenteServicioImpl() );
	}	
}
