package ExerciciosSatoshi;

import javax.swing.JOptionPane;
public class Exercicio3 {
   public static void main (String args []) {
	   // Vari�veis
	   double N;
	   
	   //Entrada de dados
	   N = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
	   
	   //Sa�da de dados
	   System.out.println(Serie3(N));
   }

 //fun��o recursiva
private static double Serie3(double n) {
	if(n <= 0) {
		return 0;
	}
	return 1/n + Serie3(n -1);
}
}
