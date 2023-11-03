package exemplo;
import javax.swing.JOptionPane;
/*8.    Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos 
em 4 semanas. Calcular e exibir: 
a.    A quantidade de cada produto vendido no mês; 
b.    A quantidade de produtos vendidos por semana; 
c.    O total de produtos vendidos no mês. 
*/
public class teste 
{
    public static void main(String[] args) 
    {
        int matriz [][] = new int [4][3];
        int x , y , somaS = 0, somaM=0;
        for (x = 0; x <= 3; x++)
        {
            for( y= 0; y <=2; y++)
            {
                matriz[x][y]= Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
                System.out.println("Na semana: " + x + "Quantidade de cada produto vendido no mes " + matriz[x][y]);
                somaS += matriz[x][y];
            }
            System.out.println("A quantidade de produtos vendidos por semana: " + somaS);
            somaM = somaM + somaS;
            somaS=0;
        }
        System.out.println("O total de produtos vendido no mes: " +somaM);
    }

}