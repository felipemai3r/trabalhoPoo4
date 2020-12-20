
public class Tinta {
	private int tipo =0;
	private double valor=0;
	private double rendimento=0;
	private double tamanhoLata=0;
	
	

	public Tinta(int tipo, double valor, double rendimento, double tamanhoLata) {
		this.tipo = tipo;
		this.valor = valor;
		this.rendimento = rendimento;
		this.tamanhoLata = tamanhoLata;
	}

	public void setTipo(int tipo) {
		if(tipo>0)
		this.tipo = tipo;
	}

	public void setValor(double valor) {
		if(valor>0)
		this.valor = valor;
	}
	
	public void setRendimento(double rendimento) {
		if(rendimento>0)
		this.rendimento = rendimento;
	}
	
	public void setTamanhoLata(double tamanhoLata) {
		this.tamanhoLata = tamanhoLata;
	}


	public int getTipo(){
		return tipo;
	}
	public double getValor() {
		return valor;
	}
	public double getRendimento() {
		return rendimento;
	}
	public double getTamanhoLata() {
		return tamanhoLata;
	
	}


	
	public double litros(double AreaTotal) {
		
		return (AreaTotal * this.rendimento);
		
	}
	
	public int quantiLatas(double AreaTotal) {
		return (int)Math.ceil(litros(AreaTotal)/tamanhoLata);
	}
	
	public float valorTotal(double AreaTotal) {
		
		return (float) (quantiLatas(AreaTotal)* this.valor);

	}
	

	public String toString(double Area) {
		StringBuilder builder = new StringBuilder();
		builder.append("\n___Tinta___");
		builder.append("\nTipo:");
		builder.append(tipo);
		builder.append("\nValor Lata: ");
		builder.append(valor);
		builder.append("\nLitros Necessarios: ");
		builder.append(litros(Area));
		builder.append("\nQuantidade de latas: ");
		builder.append(quantiLatas(Area));
		builder.append("\n_______________");
		builder.append("\nValor Total: R$ ");
		builder.append(valorTotal(Area));
		
		return builder.toString();
	}
	
	
	

}
