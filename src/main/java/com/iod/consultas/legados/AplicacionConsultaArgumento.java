package com.iod.consultas.legados;

public class AplicacionConsultaArgumento {

	private TabletConsulta ConsultaTab = null;
	
	public AplicacionConsultaArgumento( TabletConsulta consulta ) {
		this.ConsultaTab =  consulta;		
	}
	
	public void ProcesaConsulta( String marca ) {
		this.ConsultaTab.DatoTabletConsulta(marca);
	}
}
