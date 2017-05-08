package com.io.inyection.service;

public class TelInteligenteServicioImpl implements ConsultaServicio {

	private int IdArticulo;
	private String SistemaO;
	private double Precio;
	private String Memoria;
	private String TMonitor;
	
	public void sendConsultaEquipo(  String Marca) {
		
		//.. setter & getter
		//.. consulta a al base de datos
		
		// Aquí lo datos datos
		IdArticulo = 4598;
		SistemaO = "Andriod Kitkat 2.0";
		Precio = 8959.54;
		Memoria = "16G";
		TMonitor = "10\"";
		
		System.out.println( "Categoria Telefono Inteligente. Marca " + Marca +
		" Artículo " + IdArticulo + 
		" Sistem Operativo " + SistemaO +
		" Precio " + Precio + " Memoria " + Memoria +
		" Tamaño de Monitor " + TMonitor + "\n" );
      
	}

}
