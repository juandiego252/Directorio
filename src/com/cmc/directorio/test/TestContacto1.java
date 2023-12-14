package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		
		Telefono telef = new Telefono("movi","0909090", 10);
		Contacto c = new Contacto("Pablo", "Mendez", telef, 61.25);
		Contacto a = new Contacto("Mikaela", "astudillo", null, 55.67);
		
		
		a.setTelefono(new Telefono("movi", "099696942", 11));
		AdminContactos adminContactos = new AdminContactos();
		
		boolean res = adminContactos.compararOperadoras(c, a);
;
		
		System.out.println("----- Datos del conntacto creado -----");
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Operadora: " + c.getTelefono().getOperadora());
		System.out.println("Numero de telefono: " + c.getTelefono().getNumero());
		System.out.println("Peso: " + c.getPeso());
		
		System.out.println("--- Resultados Metodos --");
		System.out.print("Mas pesado: ");
		adminContactos.contactoMasPesado(c, a);
		System.out.println("Misma operadora: " + res);
	}

}
