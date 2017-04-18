import java.util.InputMismatchException;

import javax.swing.JOptionPane;
public class banco_software {

	public static void main(String[] args) {
		
		String montoString;
		double monto=0;
		boolean val;
		
	  do{
			try {
				montoString=JOptionPane.showInputDialog("Ingrese el monto a depositar");
				monto=Double.parseDouble(montoString);
				val = true;
			} catch (java.lang.NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Porfavor, ingrese unicamente numeros", "Error...", JOptionPane.ERROR_MESSAGE);
				val = false;
			}catch (java.lang.NullPointerException e) {
				int respuesta = JOptionPane.showConfirmDialog(null, "Desea cancelar la transaccion en curso?", "SALIR...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(respuesta==0){
					JOptionPane.showMessageDialog(null, "Transaccion cancelada, proximo cliente.", "Error...", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				val = false;
			}
	  }while(!val);
	}
}