package ar.edu.unlam.pb2.eva03;

public abstract class Deportista {

private Integer num_socio;
private String nombre;


public Deportista(Integer num_socio, String nombre) {
	super();
	this.num_socio = num_socio;
	this.nombre = nombre;
}


public Integer getNum_socio() {
	return num_socio;
}


public void setNum_socio(Integer num_socio) {
	this.num_socio = num_socio;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((num_socio == null) ? 0 : num_socio.hashCode());
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
	Deportista other = (Deportista) obj;
	if (num_socio == null) {
		if (other.num_socio != null)
			return false;
	} else if (!num_socio.equals(other.num_socio))
		return false;
	return true;
}








}
