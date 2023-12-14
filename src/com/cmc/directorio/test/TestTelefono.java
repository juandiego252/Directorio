package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movil", "09941234123", 10);
		
		System.out.println(" ----- Datos Telefono -----");
		System.out.println( "Operadora:" +telf.getOperadora());
		System.out.println( "Numero:" +telf.getNumero());
		System.out.println( "Codigo:" +telf.getCodigo());
	}

}
