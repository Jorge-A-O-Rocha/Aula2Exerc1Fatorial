package view;
import controller.modulos;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		 modulos mod = new modulos();
		 int x ;
         x= Integer.parseInt(JOptionPane.showInputDialog("Descubra o fatorial de "));
         while (x < 0 || x > 12) {
        	 x= Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre 0 e 12 "));
         }
         System.out.println("Fatorial = "+  mod.ffat(x));

	}

}
