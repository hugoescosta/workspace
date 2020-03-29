import javax.swing.JOptionPane;


public class CadastroPrecos {
	public static void main(String[] args){
		int registros;
		double soma = 0;
		
		registros = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de registros para cadastrar? "));
		double[] precos = new double[registros];
		
		for (int i = registros - 1; i >=0 ; i -= 1){
			try{
				precos[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preco: "));
				soma = soma + precos[i];
			} catch (Exception e){
				JOptionPane.showMessageDialog(null,"Valor digitado inválido!!!");
				i = i + 1;
			}

		}
		
		for (int i = registros - 1; i >=0 ; i--){
			JOptionPane.showMessageDialog(null,"Os preços cadastrados: "+precos[i]);
		}
		JOptionPane.showMessageDialog(null,"A soma dos preços: "+soma);
		
	}
}
