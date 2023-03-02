package ReparaFix;

public class ServPer extends Servicio{

	private double costoMateriales;
	private double costoPresupuestado;
	private double costoTransporte;
	
	public double calcularCosto(double costoMat,
			double costoPre, double costoTr) {
		
		double costoFinal = costoMat + costoPre + costoTr;
		
		if(this.urgente)
			costoFinal += costoFinal * COSTO_URG;
		
		return costoFinal;
	}
	
	// Getters y Setters
	
	public double getCostoMateriales() {
		return costoMateriales;
	}
	public void setCostoMateriales(double costoMateriales) {
		this.costoMateriales = costoMateriales;
	}
	public double getCostoPresupuestado() {
		return costoPresupuestado;
	}
	public void setCostoPresupuestado(double costoPresupuestado) {
		this.costoPresupuestado = costoPresupuestado;
	}
	public double getCostoTransporte() {
		return costoTransporte;
	}
	public void setCostoTransporte(double costoTransporte) {
		this.costoTransporte = costoTransporte;
	}
	
	
	
}
