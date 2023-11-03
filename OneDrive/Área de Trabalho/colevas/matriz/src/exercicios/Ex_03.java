package exercicios;
public class Ex_03 {
public static void main(String args[]) {
	float Mat_casa[][] = new float [8][8];
	float soma=0,stodos=0;
	int l ,c;
	for(l=0;l<8;l++) {
		for(c=0;c<8;c++) {
				if(soma==0) {
					soma++;
				Mat_casa[l][c] = soma;
				}else {
				soma = soma+soma;
				Mat_casa[l][c] = soma;
				}
			stodos=stodos+soma;
			}
	}
		for(l=0;l<8;l++) {
			for(c=0;c<8;c++) {
				System.out.println(+Mat_casa[l][c]);
			}
		}
		System.out.println("soma dos valores: " +stodos);
}

}







