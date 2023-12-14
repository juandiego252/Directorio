package com.cmc.directorio.entidades;

public class AdminContactos {

	public Contacto contactoMasPesado(Contacto contacto1, Contacto contacto2) {
		if (contacto1.getPeso() > contacto2.getPeso()) {
			
			System.out.println(contacto1.getNombre());
			System.out.println(contacto1.getApellido());
			System.out.println(contacto1.getPeso());
			System.out.println(contacto1.getTelefono().getNumero());
			System.out.println(contacto1.getTelefono().getOperadora());
			System.out.println(contacto1.getTelefono().getCodigo());
			
			return contacto1;
			
		} else if (contacto2.getPeso() > contacto1.getPeso()) {
			
			System.out.println(contacto2.getNombre());
			System.out.println(contacto2.getApellido());
			System.out.println(contacto2.getPeso());
			System.out.println(contacto2.getTelefono().getNumero());
			System.out.println(contacto2.getTelefono().getOperadora());
			System.out.println(contacto2.getTelefono().getCodigo());
			
			
			return contacto2;
		} else {
			return null;
		}
	}

	public boolean compararOperadoras(Contacto contacto1, Contacto contacto2) {

		if (contacto1.getTelefono().getOperadora().equals(contacto2.getTelefono().getOperadora())) {
			return true;
		} else {
			return false;
		}

	}

	public void activarUsuario(Contacto contacto) {

		if (contacto.getTelefono().isTieneWhatsapp() == true) {
			contacto.setActivo(true);
			System.out.println(contacto.isActivo());
		}
	}

}
