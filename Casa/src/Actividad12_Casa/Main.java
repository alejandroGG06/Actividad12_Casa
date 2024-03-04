package Actividad12_Casa;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Casa casaAyman = new Casa();
		ArrayList<Habitacion> habitaciones = new ArrayList();
		Direccion direccionCasaAyman = new Direccion();
		Jardin jardin1 = new Jardin();

		Habitacion habitacion1 = new Habitacion();
		Habitacion habitacion2 = new Habitacion();
		Habitacion habitacion3 = new Habitacion();
		
		habitacion1.setMetrosCuadrados(200);
		habitacion1.setNombre("Juan");
		habitacion1.setTipoHabitacion(TipoHabitacion.SALON);
		
		habitacion2.setMetrosCuadrados(100);
		habitacion2.setNombre("hola");
		habitacion2.setTipoHabitacion(TipoHabitacion.BAÑO);
		
		habitacion3.setMetrosCuadrados(300);
		habitacion3.setNombre("si");
		habitacion3.setTipoHabitacion(TipoHabitacion.COCINA);
		
		habitaciones.add(habitacion1);habitaciones.add(habitacion2);habitaciones.add(habitacion3);

		direccionCasaAyman.setCodigoPostal("1233");
		direccionCasaAyman.setLocalidad("Madrid");
		direccionCasaAyman.setNombreVia("Real");
		direccionCasaAyman.setTipoVia(tipoVia.Avenida);

		jardin1.setMetrosCuadrados(500);
		jardin1.setNumeroPlantas(20);

		casaAyman.setHabitaciones(habitaciones);
		casaAyman.setDireccion(direccionCasaAyman);
		casaAyman.setJardin(jardin1);
		casaAyman.setPrecio(2000000);
		casaAyman.setSegundaMano(false);
		
		System.out.println(casaAyman + "\n");
		System.out.println("La superficie de la casa es " + casaAyman.metrosTotales() + " metros cuadrados\n");
		System.out.println("¿Es la casa de segunda mano? -> " + casaAyman.esSegundaMano() + "\n");
		System.out.println("El precio de la casa con el IVA incluido es -> " + casaAyman.casaMasIVA() + "\n");
		
	}

}
