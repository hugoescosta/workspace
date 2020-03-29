import java.util.Scanner;
public class Questao03 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		String nome,sexo;
		int masculino = 0, feminino = 0,outros = 0, idade = 0;
		
		for (int i = 0; i < 4; i++){
			//System.out.println("Digite o seu nome:");
			//nome = entrada.next();
			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();
			System.out.println("Digite o seu sexo: (M)asculino ou (F)eminino");
			sexo = entrada.next();
			
			if (idade >= 18){
				if (sexo.equalsIgnoreCase("M")){
					masculino = masculino + 1;
				}else if(sexo.equalsIgnoreCase("F")) {
					feminino = feminino + 1;
				}else{
					outros = outros + 1;	
				}
			}
		}
		
		System.out.println("Mulheres maiores de 18:"+feminino);
		System.out.println("Homens maiores de 18:"+masculino);
		System.out.println("Outros maiores de 18:"+outros);
		
		


	}

}
