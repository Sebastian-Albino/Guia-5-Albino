package ReparaFix;

public abstract class Servicio {

	protected Oficio of;
	protected double costo;
	protected boolean urgente;
	protected final double COSTO_URG = 0.5;
	
	
}
enum Oficio{
	
	ALBAÑILERIA, CARPINTERÍA, CERRAJERÍA
}