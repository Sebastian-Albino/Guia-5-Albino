package ReparaFix;
import java.util.*;

public class Trabajador {

	private Oficio of;
	private String nombre;
	private String email;
	private double costoHora;
	private double porcentajeComision;
	private ArrayList<Servicio> trabajos;
	
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getCostoHora() {
		return costoHora;
	}

	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}

	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public ArrayList<Servicio> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(ArrayList<Servicio> trabajos) {
		this.trabajos = trabajos;
	}

	public Oficio getOf() {
		return of;
	}

	public void setOf(Oficio of) {
		this.of = of;
	}
}

