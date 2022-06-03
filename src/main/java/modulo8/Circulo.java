package modulo8;

 

public class Circulo extends Figura{
	//atributos
	private float radio;
	
//constructor circulo
	public Circulo() {
		super();
		radio = 10;
	}
    public Circulo(float superficie, String nombre1,float radio1) {
    	super(superficie,nombre1);
    	radio = radio1;
    }
 // calcular perimetro
    public float calcularPerimetro() {
		//
		 return 3.14f  * radio;

	}
 //calular superficie
    public float calcularSuperficie() {
     
    	 return 3.14f  * radio * radio;
    }
    
 //get y setter
    public float getRadio() {
    	return(radio);
    }
    
    public void setRadio(float radio) {
    	this.radio = radio;
    }
 //equals,hashCode,toString
    public boolean equals(Object obj){		
		return super.equals(obj) 							&&
				obj instanceof Circulo	&&
				radio == ((Circulo)obj).getRadio();
		
	}
	public int hashCoded(){
		return super.hashCode() + (int)radio;
	}
	
    public String toString(){
    	StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",radio=");
    	sb.append(radio);
    	return sb.toString();
    }

    
    
}
