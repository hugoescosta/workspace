import javax.swing.JOptionPane;
public class Q5PrincipalCarro {

	public static void main(String[] args) {
		String marca, cor,resp;
		char resp1 = 's';
		int consumo;
		int capTanque;
		int qtdLitrosTanque  = 0;
		boolean situacaoTanque = false;
		int kmPercorrido;
		int andarCarro;
		int opcao;
		
		Q5carro carroteste = new Q5carro("Fusca");
		
		Q5carro carro01 = new Q5carro();
				
		while (resp1 == 's'){
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "\n1. Cadastrar Veículo"
					+ "\n2. Abastecer Veículo"
					+ "\n3. Andar de Carro"
					+ "\n4. Verificar nivel gasolina"
					+ "\n5. Sair", "Escolha uma opção"));
			if (opcao == 1){
				carro01.cadastrarCarro();				
			}else if (opcao == 2){
				carro01.abastecerCarro();
			}else if (opcao == 3){
				carro01.andar();
			}else if (opcao == 4){
				
			}else if (opcao == 5){
				System.out.println("Saindo....");
				break;
			}

			
			//kmPercorrido = Integer.parseInt(JOptionPane.showInputDialog("Qual a quilometragem percorrida (km)?"));
			
			
			
			//System.out.println("Cor do carro: "+carro01.getCor());
			//System.out.println("Quilometragem percorrida: "+kmPercorrido);
			//System.out.println("Consumo Km/Litro: "+consumo);
			//System.out.println("Quantidade de combustível no tanque: "+carro01.andar(kmPercorrido));
			//resp = JOptionPane.showInputDialog("Cadastrar nova quikilometragem:");
			//resp1 = resp.charAt(0);
			
			
		}
		
	}

}
