package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista{

	private TipoDeBicicleta tipo;



	public Ciclista(Integer num_socio, String nombre, TipoDeBicicleta tipo) {
		super(num_socio, nombre);
		this.tipo = tipo;
	}


	
	
	

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipo;
	}


	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipo= tipoDeBicicleta;
	}


}
