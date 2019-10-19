import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class VerticalLongitudinal {
	public void verticalLongitudinal(String mensaje, List<String> binaryMessage, List<Character> message) {
		Stack<Character> stack = new Stack<Character>();
		String lastRow = "";

		System.out.println("Método vertical y Longitudinal\n");
		for(int i = 0; i < mensaje.length(); i++) {
			String cero = "0 ";
			String one = "1 ";
			String binaryCodeMessage = binaryMessage.get(i);
			int count = 0;

			for(int j = 0; j < binaryCodeMessage.length(); j++) {
				if(binaryCodeMessage.charAt(j) == '1')
					count++;
				else 
					continue;
			}

			if(count % 2 == 0) {
				lastRow += cero;
				cero += binaryMessage.get(i);
				System.out.println(message.get(i) + ": " + cero);
			}
			else {
				lastRow += one;
				one += binaryMessage.get(i);
				System.out.println(message.get(i) + ": " + one);
			}

			if((i + 1) % 4 == 0) {
				int k = 0;
				String auxRow = lastRow;
				while(k < lastRow.length()) {
					stack.push(lastRow.charAt(k));
					k++;
				}

				k = 0;
				lastRow = "";
				while(k < auxRow.length()) {
					lastRow += stack.pop();
					k++;
				}

				String ceros = "000";
				ceros += lastRow;
				lastRow = ceros.replace(" ", "");


				System.out.println("     -------\n" + "     " +lastRow);
				System.out.println("\n");
				lastRow = "";
			}
		}		
	}
}