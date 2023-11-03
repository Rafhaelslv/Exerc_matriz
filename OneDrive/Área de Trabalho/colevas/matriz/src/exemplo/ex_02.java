package exemplo;
import javax.swing.JOptionPane;
public class ex_02 {
public static void main(String args[]) {
	int matriz [][] = new int [4][4];
	int opc=0;
	while(opc!=9) {
	opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Matriz \n  2 - Mostra Matriz \n 9 - Fim"));
	switch(opc){
	case 1 :
		matriz = Carregamatriz(matriz);
		break;
	case 2 :
		matriz = mostramatriz(matriz);
		break;
	
	case 9 :
		JOptionPane.showMessageDialog(null,"Fim");
		System.exit(0);
		break;
	default:JOptionPane.showMessageDialog(null,"OPÇÃO INVALIDA");
}
}
}
	public static int[][]Carregamatriz(int mat[][]){
		int l,c;
		for(l=0;l<4;l++) {
			for(c=0;c<4;c++) {
				mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			}
		}
		return mat;
	}
	public static int[][] mostramatriz(int mat[][]){
		int l,c;
		for(l=0;l<4;l++) {
			for(c=0;c<4;c++) {
				System.out.print(+mat[l][c]+ " | ");
			}
			System.out.println(" ");
	}
		return mat;
	}
}

