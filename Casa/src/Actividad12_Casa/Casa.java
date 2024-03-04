package Actividad12_Casa;

import java.util.ArrayList;

public class Casa {
	int precio;

	Direccion direccion;
	ArrayList<Habitacion> habitaciones;
	Jardin jardin;
	boolean segundamano;
	int metros;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Jardin getJardin() {
		return jardin;
	}

	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}

	public boolean esSegundaMano() {
		return segundamano;
	}

	public void setSegundaMano(boolean segundamano) {
		this.segundamano = segundamano;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}
	
	
	@Override
	public String toString() {
		return "Casa : precio = " + precio + "\n direccion : " + direccion + "\n habitaciones : " + habitaciones + "\n jardin : "
				+ jardin + "\n segundamano = " + segundamano;
	}

	public int metrosTotales() {
		for(Habitacion habitacion : habitaciones) {
			this.metros += habitacion.metrosCuadrados;
		}
		this.metros += jardin.metrosCuadrados;
		setMetros(this.metros);
		return getMetros();
	}

	public int casaMasIVA() {
		if (segundamano == true) {
			this.precio = ((this.precio * 5) / 100) + this.precio;
		} else if (segundamano == false) {
			this.precio = ((this.precio * 10) / 100) + this.precio;
		}
		return this.precio;
	}
}
