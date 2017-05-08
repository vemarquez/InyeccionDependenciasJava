package com.io.inyection.service;

public class LaptopServicioImpl implements ConsultaServicio {

	private int IdArticulo;
	private String CapacidadDD;
	private String SistemaO;
	private double Precio;
	private String Memoria;
	private String TMonitor;
	
	public void sendConsultaEquipo(  String Marca) {
		
		//.. setter & getter
		//.. consulta a al base de datos
		
		// Aquí lo datos datos
		IdArticulo = 5611;
		CapacidadDD = "1Tb";
		SistemaO = "WIndows 7 Home Premium";
		Precio = 13456.12;
		Memoria = "8G";
		TMonitor = "15\"";
		
		System.out.println( "Categoria Laptop. Marca " + Marca +
		" Artículo " + IdArticulo + 
		" Capacidad " + CapacidadDD + "Sistem Operativo " + SistemaO +
		" Precio " + Precio + " Memoria " + Memoria +
		" Tamaño de Monitor " + TMonitor + "\n" );
      
	}

}
