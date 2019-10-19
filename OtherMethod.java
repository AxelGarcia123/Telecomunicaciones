import java.util.ArrayList;
import java.util.List;
public class OtherMethod {
	public void otroMetodo(String mensaje, List<String> binaryMessage, List<Character> message) {
		char[][] characters = new char[4][8];

		System.out.println("Método cíclico\n");
		String binaryCodeMessage = "";
		String letters = "";
		for(int i = 0; i < mensaje.length(); i++) {
			
			String newMessage = binaryMessage.get(i);
			letters += message.get(i);
			if(newMessage.length() == 6)
				newMessage += "0";
			binaryCodeMessage += newMessage;
			//System.out.println(i);
			if((i + 1) % 4 != 0)
				continue;

			int count = 0;
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 7; k++) {
					characters[j][k] = binaryCodeMessage.charAt(count);
					count++;
				}
			}

			String cadena = "";
			for(int j = 0; j < 7; j++) {
				int contador = 0;
				for(int k = 0; k < 4; k++) {
					if(characters[k][j] == '1') {
						contador++;
					}
				}

				if(contador % 2 != 0)
					cadena += "1";
				else
					cadena += 0;
			}

			for(int j = 0; j < 4; j++) {
				System.out.print(letters.charAt(j) + " : ");
				for(int k = 0; k < 7; k++) {
					System.out.print(characters[j][k]);
				}
				System.out.println("");
			}

			System.out.println("    -------\n" + "    " +cadena);
			System.out.println("\n");
			binaryCodeMessage = "";
			letters = "";
		}
	}
}