package modulo8;

public class Cuadrado extends Figura{
	//atributos
	private float lado;
	
//constructor cuadrado
	public Cuadrado() {
		super();
		lado = 10;
	}
    public Cuadrado(float superficie, String nombre1,float lado1) {
    	super(superficie,nombre1);
    	lado = lado1;
    }
 // calcular perimetro
    public float calcularPerimetro() {
		//
		 return 4  * lado;

	}
 //calular superficie
    public float calcularSuperficie() {
     
    	 return lado  * lado;
    }
    
 //get y setter
    public float getlado() {
    	return(lado);
    }
    
    public void setlado(float lado) {
    	this.lado = lado;
    }
 //equals,hashCode,toString
   
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado);
		return result;
	}
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		if (Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado))
			return false;
		return true;
	}

    
    
}


