import javax.swing.*;

public class CalculaArea {

	public static void main(String[] args) {
		Area area = new Area();
		String raio, base, alt;
		while (true){
			String op = JOptionPane.showInputDialog(""
					+ "Escolha uma das opções abaixo:"
					+ "\n1 - Calcula Area Circulo"
					+ "\n2 - Calcula Area Quadrado"
					+ "\n3 - Calcula Area Triângulo");
			int opEscolhida = Integer.parseInt(op);
	
			double resArea = 0;

			switch (opEscolhida) {
				case 1:
					raio = JOptionPane.showInputDialog("Qual o valor da raio?");
					resArea = area.calcArea(Float.parseFloat(raio));
					break;
				case 2:
					base = JOptionPane.showInputDialog("Qual o valor da base?");
					alt = JOptionPane.showInputDialog("Qual o valor da altura?");
					resArea = area.calcArea(Double.parseDouble(base),Double.parseDouble(alt));
					break;
				case 3:
					base = JOptionPane.showInputDialog("Qual o valor da base?");
					alt = JOptionPane.showInputDialog("Qual o valor da altura?");
					resArea = area.calcAreaTriangulo(Double.parseDouble(base),Double.parseDouble(alt));
					System.out.print(resArea);
					break;
					
					default:
						JOptionPane.showMessageDialog(null,  "Opção inválida");
			}
		
		JOptionPane.showMessageDialog(null,  "Área Calculada: "+resArea);
		}
	}

}
