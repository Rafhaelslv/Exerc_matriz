package exercicios;

public class Ex_04 {
public static void main (String args[]) {
int Mat[][] = new int [8][8];
int l, c, z;
	for(z=1;z<=4;z++) {
		for(l=(z-1);l<=(8-z);l++) {
			for(c=(z-1);c<=(8-z);c++) {
				Mat[l][c] = z;
			}
		}
	
	}
	
	for(l=0;l<8;l++) {
		for(c=0;c<8;c++) {
			System.out.print(+Mat[l][c]+ " | ");
		}
		System.out.println(" ");
}
}
}
