import java.util.List;
public class AgregarDatos {
	public void addDatas(String mensaje, List<String> binaryMessage, List<Character> message) {
		for(int i = 0; i < mensaje.length(); i++) {
			message.add(mensaje.charAt(i));
			binaryMessage.add(String.valueOf(Integer.toBinaryString(mensaje.codePointAt(i))));
		}
	}
}