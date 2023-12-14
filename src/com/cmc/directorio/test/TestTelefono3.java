package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		
		Telefono telefonoA = new Telefono("movi", "0999863287", 10);
		Telefono telefonoB = new Telefono("movi", "0999883217", 10);
		Telefono telefonoC = new Telefono("claro", "0939863287", 10);
		
		AdminTelefono admintelf = new AdminTelefono();
		int cantidadTelefonosMovi = admintelf.contarMovi(telefonoA, telefonoB, telefonoC);
		
		System.out.println("Cantidad de telefonos con operaoda movi: " + cantidadTelefonosMovi);
		

	}

}
