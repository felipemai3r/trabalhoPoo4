public class Cone {
	
	private float alturaCone;
	private float raioCone;
	private int tipo;
	
	public Cone() {
		}
	
	public Cone(float alturaCone, float raioCone, int tipo) {
		this.alturaCone = alturaCone;
		this.raioCone = raioCone;
		this.tipo = tipo;
		
	}
	
	public Cone(float alturaCone, float raioCone) {
		this.alturaCone = alturaCone;
		this.raioCone = raioCone;
		
	}
	
	
	
	public float getalturaCone() {
		return alturaCone;
	}
	public void setalturaCone(float alturaCone) {
		if(alturaCone > 0 )
			this.alturaCone = alturaCone;

	}
	public float getRaioCone() {
		
		return raioCone;
	}
	public void setRaioCone(float raioCone) {
		if(raioCone > 0)
		this.raioCone = raioCone;
	}
	public int getTipo() {
		
		return tipo;
	}
	public void setTipo(int tipo) {
		if(tipo > 0 && tipo <= 4)
		this.tipo = tipo;
	}
	
	
	// Metodos Adicionais
	
	// -> Calcular Geratriz do Cone
	public float geratrizCone() {
		if (this.alturaCone > 0 && this.raioCone > 0)
			return (float) Math.sqrt((this.alturaCone * this.alturaCone ) + (this.raioCone * this.raioCone));
		
		else
			return (float)0.0;
	}
	
	// -> Area Total do Cone 
	
	public float areaTotalCone() {
		float areaT = (float)(3.14 * this.raioCone *(this.raioCone + geratrizCone()) );
		 
		return areaT;
		
	}
	
	// -> area Circulo (base do cone)
	public float areaCirculo() {
		return (float)(3.14 * (this.raioCone * this.raioCone) );
			
	}
	
	// -> Area  lateral do circulo 
	public float arealateral() {
		return (float)(3.14 * raioCone * geratrizCone());
	}
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Altura: ");
		builder.append(alturaCone);
		builder.append("\nRaio: ");
		builder.append(raioCone);
		builder.append("\n_______________");
		builder.append("\nGeratriz: ");
		builder.append(geratrizCone());
		builder.append("\n_______________");
		builder.append("\nArea Total do Cone =");
		builder.append(areaTotalCone());
		builder.append("\nArea do Fundo Cone =");
		builder.append(areaCirculo());
		builder.append("\nArea Lateraldo Cone ");
		builder.append(arealateral());
		return builder.toString();
	}
	
	
	
	
	
	
	
	
}
