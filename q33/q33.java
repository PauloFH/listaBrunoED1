package q33;
import java.util.ArrayList;
import java.util.List;

public class q33 {
	
	class Let{
		private char letter;
		private int quant;

		public Let(char c) {
			this.letter = c;
		}
		public char getLetter() {
			return this.letter;
		}
		public void setLetter(char letter) {
			this.letter = letter;
		}
		public int getQuant() {
			return this.quant;
		}
		public void setQuant(int quant) {
			this.quant = quant;
		}
}
	
	public static void main(String args[]) {
		String word = "casa";
		final char[] wordChar = word.toCharArray();
		List<Let> l = new ArrayList<Let>();
		if(wordChar.length > 1) {
			for(int i=1;i<wordChar.length;i++) {
				for(int o=0;o<l.size();o++) {
					if(wordChar[i] != l.get(o).getLetter()) {
						l.add(new Let(wordChar[i]));
					}
				}
			}
		}
	}
}