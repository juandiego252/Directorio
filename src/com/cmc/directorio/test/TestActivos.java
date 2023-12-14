package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		Telefono telefono = new Telefono("claro", "0999863287", 22);
		Contacto contacto = new Contacto("Santiago", "Andrade", telefono, 71.2);
		AdminContactos adminContactos = new AdminContactos();
		telefono.setTieneWhatsapp(true);
		
		System.out.println("---------------");
		System.out.println("Tiene whatsapp : " + telefono.isTieneWhatsapp());
		System.out.println("---------------");
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.print("Si tiene Whatsapp Usuario activo :");
		adminContactos.activarUsuario(contacto);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
	}

}
