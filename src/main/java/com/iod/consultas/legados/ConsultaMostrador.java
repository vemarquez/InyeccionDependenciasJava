package com.iod.consultas.legados;

public class ConsultaMostrador {

	public static void main(String[] args) {
		TabletConsulta consulta = new TabletConsulta();
		//AplicacionConsulta app = new AplicacionConsulta();		
		AplicacionConsultaArgumento app = new AplicacionConsultaArgumento(consulta);
		app.ProcesaConsulta("Lenovo");
				
	}
}
