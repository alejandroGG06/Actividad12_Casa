package Actividad12_Casa;

public class Casa {
	int precio;
<<<<<<< HEAD
	Direccion direccion;
	Habitaciones habitaciones;
	Jardin jardin;
	String segundamano;
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

	public Habitaciones getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitaciones habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Jardin getJardin() {
		return jardin;
	}

	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}

	public String getSegundamano() {
		return segundamano;
	}

	public void setSegundamano(String segundamano) {
		this.segundamano = segundamano;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public int metrosTotales() {
		return this.metros += habitaciones.metrosCuadrados + jardin.metrosCuadrados;
	}

=======
Direccion direccion;
Habitaciones habitaciones;
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
public Habitaciones getHabitaciones() {
	return habitaciones;
}
public void setHabitaciones(Habitaciones habitaciones) {
	this.habitaciones = habitaciones;
}
public Jardin getJardin() {
	return jardin;
}
public void setJardin(Jardin jardin) {
	this.jardin = jardin;
}
public boolean isSegundamano() {
	return segundamano;
}
public void setSegundamano(boolean segundamano) {
	this.segundamano = segundamano;
}

public int getMetros() {
	return metros;
}
public void setMetros(int metros) {
	this.metros = metros;
}

public int metrosTotales() {
	return this.metros+= habitaciones.metrosCuadrados+jardin.metrosCuadrados;
}
	public int calcularIVA() {
		if (segundamano == true) {
			this.precio = ((this.precio * 5)/100) + this.precio;
		}
		else if (segundamano == false) {
			this.precio = ((this.precio * 10)/100) + this.precio;
		}
		return this.precio;
	}
>>>>>>> juanda
}
