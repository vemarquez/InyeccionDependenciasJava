package com.io.inyection.service;

public class ServidorServicioImpl implements ConsultaServicio {

	private int IdArticulo;
	private int CantidadDD;
	private String CapacidadDD;
	private String SistemaO;
	private double Precio;
	private String Memoria;

	
	public void sendConsultaEquipo(  String Marca) {
		
		//.. setter & getter
		//.. consulta a al base de datos
		
		// Aquí lo datos datos
		IdArticulo = 5402;
		CantidadDD = 4;
		CapacidadDD = "2Tb";
		SistemaO = "RedHat Linux 6.5";
		Precio = 28635.45;
		Memoria = "8G";
		
		
		System.out.println( "Categoria Servidor. Marca " + Marca +
		" Artículo " + IdArticulo + " Cantidad de Discos Duros " + CantidadDD +
		" Capacidad " + CapacidadDD + "Sistem Operativo " + SistemaO +
		" Precio " + Precio + " Memoria " + Memoria + "\n" );
      
	}
}
