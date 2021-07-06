package ar.edu.unlam.pb2.eva03;

public class Corredor extends Deportista {


	private Integer distanciaPreferida;
	private Integer kilometrosEntrenados;
	
	
	


	public Corredor(Integer num_socio, String nombre, Integer distanciaPreferida) {
		super(num_socio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.kilometrosEntrenados = 0;
	}


	


	

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}


	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}


	public void setCantidadDeKilometrosEntrenados(Integer kilometros) {
		
		this.kilometrosEntrenados=kilometros;
	}


	public  Integer getCantidadDeKilometrosEntrenados() {
		return this.kilometrosEntrenados;
	}


	
		
	}








