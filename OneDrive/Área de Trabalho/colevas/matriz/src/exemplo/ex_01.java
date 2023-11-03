package exemplo;
import javax.swing.JOptionPane;
public class ex_01 {
	public static void main (String args[]) {
		int Mat[][] = new int [2][2];
		int l,c;
		for (l=0;l<2;l++) {
			for(c=0;c<2;c++) {
				Mat[l][c]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
				System.out.println("Mat[" +l+ "][" +c+ "]="+Mat[l][c]);
			}
		}
		
	}

}
