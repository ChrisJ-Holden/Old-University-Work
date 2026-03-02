
public class WordProcessor implements Counter{
	private String text = "Example Text";
	
	public int countWords(String sentence) {
		
		return checkString(sentence).split(" ").length;
	}
	public int countLetters(String sentence) {
		return checkString(sentence).replace(" ","").toCharArray().length;
	}
	
	public int getLength(String sentence) {
		
		return checkString(sentence).length();
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String checkString (String sentence) {
		if (sentence == null) {
			sentence = this.text;
		}
		return sentence;
	}
}
