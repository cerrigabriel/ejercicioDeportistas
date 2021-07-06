package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, INadador,ICorredor {

    
	
    private TipoDeEvento tipo_evento;
   
    private TipoDeBicicleta tipo_bicicleta;

	private TipoDeBicicleta tipo;

	private Integer distanciaPreferida;

	private String estiloPreferido;
    
    
 


	public Triatleta(Integer num_socio, String nombre, TipoDeEvento tipo_evento, TipoDeBicicleta tipo_bicicleta) {
		super(num_socio, nombre);
		this.tipo_evento = tipo_evento;
		this.tipo_bicicleta = tipo_bicicleta;
	}


	public TipoDeEvento getTipo_evento() {
		return tipo_evento;
	}


	public void setTipo_evento(TipoDeEvento tipo_evento) {
		this.tipo_evento = tipo_evento;
	}


	


	public TipoDeBicicleta getTipo_bicicleta() {
		return tipo_bicicleta;
	}


	public void setTipo_bicicleta(TipoDeBicicleta tipo_bicicleta) {
		this.tipo_bicicleta = tipo_bicicleta;
	}


	public TipoDeBicicleta getTipoDeBicicleta() {
		
		return tipo;
	}


	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipo= tipoDeBicicleta;
	}


	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}


	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}


	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

  
	
}








