package com.io.inyection.consultas;

import com.io.inyection.consumer.Consumer;
import com.io.inyection.inyector.ConsultaServiceInyector;
import com.io.inyection.inyector.LaptopServicioInyector;
import com.io.inyection.inyector.ServidorServicioInyector;
import com.io.inyection.inyector.TabletServicioInyector;
import com.io.inyection.inyector.TelInteligenteServicioInyector;

public class ConsultaEquipoMostrador {

	public static void main(String[] args) {
		String marca = "Lenovo";
		ConsultaServiceInyector inyector = null;			
		Consumer app = null;

		//consulta laptop
		inyector = new LaptopServicioInyector();
		app = inyector.getConsumer();
		app.processMessages(marca);
					
		//consulta servidor
		inyector = new ServidorServicioInyector();
		app = inyector.getConsumer();
		app.processMessages(marca);
		
		//consulta tableta
		inyector = new TabletServicioInyector();
		app = inyector.getConsumer();
		app.processMessages(marca);
		
		//consulta telefono inteligenre
		inyector = new TelInteligenteServicioInyector();
		app = inyector.getConsumer();
		app.processMessages(marca);
		
	}

}
