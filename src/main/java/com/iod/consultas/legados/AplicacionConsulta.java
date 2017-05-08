package com.iod.consultas.legados;

public class AplicacionConsulta {
		private TabletConsulta consulta = new TabletConsulta();
		
		public void ProcesaConsulta( String marca) {			
			this.consulta.DatoTabletConsulta(marca);
		}
}
