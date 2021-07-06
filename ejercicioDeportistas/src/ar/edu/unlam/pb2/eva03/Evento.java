package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	private String nombre_evento;
	
	
	public Evento(TipoDeEvento tipo, String nombre_evento) {
		super();
		this.tipo = tipo;
		this.nombre_evento = nombre_evento;
	    this.participantes= new HashMap<Integer,Deportista>();
	    this.numeroDeInscripcion = 0;
	
	}
	
	public Integer agregarParticipante(Deportista nuevo) {
		Integer numeroInscripcion = (this.getNumeroDeInscripcion()+1);
		if(participantes.put(numeroInscripcion, nuevo) != null) {
			return numeroInscripcion;
		}
		
		return null;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre_evento == null) ? 0 : nombre_evento.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//if (getClass() != obj.getClass())
			//return false;
		Evento other = (Evento) obj;
		if (nombre_evento == null) {
			if (other.nombre_evento != null)
				return false;
		} else if (!nombre_evento.equals(other.nombre_evento))
			return false;
		return true;
	}


	public TipoDeEvento getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}


	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}


	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}


	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}


	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}


	public String getNombre_evento() {
		return nombre_evento;
	}


	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}
	
	
	



}
