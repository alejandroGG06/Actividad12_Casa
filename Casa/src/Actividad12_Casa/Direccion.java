package Actividad12_Casa;

public class Direccion {

	tipoVia tipoVia;
	String nombreVia;
	String localidad;
	String codigoPostal;

	public tipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(tipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "tipoVia = " + tipoVia + ", nombreVia = " + nombreVia + ", localidad = " + localidad
				+ ", codigoPostal = " + codigoPostal;
	}
	
	
}
