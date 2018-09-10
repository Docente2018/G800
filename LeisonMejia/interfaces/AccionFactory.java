package com.app;

public class AccionFactory {
	
	public static Accion getInstancia(int accionSeleccionada) {
		Accion accion = null;
		
		switch (accionSeleccionada) {
		case 1:
			accion = new CrearAccion();
			break;
		case 2:
			accion = new EditarAccion();
			break;
		case 3:
			accion = new EliminarAccion();
			break;

		default:
			accion = new NotFoundAccion();
			break;
		}
		
		return accion;
	}

}
