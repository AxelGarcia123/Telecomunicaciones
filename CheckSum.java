import java.util.ArrayList;
import java.util.List;
public class CheckSum {
	public void checkSum(String mensaje, List<String> binaryMessage, List<Character> message) {
		for(int i = 0; i < mensaje.length(); i++) {
			String binaryCodeMessage1 = binaryMessage.get(i);
			int count = 0;

			if(binaryCodeMessage1.length() == 6)
				binaryCodeMessage1 += "0";
			String penultimateRow = "";
			String lastRow1 = "";
			for(int j = 0; j < binaryCodeMessage1.length(); j++) {
				lastRow1 += "1";
				if(binaryCodeMessage1.charAt(j) == '1')
					penultimateRow += "0";
				else 
					penultimateRow += "1";
			}

			System.out.println("---"+ message.get(i) + "---\n\n" + binaryCodeMessage1 + "\n"+ penultimateRow +"\n-------\n"+ lastRow1 + "\n\n");
		}
	}
}