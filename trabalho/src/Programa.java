/* Para que podesemos reutilizar os codigos prontos, criei dois documentos de cone sendo um o Cone.java e o ConeDois.java

	-- Cone.java ele tera apenas as informações de calculos para o Cone, assim podendo ser reutilizado em proximos projetos. o Calculo 
	de valores ficaria em responsabilidade de Tinta.java. Desta forma podendo utilizar o principio de reutilização da orientação a 
	Objetos
	
	-- ConeDois.java sera com os calculos do cone e das tintas todos juntos, dificultando o uso em proximos programas que não seram de 
	tinta 
	

*/



public class Programa {
	// definindo as constantis 
	public static double rendimentoLata = 3.45;
	public static double tamanhoLata = 18;
	
	public static void main(String[] args) {
		// definindo os objetos de tinta
		Tinta tipo1 = new Tinta(1, 238.90,rendimentoLata, tamanhoLata);
		Tinta tipo2 = new Tinta(2, 467.98,rendimentoLata, tamanhoLata);
		Tinta tipo3 = new Tinta(3, 758.34,rendimentoLata, tamanhoLata);
		
		
		Cone c1 = new Cone(8, 6, 1);
		Cone c2 = new Cone(9, (float)3.5, 2);
		Cone c3 = new Cone((float)13.9, 20, 2);
		Cone c4 = new Cone((float)16.53, (float)37.78, 3);
		
		// para o C1 
		System.out.println("---- Cone 1 ----");
		System.out.println(c1);
		if(c1.getTipo() == 1) {
			System.out.println(tipo1.toString(c1.areaTotalCone()));
		}
		else if(c1.getTipo() == 2) {
			System.out.println(tipo2.toString(c1.areaTotalCone()));
		}
		else {
			System.out.println(tipo3.toString(c1.areaTotalCone()));
		}
		// para o C2 
		System.out.println("\n\n---- Cone 2 ----");
		System.out.println(c2);
		if(c2.getTipo() == 1) {
			System.out.println(tipo1.toString(c2.areaTotalCone()));
		}
		else if(c2.getTipo() == 2) {
			System.out.println(tipo2.toString(c2.areaTotalCone()));
		}
		else {
			System.out.println(tipo3.toString(c2.areaTotalCone()));
		}				
				
		// para o C3
		System.out.println("\n\n---- Cone 3 ----");
		System.out.println(c3);
		if(c3.getTipo() == 1) {
			System.out.println(tipo1.toString(c3.areaTotalCone()));
		}
		else if(c2.getTipo() == 2) {
			System.out.println(tipo2.toString(c3.areaTotalCone()));
		}
		else {
			System.out.println(tipo3.toString(c3.areaTotalCone()));
		}					
		
		// para o C3
		System.out.println("\n\n---- Cone 4 ----");
		System.out.println(c4);
		if(c4.getTipo() == 1) {
			System.out.println(tipo1.toString(c4.areaTotalCone()));
		}
		else if(c4.getTipo() == 2) {
			System.out.println(tipo2.toString(c4.areaTotalCone()));
		}
		else {
			System.out.println(tipo3.toString(c4.areaTotalCone()));
		}	
				
	}

}
