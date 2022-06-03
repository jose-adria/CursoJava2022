package objeto;

public  class CajaDeAhorro extends Cuenta {
	//atributos
	private float interes;
	
	public CajaDeAhorro() {
		super();
		interes =10;		
	}

	public CajaDeAhorro(int pNum, float pSal, float pInteres) {
		super(pNum, pSal);
		interes = pInteres;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}
	
	public boolean equals(Object obj){		
		return super.equals(obj) 							&&
				obj instanceof CajaDeAhorro 				&&
				interes == ((CajaDeAhorro)obj).getInteres();
		
	}
	public int hashCoded(){
		return super.hashCode() + (int)interes;
	}
	
    public String toString(){
    	StringBuilder sb = new StringBuilder(super.toString());
    	sb.append(",interes=");
    	sb.append(interes);
    	return sb.toString();
    }

    
	@Override
	public boolean isEmpty() {
		return super.isEmpty() &&
				interes ==0;
	}

	@Override
	public void debitar(float pValor) {
		if(pValor<=saldo)
			saldo-=pValor; //saldo =saldo - pValor
		
	}
	
}
