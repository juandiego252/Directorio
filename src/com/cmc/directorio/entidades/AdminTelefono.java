package com.cmc.directorio.entidades;

import java.util.ArrayList;

public class AdminTelefono {

	public void activarMensajeria(Telefono telf) {
		if (telf.getOperadora() == "movi") {
			telf.setTieneWhatsapp(true);
			System.out.println(telf.isTieneWhatsapp());
		}
	}

	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {

		// Se crea un arraylist de un objeto Telefono
		ArrayList<Telefono> listaTelefonos = new ArrayList<Telefono>();
		// Se añaden los objetos telf1, telf2 y telf3 al arraylist
		listaTelefonos.add(telf1);
		listaTelefonos.add(telf2);
		listaTelefonos.add(telf3);

		// aux nos permite contar el numero de veces de la palabra movi
		int aux = 0;

		// Con el bucle for recorremos la listaTelefonos
		for (Telefono telefonos : listaTelefonos) {
			// verifica si la operadora del telefono es igual a movi e incremeta la varible
			// aux;
			if (telefonos.getOperadora().equals("movi")) {
				aux++;
			}
		}

		return aux;
	}

	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {

		ArrayList<Telefono> listaTelefono = new ArrayList<Telefono>();

		listaTelefono.add(telf1);
		listaTelefono.add(telf2);
		listaTelefono.add(telf3);
		listaTelefono.add(telf4);

		int aux = 0;

		for (Telefono telefonos : listaTelefono) {
			if (telefonos.getOperadora().equals("claro")) {
				aux++;
			}
		}

		return aux;
	}

}
