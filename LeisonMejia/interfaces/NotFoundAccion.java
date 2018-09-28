package com.app;

public class NotFoundAccion implements Accion{

	@Override
	public void ejecutar() {
		System.out.println("No se encontro accion a ejecutar");		
	}

}
