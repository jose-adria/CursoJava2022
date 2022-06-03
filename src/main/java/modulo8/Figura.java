package modulo8;


public abstract class Figura {
	// atributos
	private float maximaSuperficie;
	private String nombre;

	// constructores de la clase figura
	public Figura() {
		this.maximaSuperficie = 10;
		this.nombre = " ";
	}

	public Figura(float superficie, String nombre1) {
		this.maximaSuperficie = superficie;
		this.nombre = nombre1;

	}

	// accesos getter y setter
	// get
	public void setMaximaSuperficie(float superficie) {
		maximaSuperficie = superficie;
	}

	public void setNombre(String nombre1) {
		nombre = nombre1;
	}

	// setter
	public float getMaximaSuperficie() {
		return maximaSuperficie;
	}

	public String getNombre() {
		return nombre;

	}
	// Metodos equals,hashCode y to String
	// public boolean equals(Object obj){
	// boolean bln =false;
	// if(obj instanceof Figura){
	// //downcast
	// int i =134;
	// //upcast es automatico
	// long l = i;
	//
	// Figura fig = (Figura)obj;
	// bln = maximaSuperficie == fig.getMaximaSuperficie() &&
	// nombre == fig.getNombre();
	// }
	// return bln;
	// }
	//
	// public String hashCode(){
	// return nombre + maximaSuperficie;
	// }

	public String toString() {
		StringBuilder sb = new StringBuilder("\nnombre=");
		sb.append(nombre);
		sb.append(",maximaSuperficie=");
		sb.append(maximaSuperficie);

		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(maximaSuperficie);
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		if (Float.floatToIntBits(maximaSuperficie) != Float.floatToIntBits(other.maximaSuperficie))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
