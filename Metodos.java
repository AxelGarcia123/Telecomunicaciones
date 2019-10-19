import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Metodos {
	public static void main(String[] args) {
		String mensaje = "";
		List<String> binaryMessage = new ArrayList<String>();
		List<Character> message = new ArrayList<>();
		AgregarDatos add = new AgregarDatos();
		VerticalLongitudinal verLong = new VerticalLongitudinal();
		OtherMethod metodo = new OtherMethod();
		CheckSum check = new CheckSum();

		do {
			mensaje = JOptionPane.showInputDialog(null, "Escriba su mensaje");
			if(mensaje.length() == 16) 
				break;
			else
				JOptionPane.showMessageDialog(null, "El mensaje debe tener 16 caracteres", "¡Error!", JOptionPane.ERROR_MESSAGE);
		}while(mensaje.length() != 16);
		mensaje = mensaje.toUpperCase();

		
		add.addDatas(mensaje, binaryMessage, message);
		verLong.verticalLongitudinal(mensaje, binaryMessage, message);
		metodo.otroMetodo(mensaje, binaryMessage, message);
		check.checkSum(mensaje, binaryMessage, message);
	}
}