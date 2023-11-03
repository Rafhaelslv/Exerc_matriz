package exercicios;
import javax.swing.JOptionPane;
public class Ex_01 {
public static void main(String args[]) {
	int Mat_Produto[][] = new int [4][3];
	int l,c,qtmes=0,qtsem=0,total=0;
	for(l=0;l<4;l++) {
		for(c=0;c<3;c++) {
			Mat_Produto[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos"));
			System.out.println("Mat[" +l+ "][" +c+ "]="+Mat_Produto[l][c]);
			total = total + Mat_Produto[l][c];
		}
	}
	for(l=0;l<4;l++) {
		qtsem = 0;
		for(c=0;c<3;c++) {
			qtsem = qtsem + Mat_Produto[l][c];
		}
			System.out.println("Produtos vendidos na semana: " +(l+1)+ " : "+qtsem);
	}
	for(c=0;c<3;c++) {
		qtmes = 0;
		for(l=0;l<4;l++) {
			qtmes = qtmes + Mat_Produto[l][c];
		}
			System.out.println("Quantidade do produto" +(c+1)+ "vendido no mes: "+qtmes);
	}
	System.out.println("Total no mes");
	}
}

