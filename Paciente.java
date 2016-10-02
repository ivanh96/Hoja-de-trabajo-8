/**--------------------------------------
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos 
 * Seccion 10
 * -------------------------------------
 * Fredy España 15034
 * Marlon Hernandez 15177
 * -------------------------------------
 * Clase Paciente
 --------------------------------------*/

public class Paciente<E> implements Comparable<E> {
	
	/* Atributos */
	private String nombre;
	private String descripcion;
	private String prioridad;
	
	/* Constructor */
	public Paciente(String nombre_, String descripcion_, String prioridad_){
		nombre = nombre_;
		descripcion = descripcion_;
		prioridad = prioridad_;
	} 
	
	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @return prioridad
	 */
	public String getPrioridad() {
		return prioridad;
	}

	/**
	 * @param nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param prioridad to set
	 */
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public int compareTo(E paciente) {
		String prioridad_ = ((Paciente)paciente).getPrioridad();
		return prioridad.compareTo(prioridad_);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", descripcion=" + descripcion + ", prioridad=" + prioridad + "]";
	}
	
	

	

}
