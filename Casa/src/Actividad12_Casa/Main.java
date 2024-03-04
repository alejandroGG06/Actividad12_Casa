package Actividad12_Casa;

public class Main {

	public static void main(String[] args) {
		Casa casaAyman = new Casa();
		Habitacion habitacion1 = new Habitacion();
		Direccion direccionCasaAyman = new Direccion();
		Jardin jardin1 = new Jardin();

		habitacion1.setMetrosCuadrados(200);
		habitacion1.setNombre("Juan");
		habitacion1.setTipoHabitacion(TipoHabitacion.SALON);

		direccionCasaAyman.setCodigoPostal("1233");
		direccionCasaAyman.setLocalidad("Madrid");
		direccionCasaAyman.setNombreVia("Real");
		direccionCasaAyman.setTipoVia(tipoVia.Avenida);

		jardin1.setMetrosCuadrados(500);
		jardin1.setNumeroPlantas(20);

		casaAyman.setHabitaciones(habitacion1);
		casaAyman.setDireccion(direccionCasaAyman);
		casaAyman.setJardin(jardin1);
		casaAyman.setPrecio(2000000);
		casaAyman.setSegundaMano(false);
		
		System.out.println(casaAyman);
		System.out.println("La superficie de la casa es " + casaAyman.metrosTotales() + " metros cuadrados");
		System.out.println(casaAyman.esSegundaMano());
		System.out.println(casaAyman.casaMasIVA());
	}

}
