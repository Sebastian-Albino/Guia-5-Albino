package ReparaFix;

public class ServEstandar extends Servicio{
	
	private Trabajador encargado;
	
	
	
	public double calcularCosto(
			Trabajador encargado, double precio) {
		
		double costoFinal = this.costo + 
				encargado.getPorcentajeComision() *
				this.costo;
		
		return costoFinal;
		
	}



	public Trabajador getEncargado() {
		return encargado;
	}



	public void setEncargado(Trabajador encargado) {
		this.encargado = encargado;
	}
	
}
