package exercicios;
import javax.swing.JOptionPane;
public class Ex_02 {
	public static void main(String args []) {
		int Mat_diagonal[][] = new int [4] [4];
		int l, c;
		for(l=0;l<4;l++) {
			for(c=0;c<4;c++) {
				if(l==c) {
					Mat_diagonal[l][c] = (int) Math.pow(4, l);
				}else {
					Mat_diagonal[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
				}
				//System.out.println(+Mat_diagonal[l][c]);
			}
		}
		for(l=0;l<4;l++) {
			for(c=0;c<4;c++) {
				System.out.print(+Mat_diagonal[l][c]+ " | ");
			}
			System.out.println(" ");
			
	}

}
}
