package Actividad12_Casa;

public class Habitacion {
	String nombre;
	int metrosCuadrados;
	TipoHabitacion tipoHabitacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion : nombre = " + nombre + ", metrosCuadrados=" + metrosCuadrados + ", tipoHabitacion="
				+ tipoHabitacion;
	}
	
	
}
