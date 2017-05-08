package com.iod.consultas.legados;

public class TabletConsulta {
	private int IdArticulo;
	private int CantidadDD;
	private String CapacidadDD;
	private String SistemaO;
	private double Precio;
	private String Memoria;
	private String TMonitor;
	
	public void DatoTabletConsulta(  String Marca) {
		
		//.. setter & getter
		//.. consulta a la de datos, consulta por web services, rest, jms, etc.
		
		// Aquí lo datos datos
		IdArticulo = 4934;
		CantidadDD = 4;
		CapacidadDD = "500G";
		SistemaO = "Android";
		Precio = 6999.34;
		Memoria = "16G";
		TMonitor = "7\"";
		
		System.out.println( "Categoria Tablet. Marca " + 
		" Artículo " + IdArticulo + " Cantidad " + CantidadDD +
		" Capacidad " + CapacidadDD + "Sistem Operativo " + SistemaO +
		" Precio " + Precio + " Memoria " + Memoria +
		" Tamaño de Monitor " + TMonitor );
      
	}

}
