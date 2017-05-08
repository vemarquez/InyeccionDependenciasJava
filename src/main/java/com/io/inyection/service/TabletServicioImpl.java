package com.io.inyection.service;

public class TabletServicioImpl implements ConsultaServicio {
	private int IdArticulo;
	private String SistemaO;
	private double Precio;
	private String Memoria;
	private String TMonitor;
	
	public void sendConsultaEquipo(  String Marca) {
		
		//.. setter & getter
		//.. consulta a al base de datos
		
		// Aquí lo datos datos
		IdArticulo = 4934;		
		SistemaO = "Android";
		Precio = 6999.34;
		Memoria = "16G";
		TMonitor = "7\"";
		
		System.out.println( "Categoria Tablet. Marca " + Marca + 
		" Artículo " + IdArticulo + 
	    " Sistem Operativo " + SistemaO +
		" Precio " + Precio + " Memoria " + Memoria +
		" Tamaño de Monitor " + TMonitor + "\n" );
      
	}

}
