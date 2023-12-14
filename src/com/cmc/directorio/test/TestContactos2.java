package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		
		
		Contacto contactoA = new Contacto("Juan", "Ramirez", null, 52.39);
		contactoA.setTelefono(new Telefono("claro", "02 2531567", 12));
		
		

		Contacto contactoB = new Contacto("David", "Lopez", null, 61.32);
		contactoB.setTelefono(new Telefono("movi", "090909", 11));

		AdminContactos adminContacto = new AdminContactos();
		boolean resultOper;

		
		resultOper = adminContacto.compararOperadoras(contactoA, contactoB);

		System.out.println("--- Datos Contactos ---");
		System.out.println("Contacto mas pesado:");
		adminContacto.contactoMasPesado(contactoA, contactoB);
		System.out.println("Mismo operador Operador: " + resultOper);
		

	}

}
