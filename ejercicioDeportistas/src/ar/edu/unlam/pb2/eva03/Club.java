package ar.edu.unlam.pb2.eva03;

import java.util.*;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.*;

public class Club {

	@SuppressWarnings("unused")
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	
	public Club(String nombre) {
		this.nombre=nombre;
		socios=new HashSet <Deportista>();
		competencias = new HashMap <String,Evento>();
		
	}

	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
		
	}

	public Integer getCantidadSocios(){
		return socios.size();
		
	}

	public void crearEvento(TipoDeEvento tipo, String nombre_evento) {
		
		Evento actual = new Evento (tipo,nombre_evento);
		
		competencias.put(nombre_evento, actual);
				
	}
	
	public Evento verificarEvento(String nombre) {
	
		return this.competencias.get(nombre);
	
	}
	
	public Boolean verificarQueElDeportistaSeaSocio(Deportista deportistaABuscar) {
		
		for (Deportista deportista : socios) {
			
			if(deportista.equals(deportistaABuscar)){
				return true;
			}
		
		}
		
		
		return false;
		
		
	}
	
	public Integer inscribirEnEvento(String nombre, Deportista deportista) throws NoEstaPreparado{
		Evento evento = this.verificarEvento(nombre);
		if(verificarQueElDeportistaSeaSocio(deportista) && evento != null) {
			switch(evento.getTipo()) {
				case CARRERA_5K:
				case CARRERA_10K:
				case CARRERA_21K:
				case CARRERA_42K: 
					if(deportista instanceof ICorredor) {
						return evento.agregarParticipante(deportista);
					} else {
						throw new NoEstaPreparado();
					}
				case DUATLON:
					if(deportista instanceof ICorredor && deportista instanceof ICiclista) {
						return evento.agregarParticipante(deportista);
					} else {
						throw new NoEstaPreparado();
					}
				case CARRERA_NATACION_EN_PICINA:
				case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
					if(deportista instanceof INadador) {
						return evento.agregarParticipante(deportista);
					} else {
						throw new NoEstaPreparado();
					}
				case TRIATLON_SHORT:
				case TRIATLON_OLIMPICO:
				case TRIATLON_MEDIO:
				case TRIATLON_IRONMAN:
					if(deportista instanceof ICorredor && deportista instanceof ICiclista && deportista instanceof INadador) {
						return evento.agregarParticipante(deportista);
					} else {
						throw new NoEstaPreparado();
					}
			}
			
		}
		
		return 55555;
	}

//	public Integer inscribirEnEvento(String nombre, Deportista deportista) throws NoEstaPreparado {
//		// TODO Auto-generated method stub
//		Evento evento = this.verificarEvento(nombre);
//		if(verificarQueElDeportistaSeaSocio(deportista) && evento != null) {
//			if(evento.getTipo() == TipoDeEvento.CARRERA_10K || evento.getTipo() == TipoDeEvento.CARRERA_21K || evento.getTipo() == TipoDeEvento.CARRERA_42K || evento.getTipo() == TipoDeEvento.CARRERA_5K && !((Corredor)deportista instanceof ICorredor)) {
//				throw new NoEstaPreparado();	
//			} else if(evento.getTipo() == TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS || evento.getTipo() == TipoDeEvento.CARRERA_NATACION_EN_PICINA && !(deportista instanceof INadador)) {
//				throw new NoEstaPreparado();		
//			} else if(evento.getTipo() == TipoDeEvento.DUATLON  && !(deportista instanceof ICiclista) || !(deportista instanceof ICorredor)) {
//				throw new NoEstaPreparado();
//			} else if(evento.getTipo() == TipoDeEvento.TRIATLON_IRONMAN || evento.getTipo() == TipoDeEvento.TRIATLON_MEDIO || evento.getTipo() == TipoDeEvento.TRIATLON_OLIMPICO || evento.getTipo() == TipoDeEvento.TRIATLON_SHORT && !(deportista instanceof ICorredor) || !(deportista instanceof INadador)|| !(deportista instanceof ICiclista)) {
//				throw new NoEstaPreparado();	
//			} else {
//				return evento.agregarParticipante(deportista);
//			}
//			
//		}
//		
//		return null;
//	}

//	public Boolean verificarQueEstePreparado(String nombre_evento, Deportista nuevo) throws NoEstaPreparado {
//		if(this.verificarEvento(nombre_evento)!=null) {
//			switch(this.verificarEvento(nombre_evento).getTipo()) {
//			case CARRERA_5K:
//			case CARRERA_10K:
//			case CARRERA_21K:
//			case CARRERA_42K: 
//				if(nuevo instanceof ICorredor) {
//					return true;
//				} else {
//					throw new NoEstaPreparado();
//				}		
//				
//			case DUATLON:
//				if(nuevo instanceof ICorredor && nuevo instanceof ICiclista) {
//					return true;
//				} else {
//					throw new NoEstaPreparado();
//				}
//			case CARRERA_NATACION_EN_PICINA:
//			case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
//				if(nuevo instanceof INadador) {
//					return true;
//				} else {
//					throw new NoEstaPreparado();
//				}
//			case TRIATLON_SHORT:
//			case TRIATLON_OLIMPICO:
//			case TRIATLON_MEDIO:
//			case TRIATLON_IRONMAN:
//				if(nuevo instanceof ICorredor && nuevo instanceof ICiclista && nuevo instanceof INadador) {
//					return true;
//				} else {
//					throw new NoEstaPreparado();
//				}
//			}
//		}
//		return false;
//	
//	}

//	public Integer inscribirEnEvento(String nombre_evento, Deportista nuevo) throws NoEstaPreparado{
//		
//		// verificar que el deportista sea socio
//		//verificar que exista el evento
//		if(this.verificarQueElDeportistaSeaSocio(nuevo) &&
//		this.verificarEvento(nombre) != null) {
//			if(this.verificarQueEstePreparado(nombre_evento, nuevo)){
//				competencias.get(nombre_evento).agregarParticipante(nuevo);
//				return competencias.get(nombre_evento).getParticipantes().size();
//			} else {
//				throw new NoEstaPreparado();
//			}
//			
//		}
//		
//		return 0;
//	
//	}

	
	

	
	
}

