package com.iod.consultas.computo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.io.inyection.consumer.Aplicacion;
import com.io.inyection.consumer.Consumer;
import com.io.inyection.inyector.ConsultaServiceInyector;
import com.io.inyection.service.ConsultaServicio;


public class AplicacionTest {

	private ConsultaServiceInyector injector;
	
	@Before
    public void setUp(){
		injector = new ConsultaServiceInyector() {
			
			public Consumer getConsumer() {
				return new Aplicacion( new ConsultaServicio() {
					public void sendConsultaEquipo(String marca) {
                        System.out.println("Simulando un mensaje de una consulta");					
                        }
				});
			}
	};	
}
	
	@Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Lenovo");
    }
     
    @After
    public void tear(){
        injector = null;
    } 
}
