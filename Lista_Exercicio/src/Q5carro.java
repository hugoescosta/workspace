import javax.swing.JOptionPane;


public class Q5carro {
	String marca;
	String cor;
	int consumo;
	int capTanque;
	int qtdLitrosTanque, qtdLitrosAbastecer;
	boolean situacaoTanque = false;
	boolean carroExiste = false;
	int kmPercorrido;
	
	

	
	
	
	public void cadastrarCarro(){
		
		marca = JOptionPane.showInputDialog("Qual a marca do carro:");
		cor = JOptionPane.showInputDialog("Qual a cor do carro:");
		capTanque = Integer.parseInt(JOptionPane.showInputDialog("Qual a capacidade do tanque:"));
		consumo = Integer.parseInt(JOptionPane.showInputDialog("Quantos km/litro:"));
		carroExiste = true;
		qtdLitrosTanque = 0;
		JOptionPane.showMessageDialog(null, "Carro Criado!!!", "Alerta!!!", JOptionPane.INFORMATION_MESSAGE);
	}	
	
	public String getCor(){
		return cor;
	}
		
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public void abastecerCarro(){
		if (carroExiste == true){
			qtdLitrosTanque = Integer.parseInt(JOptionPane.showInputDialog("Quanto você deseja abastecer(Litros)?"));
			if  (situacaoTanque != true){
				if (qtdLitrosAbastecer == capTanque){
					situacaoTanque = true;
					qtdLitrosTanque = 45;
					JOptionPane.showMessageDialog(null,"CHEIOOOOOOOOOOOOOOOO!!!","Situação do TANQUE:", JOptionPane.INFORMATION_MESSAGE);
				}else if((qtdLitrosAbastecer + qtdLitrosTanque) < capTanque){
					this.situacaoTanque = false;
					qtdLitrosTanque = qtdLitrosAbastecer + qtdLitrosTanque;
					JOptionPane.showMessageDialog(null,"Seu carro foi abastecido com "+qtdLitrosAbastecer+" litros","Informativo!!!", JOptionPane.INFORMATION_MESSAGE);
				}else if ((qtdLitrosAbastecer + qtdLitrosTanque) > capTanque) {
					JOptionPane.showMessageDialog(null,"Seu carro não suporte essa quantidade de "+qtdLitrosTanque+" litros","ERRO!!!", JOptionPane.INFORMATION_MESSAGE);
				}else{
					situacaoTanque = false;
					JOptionPane.showMessageDialog(null,"Seu carro foi abastecido com "+qtdLitrosAbastecer+" litros","Informativo!!!", JOptionPane.INFORMATION_MESSAGE);
				}
			}else{
				JOptionPane.showMessageDialog(null,"Seu carro já está com TANQUE CHEIO!!!","Situação do TANQUE:", JOptionPane.INFORMATION_MESSAGE);
			}
		}else{
			JOptionPane.showMessageDialog(null, "Carro inexistente!!!", "Alerta!!!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public void andar(){	
		if (carroExiste == true ){
			if (qtdLitrosTanque > 0){
				try{
					kmPercorrido = Integer.parseInt(JOptionPane.showInputDialog("Qual a quilometragem percorrida?"));
					qtdLitrosTanque = this.capTanque - (kmPercorrido / consumo);
					JOptionPane.showMessageDialog(null,"Conforme o que você informou, você percorreu "+kmPercorrido+" então você tem "+qtdLitrosTanque);
					if (qtdLitrosTanque < 0){
						System.out.println("Você deve ter ficado no prego, pois a pacacidade do seu tanque é "+capTanque+" e seu consumo foi "+qtdLitrosTanque);
					}
				}
				catch (Exception e){
					JOptionPane.showMessageDialog(null, "NetDevices list is null - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
				}
			}else{
				JOptionPane.showMessageDialog(null, "Carro está com tanque vazio...");
			}
		}else{
			JOptionPane.showMessageDialog(null, "Carro inexistente!!!", "Alerta!!!", JOptionPane.INFORMATION_MESSAGE);
		}
		

	
	}
	
	
	//Construtor
	public Q5carro(){
	}
	
	public Q5carro(String marca){
		this.marca = marca;
	}
	
	public Q5carro(String marca, String cor, int capTanque, int consumo){
		this.marca = marca;
		this.cor = cor;
		this.capTanque = capTanque;
		this.consumo = consumo;
	}
	
	

}
