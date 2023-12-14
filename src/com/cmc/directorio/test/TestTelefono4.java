package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {

		Telefono telefonoA = new Telefono("claro", "0969421234", 11);
		Telefono telefonoB = new Telefono("claro", "0969421234", 11);
		Telefono telefonoC = new Telefono("claro", "0969421234", 11);
		Telefono telefonoD = new Telefono("movi", "0969421234", 11);

		AdminTelefono adminTelf = new AdminTelefono();

		int contarClaro = adminTelf.contarClaro(telefonoA, telefonoB, telefonoC, telefonoD);

		System.out.println("-----------------------------------------");
		System.out.println("Telefonos Operador Claro: " + contarClaro);
	}

}
